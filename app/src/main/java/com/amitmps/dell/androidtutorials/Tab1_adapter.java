package com.amitmps.dell.androidtutorials;

import android.content.Context;
import android.content.Intent;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Tab1_adapter extends RecyclerView.Adapter<Tab1_adapter.Tab1ViewHolder> {
    Context context;
    List<Tab1_data> itemlist;

    public Tab1_adapter(Context context, List itemlist) {
        this.context = context;
        this.itemlist = itemlist;
    }

    @Override
    public Tab1ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tab1_recyclerview_single_item, parent, false);
        return new Tab1ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Tab1ViewHolder holder, final int position) {
        holder.mimages.setImageResource(itemlist.get(position).getImages());
        holder.mnames.setText(itemlist.get(position).getNames());
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position)
                {
                    case 0:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid1.class));
                        break;
                    case 1:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid2.class));
                        break;
                    case 2:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid3.class));
                        break;
                    case 3:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid4.class));
                        break;
                    case 4:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid5.class));
                        break;
                    case 5:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid6.class));
                        break;
                    case 6:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid7.class));
                        break;
                    case 7:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid8.class));
                        break;
                    case 8:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid9.class));
                        break;
                    case 9:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid10.class));
                        break;
                    case 10:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid11.class));
                        break;
                    case 11:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid12.class));
                        break;
                    case 12:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid13.class));
                        break;
                    case 13:
                        view.getContext().startActivity(new Intent(view.getContext(),Tab1Grid14.class));
                        break;

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }

    class Tab1ViewHolder extends RecyclerView.ViewHolder {
        ImageView mimages;
        TextView mnames;
        CardView cv;


        public Tab1ViewHolder(View view) {
            super(view);

            mimages = view.findViewById(R.id.tab1imageview);
            mnames = view.findViewById(R.id.tab1textview);
            cv=view.findViewById(R.id.tab1cardview);
        }
    }
}