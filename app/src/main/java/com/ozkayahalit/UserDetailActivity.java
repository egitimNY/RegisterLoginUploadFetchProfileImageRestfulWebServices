package com.ozkayahalit;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class UserDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String imageUrl = getIntent().getStringExtra("image");
        ImageView iv = findViewById(R.id.userImage);
        TextView tvn = findViewById(R.id.userName);
        TextView tve = findViewById(R.id.userEmail);
        tvn.setText(name);
        tve.setText(email);
        Picasso.get().load(imageUrl).into(iv);
    }
}
