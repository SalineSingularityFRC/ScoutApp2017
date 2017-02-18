package scouting2017.salinerobotics.org.a2017scoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Robot extends AppCompatActivity {
    public String user;
    public int robot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robot);

        Intent i=getIntent();
        user=i.getStringExtra("user");
        robot=i.getIntExtra("robot",-1);
    }
}
