package com.example.doomchit_doomchit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;

public class MainActivity extends AppCompatActivity {
    ImageButton btn_play; // 비트 제작
    ImageButton btn_list; // 녹음 리스트

    private Socket socket;
    private String SERVER_URL = "http://xxx.xxx.xxx.xxx:3000"; //소켓 통신할 서버url

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        ImageButton btn_play = findViewById(R.id.btn_play);
        ImageButton btn_list = findViewById(R.id.btn_list);

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoveActivity(BeatMakingActivity.class);
            }
        });

        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoveActivity(RecordListActivity.class);
            }
        });

    }

    // 액티비티 이동 메서드
    public void MoveActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }

    public void SocketConnect() {
        try{
            socket = IO.socket(SERVER_URL);
        } catch (URISyntaxException ue) {
            ue.printStackTrace();
        }
        socket.connect();

    }
}