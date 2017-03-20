package com.customview.kang.firebasefcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class PointActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point);

        Intent intent = getIntent();
        String point = intent.getExtras().getString("point");

        Toast.makeText(this, "Point = " + point, Toast.LENGTH_SHORT).show();
    }
}
