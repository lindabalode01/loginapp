package com.example.loginapp;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText profile;
    EditText mail;
    EditText code;
    EditText name;
    EditText secondName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this method will delete the text when user presses on field username
        profile = findViewById(R.id.user);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getString(R.string.profile).equals(profile.getText().toString()));
                profile.setText(" ");

            }
        });
        //this method will delete the text when user presses on field email
        mail = findViewById(R.id.email);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getString(R.string.mail).equals(mail.getText().toString()));
                mail.setText(" ");
            }
        });

        //this method will delete the text when user presses on field password
        code = findViewById(R.id.password);
        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getString(R.string.code).equals(code.getText().toString()));
                code.setText(" ");
            }
        });

        //this method will delete the text when user presses on field first name
        name = findViewById(R.id.firstname);
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getString(R.string.name).equals(name.getText().toString()));
                name.setText(" ");
            }
        });

        //this method will delete the text when user presses on field surname
        secondName = findViewById(R.id.surname);
        secondName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getString(R.string.secondName).equals(secondName.getText().toString()));
                secondName.setText(" ");
            }
        });


    }
    public void change (){

    }
}
