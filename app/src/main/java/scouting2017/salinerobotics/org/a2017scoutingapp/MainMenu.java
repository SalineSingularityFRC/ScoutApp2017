package scouting2017.salinerobotics.org.a2017scoutingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
    }

    public void onButtonGo(View v){
        String user=((EditText)findViewById(R.id.txtboxUsername)).getText().toString();
        int robot=Integer.parseInt(((EditText)findViewById(R.id.txtboxPassword)).getText().toString());
    }
}
