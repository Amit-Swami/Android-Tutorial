package com.amitmps.dell.androidtutorials;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class List15DataAdapter extends RecyclerView.Adapter<List15DataAdapter.DataViewHolder> {
    Context context;
    List<List15DataClass> itemlist;

    public List15DataAdapter(Context context, List<List15DataClass> itemlist) {
        this.context = context;
        this.itemlist = itemlist;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list15single_item,parent,false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        holder.Title.setText(itemlist.get(position).getTitle());
        holder.Description.setText(itemlist.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
       TextView Title,Description;
        public DataViewHolder(View itemView) {
            super(itemView);
            Title=itemView.findViewById(R.id.list15t1);
            Description=itemView.findViewById(R.id.list15t2);
        }
    }
}