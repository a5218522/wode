package com.example.administrator.yanggeproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

public class socute extends AppCompatActivity {
    private MediaPlayer music;
    private ImageView i;
    int j=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socute);
        music = new MediaPlayer();
        i=(ImageView)findViewById(R.id.music_pause_imgv);
        try {
            music.setDataSource("http://10.51.7.66:8080/huigepi.mp3");
            music.prepareAsync();
            music.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    // 装载完毕回调
                    music.start();
                }

            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fff(View v){
        if(j==0){
            music.pause();
            i.setImageResource(R.mipmap.ic_play_btn_play);
            j=1;
        }
        else if(j==1){
            music.start();
            i.setImageResource(R.drawable.seach_btn_pause);
            j=0;
        }


    }
   public void lll(View v){

        music.stop();
        music.release();
        music=null;
        finish();
        j=0;
   }
}
