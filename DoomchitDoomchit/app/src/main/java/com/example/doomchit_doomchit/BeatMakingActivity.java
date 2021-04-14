package com.example.doomchit_doomchit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
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
    ImageButton back; // 뒤로가기
    // 1트랙
    //MediaPlayer beat1, beat2, beat3, beat4, beat5, beat6;
    ImageButton beatvolum1; ImageButton beat1_off, beat2_off, beat3_off, beat4_off, beat5_off, beat6_off;
    ImageButton beat1_on, beat2_on, beat3_on, beat4_on, beat5_on, beat6_on;
    // 2트랙
    //MediaPlayer synth1, choir, whistle, synth2, piano, mbira;
    ImageButton beatvolum2; ImageButton two1_off, two2_off, two3_off, two4_off, two5_off, two6_off;
    ImageButton two1_on, two2_on, two3_on, two4_on, two5_on, two6_on;

    // 3트랙
    //MediaPlayer keys1, strings1, mallets, pluck, keys2, flute;
    ImageButton beatvolum3; ImageButton three1_off, three2_off, three3_off, three4_off, three5_off, three6_off;
    ImageButton three1_on, three2_on, three3_on, three4_on, three5_on, three6_on;

    // 4트랙
    //MediaPlayer bass1, synth3, pad1, brass1, strings2, bass2;
    ImageButton beatvolum4; ImageButton four1_off, four2_off, four3_off, four4_off, four5_off, four6_off;
    ImageButton four1_on, four2_on, four3_on, four4_on, four5_on, four6_on;

    // 5트랙
    //MediaPlayer strings3, pad2, synth4, synth5, brass2, bass3;
    ImageButton beatvolum5; ImageButton five1_off, five2_off, five3_off, five4_off, five5_off, five6_off;
    ImageButton five1_on, five2_on, five3_on, five4_on, five5_on, five6_on;

    // 6트랙
    //MediaPlayer vox7, vox8, vox9, vox10, beat7, beat8;
    ImageButton beatvolum6; ImageButton six1_off, six2_off, six3_off, six4_off, six5_off, six6_off;
    ImageButton six1_on, six2_on, six3_on, six4_on, six5_on, six6_on;

    // 7트랙
    //MediaPlayer fx1, fx2, fx3, fx4, fx5, fx6;
    ImageButton seven1_off, seven2_off, seven3_off, seven4_off, seven5_off, seven6_off;
    ImageButton seven1_on, seven2_on, seven3_on, seven4_on, seven5_on, seven6_on;

    // 8트랙
    //MediaPlayer vox1, vox2, vox3, vox4, vox5, vox6;
    ImageButton eight1_off, eight2_off, eight3_off, eight4_off, eight5_off, eight6_off;
    ImageButton eight1_on, eight2_on, eight3_on, eight4_on, eight5_on, eight6_on;


    @SuppressLint("ClickableViewAccessibility")
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
        beatvolum2 = findViewById(R.id.beatvolum2);
        two1_off = findViewById(R.id.two1_off);
        two2_off = findViewById(R.id.two2_off);
        two3_off = findViewById(R.id.two3_off);
        two4_off = findViewById(R.id.two4_off);
        two5_off = findViewById(R.id.two5_off);
        two6_off = findViewById(R.id.two6_off);

        two1_on = findViewById(R.id.two1_on);
        two2_on = findViewById(R.id.two2_on);
        two3_on = findViewById(R.id.two3_on);
        two4_on = findViewById(R.id.two4_on);
        two5_on = findViewById(R.id.two5_on);
        two6_on = findViewById(R.id.two6_on);


        beatvolum2.setOnClickListener(this);
        two1_off.setOnClickListener(this);
        two2_off.setOnClickListener(this);
        two3_off.setOnClickListener(this);
        two4_off.setOnClickListener(this);
        two5_off.setOnClickListener(this);
        two6_off.setOnClickListener(this);

        two1_on.setOnClickListener(this);
        two2_on.setOnClickListener(this);
        two3_on.setOnClickListener(this);
        two4_on.setOnClickListener(this);
        two5_on.setOnClickListener(this);
        two6_on.setOnClickListener(this);


        two1_on.setVisibility(View.GONE);
        two2_on.setVisibility(View.GONE);
        two3_on.setVisibility(View.GONE);
        two4_on.setVisibility(View.GONE);
        two5_on.setVisibility(View.GONE);
        two6_on.setVisibility(View.GONE);

        // 3번째 트랙
        beatvolum3 = findViewById(R.id.beatvolum3);
        three1_off = findViewById(R.id.three1_off);
        three2_off = findViewById(R.id.three2_off);
        three3_off = findViewById(R.id.three3_off);
        three4_off = findViewById(R.id.three4_off);
        three5_off = findViewById(R.id.three5_off);
        three6_off = findViewById(R.id.three6_off);

        three1_on = findViewById(R.id.three1_on);
        three2_on = findViewById(R.id.three2_on);
        three3_on = findViewById(R.id.three3_on);
        three4_on = findViewById(R.id.three4_on);
        three5_on = findViewById(R.id.three5_on);
        three6_on = findViewById(R.id.three6_on);


        beatvolum3.setOnClickListener(this);
        three1_off.setOnClickListener(this);
        three2_off.setOnClickListener(this);
        three3_off.setOnClickListener(this);
        three4_off.setOnClickListener(this);
        three5_off.setOnClickListener(this);
        three6_off.setOnClickListener(this);

        three1_on.setOnClickListener(this);
        three2_on.setOnClickListener(this);
        three3_on.setOnClickListener(this);
        three4_on.setOnClickListener(this);
        three5_on.setOnClickListener(this);
        three6_on.setOnClickListener(this);


        three1_on.setVisibility(View.GONE);
        three2_on.setVisibility(View.GONE);
        three3_on.setVisibility(View.GONE);
        three4_on.setVisibility(View.GONE);
        three5_on.setVisibility(View.GONE);
        three6_on.setVisibility(View.GONE);

        // 4번째 트랙
        beatvolum4 = findViewById(R.id.beatvolum4);
        four1_off = findViewById(R.id.four1_off);
        four2_off = findViewById(R.id.four2_off);
        four3_off = findViewById(R.id.four3_off);
        four4_off = findViewById(R.id.four4_off);
        four5_off = findViewById(R.id.four5_off);
        four6_off = findViewById(R.id.four6_off);

        four1_on = findViewById(R.id.four1_on);
        four2_on = findViewById(R.id.four2_on);
        four3_on = findViewById(R.id.four3_on);
        four4_on = findViewById(R.id.four4_on);
        four5_on = findViewById(R.id.four5_on);
        four6_on = findViewById(R.id.four6_on);


        beatvolum4.setOnClickListener(this);
        four1_off.setOnClickListener(this);
        four2_off.setOnClickListener(this);
        four3_off.setOnClickListener(this);
        four4_off.setOnClickListener(this);
        four5_off.setOnClickListener(this);
        four6_off.setOnClickListener(this);

        four1_on.setOnClickListener(this);
        four2_on.setOnClickListener(this);
        four3_on.setOnClickListener(this);
        four4_on.setOnClickListener(this);
        four5_on.setOnClickListener(this);
        four6_on.setOnClickListener(this);


        four1_on.setVisibility(View.GONE);
        four2_on.setVisibility(View.GONE);
        four3_on.setVisibility(View.GONE);
        four4_on.setVisibility(View.GONE);
        four5_on.setVisibility(View.GONE);
        four6_on.setVisibility(View.GONE);

        // 5번째 트랙
        beatvolum5 = findViewById(R.id.beatvolum5);
        five1_off = findViewById(R.id.five1_off);
        five2_off = findViewById(R.id.five2_off);
        five3_off = findViewById(R.id.five3_off);
        five4_off = findViewById(R.id.five4_off);
        five5_off = findViewById(R.id.five5_off);
        five6_off = findViewById(R.id.five6_off);

        five1_on = findViewById(R.id.five1_on);
        five2_on = findViewById(R.id.five2_on);
        five3_on = findViewById(R.id.five3_on);
        five4_on = findViewById(R.id.five4_on);
        five5_on = findViewById(R.id.five5_on);
        five6_on = findViewById(R.id.five6_on);


        beatvolum5.setOnClickListener(this);
        five1_off.setOnClickListener(this);
        five2_off.setOnClickListener(this);
        five3_off.setOnClickListener(this);
        five4_off.setOnClickListener(this);
        five5_off.setOnClickListener(this);
        five6_off.setOnClickListener(this);

        five1_on.setOnClickListener(this);
        five2_on.setOnClickListener(this);
        five3_on.setOnClickListener(this);
        five4_on.setOnClickListener(this);
        five5_on.setOnClickListener(this);
        five6_on.setOnClickListener(this);


        five1_on.setVisibility(View.GONE);
        five2_on.setVisibility(View.GONE);
        five3_on.setVisibility(View.GONE);
        five4_on.setVisibility(View.GONE);
        five5_on.setVisibility(View.GONE);
        five6_on.setVisibility(View.GONE);

        // 6번째 트랙
        beatvolum6 = findViewById(R.id.beatvolum6);
        six1_off = findViewById(R.id.six1_off);
        six2_off = findViewById(R.id.six2_off);
        six3_off = findViewById(R.id.six3_off);
        six4_off = findViewById(R.id.six4_off);
        six5_off = findViewById(R.id.six5_off);
        six6_off = findViewById(R.id.six6_off);

        six1_on = findViewById(R.id.six1_on);
        six2_on = findViewById(R.id.six2_on);
        six3_on = findViewById(R.id.six3_on);
        six4_on = findViewById(R.id.six4_on);
        six5_on = findViewById(R.id.six5_on);
        six6_on = findViewById(R.id.six6_on);


        beatvolum6.setOnClickListener(this);
        six1_off.setOnClickListener(this);
        six2_off.setOnClickListener(this);
        six3_off.setOnClickListener(this);
        six4_off.setOnClickListener(this);
        six5_off.setOnClickListener(this);
        six6_off.setOnClickListener(this);

        six1_on.setOnClickListener(this);
        six2_on.setOnClickListener(this);
        six3_on.setOnClickListener(this);
        six4_on.setOnClickListener(this);
        six5_on.setOnClickListener(this);
        six6_on.setOnClickListener(this);


        six1_on.setVisibility(View.GONE);
        six2_on.setVisibility(View.GONE);
        six3_on.setVisibility(View.GONE);
        six4_on.setVisibility(View.GONE);
        six5_on.setVisibility(View.GONE);
        six6_on.setVisibility(View.GONE);

        // 7번째 트랙
        seven1_off = findViewById(R.id.seven1_off);
        seven2_off = findViewById(R.id.seven2_off);
        seven3_off = findViewById(R.id.seven3_off);
        seven4_off = findViewById(R.id.seven4_off);
        seven5_off = findViewById(R.id.seven5_off);
        seven6_off = findViewById(R.id.seven6_off);

        seven1_on = findViewById(R.id.seven1_on);
        seven2_on = findViewById(R.id.seven2_on);
        seven3_on = findViewById(R.id.seven3_on);
        seven4_on = findViewById(R.id.seven4_on);
        seven5_on = findViewById(R.id.seven5_on);
        seven6_on = findViewById(R.id.seven6_on);

        seven1_off.setOnTouchListener(onTouchListener);
        seven2_off.setOnTouchListener(onTouchListener);
        seven3_off.setOnTouchListener(onTouchListener);
        seven4_off.setOnTouchListener(onTouchListener);
        seven5_off.setOnTouchListener(onTouchListener);
        seven6_off.setOnTouchListener(onTouchListener);

        seven1_on.setVisibility(View.GONE);
        seven2_on.setVisibility(View.GONE);
        seven3_on.setVisibility(View.GONE);
        seven4_on.setVisibility(View.GONE);
        seven5_on.setVisibility(View.GONE);
        seven6_on.setVisibility(View.GONE);

        // 8번째 트랙
        eight1_off = findViewById(R.id.eight1_off);
        eight2_off = findViewById(R.id.eight2_off);
        eight3_off = findViewById(R.id.eight3_off);
        eight4_off = findViewById(R.id.eight4_off);
        eight5_off = findViewById(R.id.eight5_off);
        eight6_off = findViewById(R.id.eight6_off);


        eight1_on = findViewById(R.id.eight1_on);
        eight2_on = findViewById(R.id.eight2_on);
        eight3_on = findViewById(R.id.eight3_on);
        eight4_on = findViewById(R.id.eight4_on);
        eight5_on = findViewById(R.id.eight5_on);
        eight6_on = findViewById(R.id.eight6_on);

        eight1_off.setOnTouchListener(onTouchListener);
        eight2_off.setOnTouchListener(onTouchListener);
        eight3_off.setOnTouchListener(onTouchListener);
        eight4_off.setOnTouchListener(onTouchListener);
        eight5_off.setOnTouchListener(onTouchListener);
        eight6_off.setOnTouchListener(onTouchListener);

        eight1_on.setVisibility(View.GONE);
        eight2_on.setVisibility(View.GONE);
        eight3_on.setVisibility(View.GONE);
        eight4_on.setVisibility(View.GONE);
        eight5_on.setVisibility(View.GONE);
        eight6_on.setVisibility(View.GONE);

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

                break;
            // 1트랙
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

                }

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

                }

                break;
            case R.id.beat3_off:
                //beat3.startAnimation(startAnimation);
                beat1_on.setVisibility(View.GONE);
                beat2_on.setVisibility(View.GONE);
                beat3_on.setVisibility(View.VISIBLE);
                beat4_on.setVisibility(View.GONE);
                beat5_on.setVisibility(View.GONE);
                beat6_on.setVisibility(View.GONE);
                if (beat3_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.beat4_off:
                //beat4.startAnimation(startAnimation);
                beat1_on.setVisibility(View.GONE);
                beat2_on.setVisibility(View.GONE);
                beat3_on.setVisibility(View.GONE);
                beat4_on.setVisibility(View.VISIBLE);
                beat5_on.setVisibility(View.GONE);
                beat6_on.setVisibility(View.GONE);
                if (beat4_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.beat5_off:
                //beat5.startAnimation(startAnimation);
                beat1_on.setVisibility(View.GONE);
                beat2_on.setVisibility(View.GONE);
                beat3_on.setVisibility(View.GONE);
                beat4_on.setVisibility(View.GONE);
                beat5_on.setVisibility(View.VISIBLE);
                beat6_on.setVisibility(View.GONE);
                if (beat5_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.beat6_off:
                //beat6.startAnimation(startAnimation);
                beat1_on.setVisibility(View.GONE);
                beat2_on.setVisibility(View.GONE);
                beat3_on.setVisibility(View.GONE);
                beat4_on.setVisibility(View.GONE);
                beat5_on.setVisibility(View.GONE);
                beat6_on.setVisibility(View.VISIBLE);
                if (beat6_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.beat1_on:
                //beat1.startAnimation(startAnimation);
                if(beat1_on.getVisibility() == View.VISIBLE) {
                    beat1_on.setVisibility(View.GONE);
                }

                break;
            case R.id.beat2_on:
                //beat2.startAnimation(startAnimation);
                if(beat2_on.getVisibility() == View.VISIBLE) {
                    beat2_on.setVisibility(View.GONE);
                }

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

            // 2트랙 synth1, choir, whistle, synth2, piano, mbira;
            case R.id.beatvolum2:
                break;
            case R.id.two1_off:
                //beat1.startAnimation(startAnimation);
                two1_on.setVisibility(View.VISIBLE);
                two2_on.setVisibility(View.GONE);
                two3_on.setVisibility(View.GONE);
                two4_on.setVisibility(View.GONE);
                two5_on.setVisibility(View.GONE);
                two6_on.setVisibility(View.GONE);
                if (two1_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.two2_off:
                //beat2.startAnimation(startAnimation);
                two1_on.setVisibility(View.GONE);
                two2_on.setVisibility(View.VISIBLE);
                two3_on.setVisibility(View.GONE);
                two4_on.setVisibility(View.GONE);
                two5_on.setVisibility(View.GONE);
                two6_on.setVisibility(View.GONE);
                if (two2_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.two3_off:
                //beat3.startAnimation(startAnimation);
                two1_on.setVisibility(View.GONE);
                two2_on.setVisibility(View.GONE);
                two3_on.setVisibility(View.VISIBLE);
                two4_on.setVisibility(View.GONE);
                two5_on.setVisibility(View.GONE);
                two6_on.setVisibility(View.GONE);
                if (two3_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.two4_off:
                //beat4.startAnimation(startAnimation);
                two1_on.setVisibility(View.GONE);
                two2_on.setVisibility(View.GONE);
                two3_on.setVisibility(View.GONE);
                two4_on.setVisibility(View.VISIBLE);
                two5_on.setVisibility(View.GONE);
                two6_on.setVisibility(View.GONE);
                if (two4_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.two5_off:
                //beat5.startAnimation(startAnimation);
                two1_on.setVisibility(View.GONE);
                two2_on.setVisibility(View.GONE);
                two3_on.setVisibility(View.GONE);
                two4_on.setVisibility(View.GONE);
                two5_on.setVisibility(View.VISIBLE);
                two6_on.setVisibility(View.GONE);
                if (two5_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.two6_off:
                //beat6.startAnimation(startAnimation);
                two1_on.setVisibility(View.GONE);
                two2_on.setVisibility(View.GONE);
                two3_on.setVisibility(View.GONE);
                two4_on.setVisibility(View.GONE);
                two5_on.setVisibility(View.GONE);
                two6_on.setVisibility(View.VISIBLE);
                if (two6_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.two1_on:
                //beat1.startAnimation(startAnimation); synth1, choir, whistle, synth2, piano, mbira;
                if(two1_on.getVisibility() == View.VISIBLE) {
                    two1_on.setVisibility(View.GONE);
                }

                break;
            case R.id.two2_on:
                //beat2.startAnimation(startAnimation);
                if(two2_on.getVisibility() == View.VISIBLE) {
                    two2_on.setVisibility(View.GONE);
                }

                break;
            case R.id.two3_on:
                //beat3.startAnimation(startAnimation);
                if(two3_on.getVisibility() == View.VISIBLE) {
                    two3_on.setVisibility(View.GONE);
                }

                break;
            case R.id.two4_on:
                //beat4.startAnimation(startAnimation);
                if(two4_on.getVisibility() == View.VISIBLE) {
                    two4_on.setVisibility(View.GONE);
                }

                break;
            case R.id.two5_on:
                //beat5.startAnimation(startAnimation);
                if(two5_on.getVisibility() == View.VISIBLE) {
                    two5_on.setVisibility(View.GONE);
                }

                break;
            case R.id.two6_on:
                //beat6.startAnimation(startAnimation);
                if(two6_on.getVisibility() == View.VISIBLE) {
                    two6_on.setVisibility(View.GONE);
                }

                break;

            // 3트랙 keys1, strings1, mallets, pluck, keys2, flute;
            case R.id.beatvolum3:
                break;
            case R.id.three1_off:
                //beat1.startAnimation(startAnimation);
                three1_on.setVisibility(View.VISIBLE);
                three2_on.setVisibility(View.GONE);
                three3_on.setVisibility(View.GONE);
                three4_on.setVisibility(View.GONE);
                three5_on.setVisibility(View.GONE);
                three6_on.setVisibility(View.GONE);
                if (three1_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.three2_off:
                //beat2.startAnimation(startAnimation);
                three1_on.setVisibility(View.GONE);
                three2_on.setVisibility(View.VISIBLE);
                three3_on.setVisibility(View.GONE);
                three4_on.setVisibility(View.GONE);
                three5_on.setVisibility(View.GONE);
                three6_on.setVisibility(View.GONE);
                if (three2_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.three3_off:
                //beat3.startAnimation(startAnimation);
                three1_on.setVisibility(View.GONE);
                three2_on.setVisibility(View.GONE);
                three3_on.setVisibility(View.VISIBLE);
                three4_on.setVisibility(View.GONE);
                three5_on.setVisibility(View.GONE);
                three6_on.setVisibility(View.GONE);
                if (three3_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.three4_off:
                //beat4.startAnimation(startAnimation);
                three1_on.setVisibility(View.GONE);
                three2_on.setVisibility(View.GONE);
                three3_on.setVisibility(View.GONE);
                three4_on.setVisibility(View.VISIBLE);
                three5_on.setVisibility(View.GONE);
                three6_on.setVisibility(View.GONE);
                if (three4_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.three5_off:
                //beat5.startAnimation(startAnimation);
                three1_on.setVisibility(View.GONE);
                three2_on.setVisibility(View.GONE);
                three3_on.setVisibility(View.GONE);
                three4_on.setVisibility(View.GONE);
                three5_on.setVisibility(View.VISIBLE);
                three6_on.setVisibility(View.GONE);
                if (three5_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.three6_off:
                //beat6.startAnimation(startAnimation);
                three1_on.setVisibility(View.GONE);
                three2_on.setVisibility(View.GONE);
                three3_on.setVisibility(View.GONE);
                three4_on.setVisibility(View.GONE);
                three5_on.setVisibility(View.GONE);
                three6_on.setVisibility(View.VISIBLE);
                if (three6_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.three1_on:
                //beat1.startAnimation(startAnimation); keys1, strings1, mallets, pluck, keys2, flute;
                if(three1_on.getVisibility() == View.VISIBLE) {
                    three1_on.setVisibility(View.GONE);
                }

                break;
            case R.id.three2_on:
                //beat2.startAnimation(startAnimation);
                if(three2_on.getVisibility() == View.VISIBLE) {
                    three2_on.setVisibility(View.GONE);
                }

                break;
            case R.id.three3_on:
                //beat3.startAnimation(startAnimation);
                if(three3_on.getVisibility() == View.VISIBLE) {
                    three3_on.setVisibility(View.GONE);
                }

                break;
            case R.id.three4_on:
                //beat4.startAnimation(startAnimation);
                if(three4_on.getVisibility() == View.VISIBLE) {
                    three4_on.setVisibility(View.GONE);
                }

                break;
            case R.id.three5_on:
                //beat5.startAnimation(startAnimation);
                if(three5_on.getVisibility() == View.VISIBLE) {
                    three5_on.setVisibility(View.GONE);
                }

                break;
            case R.id.three6_on:
                //beat6.startAnimation(startAnimation);
                if(three6_on.getVisibility() == View.VISIBLE) {
                    three6_on.setVisibility(View.GONE);
                }

                break;

            // 4트랙 bass1, synth3, pad1, brass1, strings2, bass2;
            case R.id.beatvolum4:
                break;
            case R.id.four1_off:
                //beat1.startAnimation(startAnimation);
                four1_on.setVisibility(View.VISIBLE);
                four2_on.setVisibility(View.GONE);
                four3_on.setVisibility(View.GONE);
                four4_on.setVisibility(View.GONE);
                four5_on.setVisibility(View.GONE);
                four6_on.setVisibility(View.GONE);
                if (four1_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.four2_off:
                //beat2.startAnimation(startAnimation);
                four1_on.setVisibility(View.GONE);
                four2_on.setVisibility(View.VISIBLE);
                four3_on.setVisibility(View.GONE);
                four4_on.setVisibility(View.GONE);
                four5_on.setVisibility(View.GONE);
                four6_on.setVisibility(View.GONE);
                if (four2_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.four3_off:
                //beat3.startAnimation(startAnimation);
                four1_on.setVisibility(View.GONE);
                four2_on.setVisibility(View.GONE);
                four3_on.setVisibility(View.VISIBLE);
                four4_on.setVisibility(View.GONE);
                four5_on.setVisibility(View.GONE);
                four6_on.setVisibility(View.GONE);
                if (four3_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.four4_off:
                //beat4.startAnimation(startAnimation);
                four1_on.setVisibility(View.GONE);
                four2_on.setVisibility(View.GONE);
                four3_on.setVisibility(View.GONE);
                four4_on.setVisibility(View.VISIBLE);
                four5_on.setVisibility(View.GONE);
                four6_on.setVisibility(View.GONE);
                if (four4_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.four5_off:
                //beat5.startAnimation(startAnimation);
                four1_on.setVisibility(View.GONE);
                four2_on.setVisibility(View.GONE);
                four3_on.setVisibility(View.GONE);
                four4_on.setVisibility(View.GONE);
                four5_on.setVisibility(View.VISIBLE);
                four6_on.setVisibility(View.GONE);
                if (four5_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.four6_off:
                //beat6.startAnimation(startAnimation);
                four1_on.setVisibility(View.GONE);
                four2_on.setVisibility(View.GONE);
                four3_on.setVisibility(View.GONE);
                four4_on.setVisibility(View.GONE);
                four5_on.setVisibility(View.GONE);
                four6_on.setVisibility(View.VISIBLE);
                if (four6_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.four1_on:
                //beat1.startAnimation(startAnimation);  bass1, synth3, pad1, brass1, strings2, bass2;
                if(four1_on.getVisibility() == View.VISIBLE) {
                    four1_on.setVisibility(View.GONE);
                }

                break;
            case R.id.four2_on:
                //beat2.startAnimation(startAnimation);
                if(four2_on.getVisibility() == View.VISIBLE) {
                    four2_on.setVisibility(View.GONE);
                }

                break;
            case R.id.four3_on:
                //beat3.startAnimation(startAnimation);
                if(four3_on.getVisibility() == View.VISIBLE) {
                    four3_on.setVisibility(View.GONE);
                }

                break;
            case R.id.four4_on:
                //beat4.startAnimation(startAnimation);
                if(four4_on.getVisibility() == View.VISIBLE) {
                    four4_on.setVisibility(View.GONE);
                }

                break;
            case R.id.four5_on:
                //beat5.startAnimation(startAnimation);
                if(four5_on.getVisibility() == View.VISIBLE) {
                    four5_on.setVisibility(View.GONE);
                }

                break;
            case R.id.four6_on:
                //beat6.startAnimation(startAnimation);
                if(four6_on.getVisibility() == View.VISIBLE) {
                    four6_on.setVisibility(View.GONE);
                }

                break;


            // 5트랙 strings3, pad2, synth4, synth5, brass2, bass3;
            case R.id.beatvolum5:
                break;
            case R.id.five1_off:
                //beat1.startAnimation(startAnimation);
                five1_on.setVisibility(View.VISIBLE);
                five2_on.setVisibility(View.GONE);
                five3_on.setVisibility(View.GONE);
                five4_on.setVisibility(View.GONE);
                five5_on.setVisibility(View.GONE);
                five6_on.setVisibility(View.GONE);
                if (five1_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.five2_off:
                //beat2.startAnimation(startAnimation);
                five1_on.setVisibility(View.GONE);
                five2_on.setVisibility(View.VISIBLE);
                five3_on.setVisibility(View.GONE);
                five4_on.setVisibility(View.GONE);
                five5_on.setVisibility(View.GONE);
                five6_on.setVisibility(View.GONE);
                if (five2_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.five3_off:
                //beat3.startAnimation(startAnimation);
                five1_on.setVisibility(View.GONE);
                five2_on.setVisibility(View.GONE);
                five3_on.setVisibility(View.VISIBLE);
                five4_on.setVisibility(View.GONE);
                five5_on.setVisibility(View.GONE);
                five6_on.setVisibility(View.GONE);
                if (five3_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.five4_off:
                //beat4.startAnimation(startAnimation);
                five1_on.setVisibility(View.GONE);
                five2_on.setVisibility(View.GONE);
                five3_on.setVisibility(View.GONE);
                five4_on.setVisibility(View.VISIBLE);
                five5_on.setVisibility(View.GONE);
                five6_on.setVisibility(View.GONE);
                if (five4_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.five5_off:
                //beat5.startAnimation(startAnimation);
                five1_on.setVisibility(View.GONE);
                five2_on.setVisibility(View.GONE);
                five3_on.setVisibility(View.GONE);
                five4_on.setVisibility(View.GONE);
                five5_on.setVisibility(View.VISIBLE);
                five6_on.setVisibility(View.GONE);
                if (five5_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.five6_off:
                //beat6.startAnimation(startAnimation);
                five1_on.setVisibility(View.GONE);
                five2_on.setVisibility(View.GONE);
                five3_on.setVisibility(View.GONE);
                five4_on.setVisibility(View.GONE);
                five5_on.setVisibility(View.GONE);
                five6_on.setVisibility(View.VISIBLE);
                if (five6_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.five1_on:
                //beat1.startAnimation(startAnimation); strings3, pad2, synth4, synth5, brass2, bass3;
                if(five1_on.getVisibility() == View.VISIBLE) {
                    five1_on.setVisibility(View.GONE);
                }

                break;
            case R.id.five2_on:
                //beat2.startAnimation(startAnimation);
                if(five2_on.getVisibility() == View.VISIBLE) {
                    five2_on.setVisibility(View.GONE);
                }

                break;
            case R.id.five3_on:
                //beat3.startAnimation(startAnimation);
                if(five3_on.getVisibility() == View.VISIBLE) {
                    five3_on.setVisibility(View.GONE);
                }

                break;
            case R.id.five4_on:
                //beat4.startAnimation(startAnimation);
                if(five4_on.getVisibility() == View.VISIBLE) {
                    five4_on.setVisibility(View.GONE);
                }

                break;
            case R.id.five5_on:
                //beat5.startAnimation(startAnimation);
                if(five5_on.getVisibility() == View.VISIBLE) {
                    five5_on.setVisibility(View.GONE);
                }

                break;
            case R.id.five6_on:
                //beat6.startAnimation(startAnimation);
                if(five6_on.getVisibility() == View.VISIBLE) {
                    five6_on.setVisibility(View.GONE);
                }

                break;

            // 6트랙 vox7, vox8, vox9, vox10, beat7, beat8;
            case R.id.beatvolum6:
                break;
            case R.id.six1_off:
                //beat1.startAnimation(startAnimation);
                six1_on.setVisibility(View.VISIBLE);
                six2_on.setVisibility(View.GONE);
                six3_on.setVisibility(View.GONE);
                six4_on.setVisibility(View.GONE);
                six5_on.setVisibility(View.GONE);
                six6_on.setVisibility(View.GONE);
                if (six1_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.six2_off:
                //beat2.startAnimation(startAnimation);
                six1_on.setVisibility(View.GONE);
                six2_on.setVisibility(View.VISIBLE);
                six3_on.setVisibility(View.GONE);
                six4_on.setVisibility(View.GONE);
                six5_on.setVisibility(View.GONE);
                six6_on.setVisibility(View.GONE);
                if (six2_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.six3_off:
                //beat3.startAnimation(startAnimation);
                six1_on.setVisibility(View.GONE);
                six2_on.setVisibility(View.GONE);
                six3_on.setVisibility(View.VISIBLE);
                six4_on.setVisibility(View.GONE);
                six5_on.setVisibility(View.GONE);
                six6_on.setVisibility(View.GONE);
                if (six3_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.six4_off:
                //beat4.startAnimation(startAnimation);
                six1_on.setVisibility(View.GONE);
                six2_on.setVisibility(View.GONE);
                six3_on.setVisibility(View.GONE);
                six4_on.setVisibility(View.VISIBLE);
                six5_on.setVisibility(View.GONE);
                six6_on.setVisibility(View.GONE);
                if (six4_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.six5_off:
                //beat5.startAnimation(startAnimation);
                six1_on.setVisibility(View.GONE);
                six2_on.setVisibility(View.GONE);
                six3_on.setVisibility(View.GONE);
                six4_on.setVisibility(View.GONE);
                six5_on.setVisibility(View.VISIBLE);
                six6_on.setVisibility(View.GONE);
                if (six5_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.six6_off:
                //beat6.startAnimation(startAnimation);
                six1_on.setVisibility(View.GONE);
                six2_on.setVisibility(View.GONE);
                six3_on.setVisibility(View.GONE);
                six4_on.setVisibility(View.GONE);
                six5_on.setVisibility(View.GONE);
                six6_on.setVisibility(View.VISIBLE);
                if (six6_on.getVisibility() == View.VISIBLE) {

                }

                break;
            case R.id.six1_on:
                //beat1.startAnimation(startAnimation);
                if(six1_on.getVisibility() == View.VISIBLE) {
                    six1_on.setVisibility(View.GONE);
                }

                break;
            case R.id.six2_on:
                //beat2.startAnimation(startAnimation);
                if(six2_on.getVisibility() == View.VISIBLE) {
                    six2_on.setVisibility(View.GONE);
                }

                break;
            case R.id.six3_on:
                //beat3.startAnimation(startAnimation);
                if(six3_on.getVisibility() == View.VISIBLE) {
                    six3_on.setVisibility(View.GONE);
                }

                break;
            case R.id.six4_on:
                //beat4.startAnimation(startAnimation);
                if(six4_on.getVisibility() == View.VISIBLE) {
                    six4_on.setVisibility(View.GONE);
                }

                break;
            case R.id.six5_on:
                //beat5.startAnimation(startAnimation);
                if(six5_on.getVisibility() == View.VISIBLE) {
                    six5_on.setVisibility(View.GONE);
                }

                break;
            case R.id.six6_on:
                //beat6.startAnimation(startAnimation);
                if(six6_on.getVisibility() == View.VISIBLE) {
                    six6_on.setVisibility(View.GONE);
                }

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }

    private View.OnTouchListener onTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case MotionEvent.ACTION_DOWN:
                    //Toast.makeText(BeatMakingActivity.this, "닿음", Toast.LENGTH_SHORT).show();
                    switch (v.getId()) {
                        // 7트랙 fx1, fx2, fx3, fx4, fx5, fx6;
                        case R.id.seven1_off:
                            //beat1.startAnimation(startAnimation);
                            seven1_on.setVisibility(View.VISIBLE);
                            if (seven1_on.getVisibility() == View.VISIBLE) {

                            }
                            //Toast.makeText(BeatMakingActivity.this, "7-1", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.seven2_off:
                            //beat2.startAnimation(startAnimation);
                            seven2_on.setVisibility(View.VISIBLE);
                            if (seven2_on.getVisibility() == View.VISIBLE) {

                            }
                            break;
                        case R.id.seven3_off:
                            //beat3.startAnimation(startAnimation);
                            seven3_on.setVisibility(View.VISIBLE);
                            if (seven3_on.getVisibility() == View.VISIBLE) {

                            }
                            break;
                        case R.id.seven4_off:
                            //beat4.startAnimation(startAnimation);
                            seven4_on.setVisibility(View.VISIBLE);
                            if (seven4_on.getVisibility() == View.VISIBLE) {

                            }
                            break;
                        case R.id.seven5_off:
                            seven5_on.setVisibility(View.VISIBLE);
                            if (seven5_on.getVisibility() == View.VISIBLE) {

                            }
                            break;
                        case R.id.seven6_off:
                            seven6_on.setVisibility(View.VISIBLE);
                            if (seven6_on.getVisibility() == View.VISIBLE) {

                            }
                            break;

                        // 8트랙 vox1, vox2, vox3, vox4, vox5, vox6;
                        case R.id.eight1_off:
                            //beat1.startAnimation(startAnimation);
                            eight1_on.setVisibility(View.VISIBLE);
                            if (eight1_on.getVisibility() == View.VISIBLE) {

                            }
                            break;
                        case R.id.eight2_off:
                            //beat2.startAnimation(startAnimation);
                            eight2_on.setVisibility(View.VISIBLE);
                            if (eight2_on.getVisibility() == View.VISIBLE) {

                            }
                            break;
                        case R.id.eight3_off:
                            //beat3.startAnimation(startAnimation);
                            eight3_on.setVisibility(View.VISIBLE);
                            if (eight3_on.getVisibility() == View.VISIBLE) {

                            }
                            break;
                        case R.id.eight4_off:
                            //beat4.startAnimation(startAnimation);
                            eight4_on.setVisibility(View.VISIBLE);
                            if (eight4_on.getVisibility() == View.VISIBLE) {

                            }
                            break;
                        case R.id.eight5_off:
                            eight5_on.setVisibility(View.VISIBLE);
                            if (eight5_on.getVisibility() == View.VISIBLE) {

                            }
                            break;
                        case R.id.eight6_off:
                            eight6_on.setVisibility(View.VISIBLE);
                            if (eight6_on.getVisibility() == View.VISIBLE) {

                            }
                            break;
                    }
                    break;
                case MotionEvent.ACTION_UP:
                    // 7트랙 fx1, fx2, fx3, fx4, fx5, fx6;
                    switch (v.getId()) {
                        case R.id.seven1_off:
                            //beat1.startAnimation(startAnimation);
                            seven1_on.setVisibility(View.GONE);

                            break;
                        case R.id.seven2_off:
                            //beat2.startAnimation(startAnimation);
                            seven2_on.setVisibility(View.GONE);

                            break;
                        case R.id.seven3_off:
                            //beat3.startAnimation(startAnimation);
                            seven3_on.setVisibility(View.GONE);

                            break;
                        case R.id.seven4_off:
                            //beat4.startAnimation(startAnimation);
                            seven4_on.setVisibility(View.GONE);

                            break;
                        case R.id.seven5_off:
                            seven5_on.setVisibility(View.GONE);

                            break;
                        case R.id.seven6_off:
                            seven6_on.setVisibility(View.GONE);

                            break;

                        // 8트랙 vox1, vox2, vox3, vox4, vox5, vox6;
                        case R.id.eight1_off:
                            //beat1.startAnimation(startAnimation);
                            eight1_on.setVisibility(View.GONE);

                            break;
                        case R.id.eight2_off:
                            //beat2.startAnimation(startAnimation);
                            eight2_on.setVisibility(View.GONE);

                            break;
                        case R.id.eight3_off:
                            //beat3.startAnimation(startAnimation);
                            eight3_on.setVisibility(View.GONE);

                            break;
                        case R.id.eight4_off:
                            //beat4.startAnimation(startAnimation);
                            eight4_on.setVisibility(View.GONE);

                            break;
                        case R.id.eight5_off:
                            eight5_on.setVisibility(View.GONE);

                            break;
                        case R.id.eight6_off:
                            eight6_on.setVisibility(View.GONE);

                            break;
                        default:
                            break;
                    }
                default:
                    break;
            }
            return true;
        }
    };

    // 액티비티 이동 메서드
    public void MoveActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}
