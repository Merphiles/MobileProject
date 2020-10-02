package com.example.homework3;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DontAskWhyIUseThis extends AppCompatActivity {

    VideoView videoView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.useless_activity);

        VideoView videoView = (VideoView)findViewById(R.id.video);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.nada;
        videoView = (VideoView)findViewById(R.id.video);
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }
}
