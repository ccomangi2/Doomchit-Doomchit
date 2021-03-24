package com.example.doomchit_doomchit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BeatMakingActivity extends AppCompatActivity implements View.OnClickListener{
    Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.glow_anim);
    ImageButton back; // 뒤로가기
    ImageButton beatvolum1; Button beat1, beat2, beat3, beat4, beat5, beat6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //                     WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_beatmaking);
        //Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.glow_anim);

        // 1번째 트랙
        beatvolum1 = findViewById(R.id.beatvolum1);
        beat1 = findViewById(R.id.beat1);
        beat2 = findViewById(R.id.beat2);
        beat3 = findViewById(R.id.beat3);
        beat4 = findViewById(R.id.beat4);
        beat5 = findViewById(R.id.beat5);
        beat6 = findViewById(R.id.beat6);

        beatvolum1.setOnClickListener(this);
        beat1.setOnClickListener(this);
        beat2.setOnClickListener(this);
        beat3.setOnClickListener(this);
        beat4.setOnClickListener(this);
        beat5.setOnClickListener(this);
        beat6.setOnClickListener(this);

        // 2번째 트랙

        // 3번째 트랙

        // 4번째 트랙

        // 5번째 트랙

        // 6번째 트랙

        // 7번째 트랙

        // 8번째 트랙

        //뒤로가기
        back = findViewById(R.id.back);
        back.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.back :
                MoveActivity(MainActivity.class);
                break;
            case R.id.beatvolum1:
                break;
            case R.id.beat1:
                beat1.startAnimation(startAnimation);
                break;
            case R.id.beat2:
                beat2.startAnimation(startAnimation);
                break;
            case R.id.beat3:
                beat3.startAnimation(startAnimation);
                break;
            case R.id.beat4:
                beat4.startAnimation(startAnimation);
                break;
            case R.id.beat5:
                beat5.startAnimation(startAnimation);
                break;
            case R.id.beat6:
                beat6.startAnimation(startAnimation);
                break;
        }
    }
    // 액티비티 이동 메서드
    public void MoveActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}
