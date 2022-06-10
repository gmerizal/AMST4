package com.example.amst4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.mando);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
    }
}