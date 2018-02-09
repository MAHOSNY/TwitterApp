package com.example.mohamed.twitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class forgot_password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);

        Button b4;
        b4=(Button)findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x= new Intent(getApplicationContext(),login.class);
                startActivity(x);
            }
        });

        TextView t14,t15,t16,t17;
        t14=(TextView)findViewById(R.id.t14);
        t15=(EditText)findViewById(R.id.t15);
        t16=(TextView)findViewById(R.id.t16);
        t17=(EditText)findViewById(R.id.t17);


    }
}
