package com.example.doomchit_doomchit;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecordListActivity extends AppCompatActivity {
    private ArrayList<RecordList> mArrayList;

    private RecordListAdapter mAdapter;
    ImageButton back; // 뒤로가기

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_recordlist);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        mArrayList = new ArrayList<RecordList>();

        for(int i=0; i<5; i++) {
            mArrayList.add(new RecordList("00:00", "녹음 제목이오", "이수빈"));
        }

        mAdapter = new RecordListAdapter(mArrayList);
        recyclerView.setAdapter(mAdapter);

        mAdapter.notifyDataSetChanged();

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoveActivity(MainActivity.class);
            }
        });
    }

    // 액티비티 이동 메서드
    public void MoveActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}
