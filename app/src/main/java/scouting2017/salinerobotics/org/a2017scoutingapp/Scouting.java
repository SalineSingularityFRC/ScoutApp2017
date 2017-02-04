package scouting2017.salinerobotics.org.a2017scoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*import android.widget.Toast;
import android.content.Context;*/

public class Scouting extends AppCompatActivity {
    public String user;
    public int robot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scouting);

        Intent i=getIntent();
        user=i.getStringExtra("user");
        robot=i.getIntExtra("robot",-1);

        /*if(!(robot>0)){
            Context context = getApplicationContext();
            CharSequence text = "Enter a valid team number!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            finish();
        }*/
    }


}
