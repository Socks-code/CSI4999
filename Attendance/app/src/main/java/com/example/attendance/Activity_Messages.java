package com.example.attendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        //binding = ActivityLoginBinding.inflate(getLayoutInflater());
        //setContentView(R.layout.my_layout_id);

        final Button button = (Button) findViewById(R.id.HomeButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openHomeActivity();
            }
        });
        final Button ClassesButton = (Button) findViewById(R.id.ClassesButton);
        ClassesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openClassesActivity();
            }
        });
        final Button MessagesButton = (Button) findViewById(R.id.MessagesButton);
        MessagesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openMessagesActivity();
            }
        });
        final Button SettingsButton = (Button) findViewById(R.id.SettingsButton);
        SettingsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openSettingsActivity();
            }
        });
//MessagesButton
    }
    private void openClassesActivity()
    {
        Intent intent = new Intent(this, ClassViewActivity.class);
        startActivity(intent);

    }
    private void openHomeActivity()
    {
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);

    }
    private void openMessagesActivity()
    {
        Intent intent = new Intent(this, Activity_Messages.class);
        startActivity(intent);

    }
    private void openSettingsActivity()
    {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);

    }
}