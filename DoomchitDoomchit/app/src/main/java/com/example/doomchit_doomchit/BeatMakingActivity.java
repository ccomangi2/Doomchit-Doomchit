package com.example.doomchit_doomchit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class BeatMakingActivity extends AppCompatActivity implements View.OnClickListener{
    MediaPlayer beat1, beat2, beat3, beat4, beat5, beat6;
    ImageButton back; // 뒤로가기
    ImageButton beatvolum1; Button beat1_off, beat2_off, beat3_off, beat4_off, beat5_off, beat6_off;
                            Button beat1_on, beat2_on, beat3_on, beat4_on, beat5_on, beat6_on;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_beatmaking);
        //Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.glow_anim);

        // 1번째 트랙
        beatvolum1 = findViewById(R.id.beatvolum1);
        beat1_off = findViewById(R.id.beat1_off);
        beat2_off = findViewById(R.id.beat2_off);
        beat3_off = findViewById(R.id.beat3_off);
        beat4_off = findViewById(R.id.beat4_off);
        beat5_off = findViewById(R.id.beat5_off);
        beat6_off = findViewById(R.id.beat6_off);

        beat1_on = findViewById(R.id.beat1_on);
        beat2_on = findViewById(R.id.beat2_on);
        beat3_on = findViewById(R.id.beat3_on);
        beat4_on = findViewById(R.id.beat4_on);
        beat5_on = findViewById(R.id.beat5_on);
        beat6_on = findViewById(R.id.beat6_on);


        beatvolum1.setOnClickListener(this);
        beat1_off.setOnClickListener(this);
        beat2_off.setOnClickListener(this);
        beat3_off.setOnClickListener(this);
        beat4_off.setOnClickListener(this);
        beat5_off.setOnClickListener(this);
        beat6_off.setOnClickListener(this);

        beat1_on.setOnClickListener(this);
        beat2_on.setOnClickListener(this);
        beat3_on.setOnClickListener(this);
        beat4_on.setOnClickListener(this);
        beat5_on.setOnClickListener(this);
        beat6_on.setOnClickListener(this);


        beat1_on.setVisibility(View.GONE);
        beat2_on.setVisibility(View.GONE);
        beat3_on.setVisibility(View.GONE);
        beat4_on.setVisibility(View.GONE);
        beat5_on.setVisibility(View.GONE);
        beat6_on.setVisibility(View.GONE);


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

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
    public void onClick(View v) {
        //Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.glow_anim);
        switch(v.getId()) {
            case R.id.back :
                MoveActivity(MainActivity.class);
                stopAudio(beat1);
                stopAudio(beat2);
                break;
            case R.id.beatvolum1:
                break;
            case R.id.beat1_off:
                //beat1.startAnimation(startAnimation);
                beat1_on.setVisibility(View.VISIBLE);
                beat2_on.setVisibility(View.GONE);
                beat3_on.setVisibility(View.GONE);
                beat4_on.setVisibility(View.GONE);
                beat5_on.setVisibility(View.GONE);
                beat6_on.setVisibility(View.GONE);
                if (beat1_on.getVisibility() == View.VISIBLE) {
                    beat1 = MediaPlayer.create(BeatMakingActivity.this, R.raw.beat1);
                    beat1.start();
                    beat1.setLooping(true);
                }
                stopAudio(beat2);
                break;
            case R.id.beat2_off:
                //beat2.startAnimation(startAnimation);
                beat1_on.setVisibility(View.GONE);
                beat2_on.setVisibility(View.VISIBLE);
                beat3_on.setVisibility(View.GONE);
                beat4_on.setVisibility(View.GONE);
                beat5_on.setVisibility(View.GONE);
                beat6_on.setVisibility(View.GONE);
                if (beat2_on.getVisibility() == View.VISIBLE) {
                    beat2 = MediaPlayer.create(BeatMakingActivity.this, R.raw.beat2);
                    beat2.start();
                    beat2.setLooping(true);
                }
                stopAudio(beat1);
                break;
            case R.id.beat3_off:
                //beat3.startAnimation(startAnimation);
                beat1_on.setVisibility(View.GONE);
                beat2_on.setVisibility(View.GONE);
                beat3_on.setVisibility(View.VISIBLE);
                beat4_on.setVisibility(View.GONE);
                beat5_on.setVisibility(View.GONE);
                beat6_on.setVisibility(View.GONE);
                stopAudio(beat1);
                stopAudio(beat2);
                break;
            case R.id.beat4_off:
                //beat4.startAnimation(startAnimation);
                beat1_on.setVisibility(View.GONE);
                beat2_on.setVisibility(View.GONE);
                beat3_on.setVisibility(View.GONE);
                beat4_on.setVisibility(View.VISIBLE);
                beat5_on.setVisibility(View.GONE);
                beat6_on.setVisibility(View.GONE);
                stopAudio(beat1);
                stopAudio(beat2);
                break;
            case R.id.beat5_off:
                //beat5.startAnimation(startAnimation);
                beat1_on.setVisibility(View.GONE);
                beat2_on.setVisibility(View.GONE);
                beat3_on.setVisibility(View.GONE);
                beat4_on.setVisibility(View.GONE);
                beat5_on.setVisibility(View.VISIBLE);
                beat6_on.setVisibility(View.GONE);
                stopAudio(beat1);
                stopAudio(beat2);
                break;
            case R.id.beat6_off:
                //beat6.startAnimation(startAnimation);
                beat1_on.setVisibility(View.GONE);
                beat2_on.setVisibility(View.GONE);
                beat3_on.setVisibility(View.GONE);
                beat4_on.setVisibility(View.GONE);
                beat5_on.setVisibility(View.GONE);
                beat6_on.setVisibility(View.VISIBLE);
                stopAudio(beat1);
                stopAudio(beat2);
                break;
            case R.id.beat1_on:
                //beat1.startAnimation(startAnimation);
                if(beat1_on.getVisibility() == View.VISIBLE) {
                    beat1_on.setVisibility(View.GONE);
                }
                stopAudio(beat1);
                break;
            case R.id.beat2_on:
                //beat2.startAnimation(startAnimation);
                if(beat2_on.getVisibility() == View.VISIBLE) {
                    beat2_on.setVisibility(View.GONE);
                }
                stopAudio(beat2);
                break;
            case R.id.beat3_on:
                //beat3.startAnimation(startAnimation);
                if(beat3_on.getVisibility() == View.VISIBLE) {
                    beat3_on.setVisibility(View.GONE);
                }
                break;
            case R.id.beat4_on:
                //beat4.startAnimation(startAnimation);
                if(beat4_on.getVisibility() == View.VISIBLE) {
                    beat4_on.setVisibility(View.GONE);
                }
                break;
            case R.id.beat5_on:
                //beat5.startAnimation(startAnimation);
                if(beat5_on.getVisibility() == View.VISIBLE) {
                    beat5_on.setVisibility(View.GONE);
                }
                break;
            case R.id.beat6_on:
                //beat6.startAnimation(startAnimation);
                if(beat6_on.getVisibility() == View.VISIBLE) {
                    beat6_on.setVisibility(View.GONE);
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }

    private void stopAudio(MediaPlayer media) {
        if(media != null && media.isPlaying()){
            media.stop();
        }
    }

    /* 녹음 시 마이크 리소스 제한. 누군가가 lock 걸어놓으면 다른 앱에서 사용할 수 없음.
     * 따라서 꼭 리소스를 해제해주어야함. */
    public void closePlayer() {
        if (beat1 != null) {
            beat1.release();
            beat1 = null;
        }
    }
    // 액티비티 이동 메서드
    public void MoveActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}
