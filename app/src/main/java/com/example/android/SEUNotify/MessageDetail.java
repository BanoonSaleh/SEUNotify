package com.example.android.SEUNotify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

public class MessageDetail extends AppCompatActivity {
    private TextView massegTitle , messageDate,messageBody;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_detail);
        massegTitle = findViewById(R.id.titleText);
        messageDate = findViewById(R.id.dateview);
        messageBody = findViewById(R.id.bodyMessage);
        imageView = findViewById(R.id.imageView);

        if(getIntent().hasExtra("messages")) {
            String  data = getIntent().getStringExtra("messages");
            Messages messages = new Gson().fromJson(data, Messages.class);
            massegTitle.setText(messages.getTitle());
            messageDate.setText(messages.getDatePublish());
            messageBody.setText(messages.getTextMessage());
            imageView.setVisibility(View.VISIBLE);
            Glide.with(imageView.getContext())
                    .load(messages.getPhotoUrl())
                    .into(imageView);
        }


    }
}
