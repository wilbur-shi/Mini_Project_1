package com.example.wilbur.mini_project_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DisplayPhotoActivity extends AppCompatActivity {
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_photo);

        image = (ImageView) findViewById(R.id.imageView);

        Intent intent = getIntent();
        Uri myUri = intent.getParcelableExtra("imageUri");
        image.setImageURI(myUri);

    }
}
