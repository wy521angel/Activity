package com.example.wy521angel.activitytest;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(getApplicationContext(), MainActivityB.class));
                Intent intent = new Intent();
                ComponentName componetName = new ComponentName(
                        "com.example.wy521angel.activitytest2",
                        "com.example.wy521angel.activitytest2.MainActivityB");
                intent.setComponent(componetName);
                startActivity(intent);
            }
        });
    }
}
