package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button ShowPendingButton;
    private Button ShowPreviousButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShowPendingButton = findViewById(R.id.ShowPending);
        ShowPendingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenShowPendingActivity();
            }
        });

        ShowPreviousButton = findViewById(R.id.ShowPrevious);
        ShowPreviousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenShowPreviousActivity();
            }
        });
    }

    public void OpenShowPendingActivity() {
        Intent intent = new Intent(this, ShowPendingActivity.class);
        startActivity(intent);
    }

    public void OpenShowPreviousActivity() {
        Intent intent = new Intent(this, ShowPreviousActivity.class);
        startActivity(intent);
    }
}
