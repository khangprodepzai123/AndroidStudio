package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class HoatDongAdapter extends RecyclerView.Adapter<HoatDongAdapter.ViewHolder> {

    private final List<HoatDong> list;
    private final Context context;

    public HoatDongAdapter(Context context, List<HoatDong> list) {
        this.context = context;
        this.list = list;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvTime;

        public ViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvTime = itemView.findViewById(R.id.tvTime);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hoatdong, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        HoatDong hd = list.get(position);
        holder.tvTitle.setText(hd.getTieuDe());
        holder.tvTime.setText(hd.getThoiGian());

        holder.itemView.setOnClickListener(v -> {
            Intent i = new Intent(context, Item4Activity.class);
            i.putExtra("hoatdong", hd.getTieuDe() + " - " + hd.getThoiGian());
            context.startActivity(i);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
