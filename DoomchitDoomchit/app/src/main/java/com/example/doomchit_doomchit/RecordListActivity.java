package com.example.doomchit_doomchit;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.AudioFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sdsmdg.harjot.crollerTest.utilities.Utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RecordListActivity extends AppCompatActivity {
    private ArrayList<RecordList> mArrayList;

    private RecordListAdapter mAdapter;
    ImageButton back; // 뒤로가기
    static File[] files;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_recordlist);
        File path = getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        files = path.listFiles();

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        mArrayList = new ArrayList<RecordList>();
        mAdapter = new RecordListAdapter(getApplicationContext());

        for (int i=0; i< files.length; i++) {
            String[] info = files[i].getName().split("_");
            mAdapter.addItem(new RecordList(timeFormat(info[1]),info[2],info[3].substring(0,info[3].length()-4)));
        }
        mAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(mAdapter);


        mAdapter.setOnItemClicklistener(new OnRecordListClickListener() {
            @Override
            public void onItemClick(RecordListAdapter.ViewHolder holder, View view, int position) {

                RecordList item = mAdapter.getItem(position);
                Toast.makeText(getApplicationContext(), position + "번 눌림", Toast.LENGTH_SHORT).show();


            }
        });

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoveActivity(MainActivity.class);
            }
        });

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    // 액티비티 이동 메서드
    public void MoveActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    protected String timeFormat(String second){
        int time = Integer.parseInt(second);
        String min = String.valueOf(time/60);
        String sec = String.valueOf(time%60);
        if(min.length()==1) min = "0"+min;
        if(sec.length()==1) sec = "0"+sec;
        return min+":"+sec;
    }

    public static File[] getFiles() {
        return files;
    }
}
