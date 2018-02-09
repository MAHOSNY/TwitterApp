package com.example.mohamed.twitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

    final   TextView t6,t7,t8,t9,t10,t11,t12,t13,t18,t19,t20;
        t6=(TextView)findViewById(R.id.t6);
        t7=(TextView)findViewById(R.id.t7);
        t8=(EditText)findViewById(R.id.t8);
        t9=(EditText)findViewById(R.id.t9);
        t10=(EditText)findViewById(R.id.t10);
        t11=(EditText)findViewById(R.id.t11);
        t12=(EditText)findViewById(R.id.t12);
        t13=(TextView)findViewById(R.id.t13);
        t18=(TextView)findViewById(R.id.t18);
        t19=(TextView)findViewById(R.id.t19);
        t20=(TextView)findViewById(R.id.t20);


    final Button b3,r1,r2;
        b3=(Button)findViewById(R.id.b3);
        r1=(Button)findViewById(R.id.r1);
        r2=(Button)findViewById(R.id.r2);


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x= new Intent(getApplicationContext(),login.class);
                startActivity(x);
            }
        });



    }
}
