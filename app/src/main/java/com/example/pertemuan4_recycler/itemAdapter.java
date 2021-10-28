package com.example.pertemuan4_recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.ItemViewHolder>{
    private ArrayList<item> dataList;
    public itemAdapter(ArrayList<item> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public itemAdapter.ItemViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_film, parent, false);
        return new ItemViewHolder(view);
    }
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.Logo.setImageResource(dataList.get(position).getLogo());
        holder.txtjudulfilm.setText(dataList.get(position).getJudulfilm());
        holder.txtsutradara.setText(dataList.get(position).getSutradara());
        holder.txtgenre.setText(dataList.get(position).getGenre());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView txtjudulfilm, txtsutradara, txtgenre;
        private ImageView Logo;
        public ItemViewHolder(View itemView) {
            super(itemView);
            Logo = (ImageView)
                    itemView.findViewById(R.id.img_logo);
            txtjudulfilm = (TextView)
                    itemView.findViewById(R.id.txt_judulfilm);
            txtsutradara = (TextView)
                    itemView.findViewById(R.id.txt_sutradara);
            txtgenre = (TextView)
                    itemView.findViewById(R.id.txt_genre);
        }
    }
}
