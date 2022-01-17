package com.example.notesave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MenuAct extends AppCompatActivity {

    LinearLayout btn_notebook,btn_exit;
    TextView textView2;
    ImageView AboutUs;

    //Exit apps
    public void onBackPressed() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_notebook = findViewById(R.id.btn_notebook);
        btn_exit = findViewById(R.id.btn_exit);
        AboutUs = findViewById(R.id.AboutUs);
        textView2 = findViewById(R.id.textView2);


        btn_notebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotonote = new Intent(MenuAct.this,MainActivity.class);
                startActivity(gotonote);
            }
        });



        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        AboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoabout = new Intent(MenuAct.this,AboutUsAct.class);
                startActivity(gotoabout);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotomenu2 = new Intent(MenuAct.this,MenuAct.class);
                startActivity(gotomenu2);
            }
        });
    }

}