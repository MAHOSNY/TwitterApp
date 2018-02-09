package com.example.mohamed.twitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.mohamed.twitter.R.id.forgot_password;
import static com.example.mohamed.twitter.R.id.t1;
import static com.example.mohamed.twitter.R.id.t2;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Toast.makeText(this, "Welcome to Twitter", Toast.LENGTH_LONG).show();
        final  Button b1,b2;
                b1=(Button)findViewById(R.id.b1);
                b2=(Button)findViewById(R.id.b2);

        final TextView t1,t2,t3,t4,t5;
                t1=(TextView)findViewById(R.id.t1);
                t2=(EditText)findViewById(R.id.t2);
                t3=(EditText)findViewById(R.id.t3);
                t4=(TextView)findViewById(R.id.t4);
                t5=(TextView)findViewById(R.id.t5);


        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x= new Intent(getApplicationContext(),forgot_password.class);
                startActivity(x);
            }
        });


        final CheckBox c;
                c=(CheckBox)findViewById(R.id.Box);




    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String email,password;
            email=t2.getText().toString();
            password=t3.getText().toString();


            Intent x=new Intent(getApplicationContext(),welcome.class);

            startActivity(x);
        }
    });


    b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent x=new Intent(getApplicationContext(),signup.class);
            startActivity(x);
        }
    });


    }
}
