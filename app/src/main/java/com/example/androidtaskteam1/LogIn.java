package com.example.androidtaskteam1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {
    EditText firstName, lastName, emailAddress, password;
    Button login;
    Person person;
    String firstNameS, lastNameS, emailAddressS, passwordS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calling();
        handling();
    }

    public void calling() {
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        emailAddress = findViewById(R.id.emailAddress);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

    }

    public void handling() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstName.getText().toString().length() < 3) {
                    firstName.setError("Check First Name");
                } else if (lastName.getText().toString().length() < 3) {
                    lastName.setError("Check Last Name");
                } else if (emailAddress.getText().toString().length() < 5) {
                    emailAddress.setError("Check Email");
                } else if (password.getText().toString().length() < 5) {
                    password.setError("Check Password");
                } else {
                    Toast.makeText(LogIn.this, "welcome " + firstName.getText().toString() + " " + lastName.getText().toString(), Toast.LENGTH_SHORT).show();
                    goToWelcomeActivity();
                }
            }
        });
    }

    public void getTextFromEditText() {

        checkData(firstNameS, lastNameS, emailAddressS, passwordS);
    }

    public void checkData(String fn, String ln, String e, String p) {
        person = new Person(fn, ln, e, p);
        sendStringVarToWelcomeActivity(firstNameS, lastNameS, emailAddressS);

    }

    public void sendStringVarToWelcomeActivity(String fn, String ln, String e) {

    }

    public void goToWelcomeActivity() {
        Intent ii = new Intent(LogIn.this, Welcome.class);
        ii.putExtra("firtS", firstName.getText().toString() );
        ii.putExtra("emailS",emailAddress.getText().toString());
        ii.putExtra("lastS",lastName.getText().toString());
        startActivity(ii);
    }

    }

