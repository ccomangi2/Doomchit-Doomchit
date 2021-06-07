package com.example.doomchit_doomchit;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BeatSelectActivity extends AppCompatActivity {
    ImageButton back, original_btn, pop_hiphop_btn, classic_btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_select);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoveActivity(MainActivity.class);
            }
        });

        original_btn = findViewById(R.id.original_btn);
        original_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoveActivity(BeatMakingActivity.class);
            }
        });

        pop_hiphop_btn = findViewById(R.id.pop_hiphop_btn);
        pop_hiphop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoveActivity(BeatMakingActivity.class);
            }
        });

        classic_btn = findViewById(R.id.classic_btn);
        classic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoveActivity(BeatMakingActivity.class);
            }
        });
    }

    // 액티비티 이동 메서드
    public void MoveActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}
