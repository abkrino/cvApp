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

    }

    public void handling() {
        goToWelcomeActivity();
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

    }
}
