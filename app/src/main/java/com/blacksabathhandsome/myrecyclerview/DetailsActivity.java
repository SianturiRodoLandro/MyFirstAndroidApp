package com.blacksabathhandsome.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {

    CircleImageView imageView;
    TextView textViewName;
    TextView textViewDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.circleImage);
        textViewName = findViewById(R.id.tvName);
        textViewDesc = findViewById(R.id.tvDescription);
        String photo = getIntent().getStringExtra("photo");
        String name = getIntent().getStringExtra("name");
        String desc = getIntent().getStringExtra("description");
        Glide.with(this).load(photo)
                .apply(new RequestOptions().override(350, 350)).into(imageView);

        textViewName.setText(name);
        textViewDesc.setText(desc);
    }
}
