package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
       private Button Button_About;
       private Button Button_MyProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button_MyProfile =(Button)findViewById(R.id.Button_MyProfile);
        Button_MyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyProfileActivity();
            }
        });
        Button_About = (Button)findViewById(R.id.Button_About);
        Button_About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutActivity();
            }
        });
        }
  public void openAboutActivity(){
        Intent intent = new Intent(this, AboutALCActivity.class);
        startActivity(intent);
  }
  public void openMyProfileActivity(){
        Intent intent = new Intent(this, MyProfileActivity.class);
        startActivity(intent);
  }





}
