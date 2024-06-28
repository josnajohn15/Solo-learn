package com.example.sololearn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Web extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_web);
        ed1=(EditText) findViewById(R.id.studid);
        ed2=(EditText) findViewById(R.id.name);
        ed3=(EditText) findViewById(R.id.cname);
        b1=(AppCompatButton) findViewById(R.id.enroll);
        b2=(AppCompatButton) findViewById(R.id.back);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getStudId=ed1.getText().toString();
                String getStudName=ed2.getText().toString();
                String getCollege=ed3.getText().toString();
                Toast.makeText(getApplicationContext(),getStudId+" "+getStudName+" "+getCollege,Toast.LENGTH_SHORT).show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}
