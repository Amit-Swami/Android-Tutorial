package com.amitmps.dell.androidtutorials;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.View;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;

import static android.content.ContentValues.TAG;

public class Draw extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {

    InterstitialAd minterstitialAd;
    GridView mygrid;
    Button dialogbt1,dialogbt2;
    public void showDialog(){
        final Dialog dialog=new Dialog(Draw.this);
        dialog.setContentView(R.layout.dialogaskme);
        dialogbt1=dialog.findViewById(R.id.b1);
        dialogbt2=dialog.findViewById(R.id.b2);
        dialogbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });
        dialogbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_SUBJECT,"Android Tutorial");
                intent.putExtra(Intent.EXTRA_TEXT,"");
                intent.setType("message/rfc822");
                Intent chooser=Intent.createChooser(intent,"Send Email");
                startActivity(chooser);
            }
        });
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this, "ca-app-pub-4386795674493212/6019712974", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                minterstitialAd = interstitialAd;
                Log.i(TAG, "onAdLoaded");
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                Log.i(TAG, loadAdError.getMessage());
                minterstitialAd = null;
            }
        });
        /*interstitialAd=new InterstitialAd(Draw.this);
        interstitialAd.setAdUnitId("ca-app-pub-4386795674493212/6019712974");
        interstitialAd.loadAd(new AdRequest.Builder().build());

        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });*/

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout=findViewById(R.id.tablayout);
        ViewPager viewPager=findViewById(R.id.viewpager);

        PagerAdapter pagerAdapter=new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.draw, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       if (id == R.id.menu_rateApp) {
           Uri uri1=Uri.parse("market://details?id=" +getPackageName());
           Intent intent=new Intent(Intent.ACTION_VIEW,uri1);
           startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_android) {

            if(minterstitialAd!=null){
                minterstitialAd.show(Draw.this);
            }
            else {
                Toast.makeText(this, "Ad was'nt load yet", Toast.LENGTH_SHORT).show();
            }

            // Handle the camera action
        } else if (id == R.id.nav_rateapp) {
            Uri uri1=Uri.parse("market://details?id=" +getPackageName());
            Intent intent=new Intent(Intent.ACTION_VIEW,uri1);
            startActivity(intent);

        } else if (id == R.id.nav_askme) {
            showDialog();

        } else if (id == R.id.nav_share) {
            Intent intent=new Intent(Intent.ACTION_SEND);
            final String appPackagename=getApplicationContext().getPackageName();
            String strApplink="";

            try
            {
                strApplink="http://play.google.com/store/apps/details?id=" + appPackagename;
            }
            catch (ActivityNotFoundException a){
                strApplink="http://play.google.com/store/apps/details?id=" + appPackagename;
            }
            intent.setType("text/link");
            String sharebody="Hey there! Download the Android Tutorial app to learn codes with real demo & quiz feature and boost your skills\n"+
                    "\n"+
                    "Download the app:\n"+strApplink;
            String sharesub="Android Tutorial";
            /*intent.putExtra(Intent.EXTRA_SUBJECT,strApplink);*/
            intent.putExtra(Intent.EXTRA_TEXT,sharebody);
            startActivity(intent);

        } else if (id == R.id.nav_privacypolicy) {
            Uri uri = Uri.parse("https://numerous-saddle.000webhostapp.com/privacy_policy.html"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
