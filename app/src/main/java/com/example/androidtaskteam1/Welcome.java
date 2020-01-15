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
        getDataFromLoginActivity();
    }

    private void calling() {
        firstNameTV=findViewById(R.id.firstNameTV);
        lastNameTV=findViewById(R.id.lastNameTV);
        emailAddressTv=findViewById(R.id.emailAddressTv);
        btCheckCv=findViewById(R.id.btCheckCv);
        imageUser=findViewById(R.id.imageUser);

    }

    private void handling() {
        imageUser.setImageResource(R.drawable.img_1);
        btCheckCv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCvActivity();
            }
        });

    }

    public void getDataFromLoginActivity() {
        rx=getIntent().getExtras();
        firstNameTV.setText(rx.getString("firstS"));
        lastNameTV.setText(rx.getString("lastS"));
        emailAddressTv.setText(rx.getString("emailS"));

    }
    public void setDataToActivity() {

        checkUserImage();
    }
    public void checkUserImage(){

    }
    public void goToCvActivity(){

        startActivity(new Intent(Welcome.this,Cv.class));
    }

}
