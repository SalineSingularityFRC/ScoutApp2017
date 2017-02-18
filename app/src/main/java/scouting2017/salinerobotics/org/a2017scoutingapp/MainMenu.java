package scouting2017.salinerobotics.org.a2017scoutingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainMenu extends AppCompatActivity {
    public static Bluetooth bluetooth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
    }

    public static void startBluetooth(){

        bluetooth=new Bluetooth();
        bluetooth.start();
    }

    public void onButtonScouting(View v){
        String user=((EditText)findViewById(R.id.txtboxUsername)).getText().toString();
        int robot=Integer.parseInt(((EditText)findViewById(R.id.txtboxTeamNum)).getText().toString());

        Intent i=new Intent(this,Scouting.class);
        i.putExtra("user",user);
        i.putExtra("robot",robot);
        startActivity(i);
    }

    public void onButtonRobot(View v){
        String user=((EditText)findViewById(R.id.txtboxUsername)).getText().toString();
        int robot=Integer.parseInt(((EditText)findViewById(R.id.txtboxTeamNum)).getText().toString());

        Intent i=new Intent(this,Robot.class);
        i.putExtra("user",user);
        i.putExtra("robot",robot);
        startActivity(i);
    }
}
