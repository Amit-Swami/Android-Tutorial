package com.amitmps.dell.androidtutorial;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Vibrator;
import androidx.annotation.Nullable;

public class List12Vibrate extends Service {
    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Vibrator vibrator= (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(3000);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
