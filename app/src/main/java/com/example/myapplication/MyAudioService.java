package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;


public class MyAudioService extends Service {
    MediaPlayer mediaPlayer;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {
        mediaPlayer  = MediaPlayer.create(this, R.raw.duanqiaocanxue);//创建音乐服务。播放R.raw中的音乐duanqiaocanxue
        mediaPlayer.start();//开始服务
    }
    @Override
    public void onDestroy() {
        mediaPlayer.stop();
    }
}
