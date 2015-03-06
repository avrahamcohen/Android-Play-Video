package com.domain.example.videosplash;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;


public class SplashActivity extends Activity implements MediaPlayer.OnCompletionListener {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        VideoView video = (VideoView) findViewById(R.id.videoView);
        String VideoURL = "http://www.androidbegin.com/tutorial/AndroidCommercial.3gp";
        video.setVideoURI(Uri.parse(VideoURL));
        video.setOnCompletionListener(this);
        video.setMediaController(new MediaController(this));
        video.setVisibility(View.VISIBLE);
        video.bringToFront();
        video.requestFocus();
        video.start();
    }

    @Override
    public void onCompletion(MediaPlayer mp)
    {
        finish();
    }
}
