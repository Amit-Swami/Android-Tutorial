package com.amitmps.dell.androidtutorial;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amitmps.dell.androidtutorial.Interface.ItemOnClickListener;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Tab2Adapter extends RecyclerView.Adapter<Tab2Adapter.ViewHolder> {

    Context context;
    List<Tab2ModelClass> itemlist;

    public Tab2Adapter(Context context, List<Tab2ModelClass> itemlist) {
        this.context = context;
        this.itemlist = itemlist;
    }

    @NonNull
    @Override
    public Tab2Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list,parent,false);
        return new Tab2Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Tab2Adapter.ViewHolder holder, int position) {
        holder.listname.setText(itemlist.get(position).getName());
        Picasso.with(context).load(itemlist.get(position).getImage())
                .into(holder.listimage);
        holder.setItemOnClickListener(new ItemOnClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                Intent intent = new Intent(context, CommonCode.class);
                intent.putExtra("Position", itemlist.get(position).getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
        TextView listname;
        ImageView listimage;
        private ItemOnClickListener itemOnClickListener;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            listname=itemView.findViewById(R.id.textview1);
            listimage=itemView.findViewById(R.id.imageviewlist);
            itemView.setOnClickListener(this);
        }

        public void setItemOnClickListener(ItemOnClickListener itemOnClickListener) {
            this.itemOnClickListener = itemOnClickListener;
        }

        @Override
        public void onClick(View view) {
            itemOnClickListener.onClick(view,getAdapterPosition(),false);
        }
    }
}