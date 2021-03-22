package com.example.doomchit_doomchit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;

import java.util.ArrayList;

public class RecordListAdapter extends RecyclerView.Adapter<RecordListAdapter.ItemViewHolder> {

    private ArrayList<RecordList> mList;
    private int position;

    public RecordListAdapter(ArrayList<RecordList> mList) {
        this.mList = mList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.record_list_item, parent, false);

        ItemViewHolder viewHolder = new ItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.onBind(mList.get(position));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        holder.play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        public CardView cardView;
        public TextView time_textview;
        public TextView title_textview;
        public TextView name_textview;
        public ImageButton play;
        public ImageButton share;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            this.cardView = itemView.findViewById(R.id.cardView);
            this.time_textview = itemView.findViewById(R.id.time_textview);
            this.title_textview = itemView.findViewById(R.id.title_textview);
            this.name_textview = itemView.findViewById(R.id.name_textview);
            this.play = itemView.findViewById(R.id.play);
            this.share = itemView.findViewById(R.id.share);
        }
        public void onBind(RecordList recordList) {
            time_textview.setText(recordList.getTime());
            title_textview.setText(recordList.getTitle());
            name_textview.setText(recordList.getName());
        }
    }
}
