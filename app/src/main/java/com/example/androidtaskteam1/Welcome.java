package com.example.androidtaskteam1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {
    String firstNameS, lastNameS, emailAddressS;
    Bundle rx;
    TextView firstNameTV, lastNameTV,emailAddressTv;
    Button btCheckCv;
    ImageView imageUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
        calling();
        handling();
    }

    private void calling() {

    }

    private void handling() {

    }

    public void getDataFromLoginActivity() {

    }
    public void setDataToActivity() {

        checkUserImage();
    }
    public void checkUserImage(){

    }
    public void goToCvActivity(){


    }

}
