package com.example.attendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.attendance.databinding.ActivityLoginBinding;

public class ClassViewActivity extends AppCompatActivity {
    //private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_view);
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
}