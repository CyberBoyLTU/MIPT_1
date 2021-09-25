package com.example.mipt_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Message;
    Button ShowMessage;
    Button ChangeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting the variables to the Layout file
        Message = findViewById(R.id.Message);
        ShowMessage = findViewById(R.id.ShowMessage);
        ChangeColor = findViewById(R.id.ChangeColor);

        //Setting the OnClick Listener
        ShowMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // What we want to display when button is clicked
                Message.setText("Sveiki atvykę!");
            }
        });

        ChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Change color of the message
                Message.setTextColor(Color.RED);
            }
        });
    }
}