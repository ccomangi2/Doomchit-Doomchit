package com.example.doomchit_doomchit;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;

import java.io.File;
import java.util.ArrayList;

public class RecordListAdapter extends RecyclerView.Adapter<RecordListAdapter.ViewHolder> implements OnRecordListClickListener {
    Context context;
    private ArrayList<RecordList> mList = new ArrayList<RecordList>();
    OnRecordListClickListener listener;
    MediaPlayer mMediaPlayer;

    public RecordListAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.record_list_item,parent,false);
        return new ViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        RecordList item = mList.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void setOnItemClicklistener(OnRecordListClickListener listener){
        this.listener = listener;
    }
    @Override
    public void onItemClick(ViewHolder holder, View view, int position) {
        if(listener != null) {
            listener.onItemClick(holder,view,position);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public CardView cardView;
        public TextView time_textview;
        public TextView title_textview;
        public TextView name_textview;
        public ImageButton play;
        public ImageButton share;
        public ImageView list_img;
        public ViewHolder(@NonNull View itemView, RecordListAdapter recordListAdapter) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            time_textview = itemView.findViewById(R.id.time_textview);
            title_textview = itemView.findViewById(R.id.title_textview);
            name_textview = itemView.findViewById(R.id.name_textview);
            play = itemView.findViewById(R.id.play);
            share = itemView.findViewById(R.id.share);
            list_img = itemView.findViewById(R.id.list_img);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if(listener != null) {
                        listener.onItemClick(ViewHolder.this, v, position);
                        list_img.setImageResource(R.drawable.list_txtselectbox);
                    }
                }
            });

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAbsoluteAdapterPosition();
                    File[] files = RecordListActivity.getFiles();
                    Toast.makeText(context, position+" : "+files[position].getName(), Toast.LENGTH_SHORT).show();
                    audioPlayer(files, position);

                }
            });
            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "공유", Toast.LENGTH_SHORT).show();
                }
            });
        }

        public void setItem(RecordList item) {
            time_textview.setText(item.getTime());
            title_textview.setText(item.getTitle());
            name_textview.setText(item.getName());
        }
    }
    public void audioPlayer(File[] files, int position){
        MediaPlayer mp = MediaPlayer.create(context, Uri.fromFile(files[position]));
        try {
            mp.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addItem(RecordList item){ mList.add(item); }
    public void setItems(ArrayList<RecordList> items){ this.mList = items; }
    public RecordList getItem(int position){ return mList.get(position); }
    public void setItem(int position, RecordList item){ mList.set(position,item); }
}
