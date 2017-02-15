package scouting2017.salinerobotics.org.a2017scoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
/*import android.widget.Toast;
import android.content.Context;*/

public class Scouting extends AppCompatActivity {
    public String user;
    public int robot;
    public long startTime;
    public long[] gearScoreTimes;
    public int gearI = 0;
    public long[] lowGoalScoreTimes;
    public int lowGoalI = 0;
    public long[] highGoalScoreTimes;
    public int highGoalI = 0;
    public long endTime = 0;


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
    public void onStartMatchClick (View v)
    {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 150000;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void onGearClick (View v)
    {
        int gearI = this.gearI;
        gearI = gearI + 1;
        long gearScored = System.currentTimeMillis();
        gearScoreTimes[gearI] = gearScored;
        this.gearI = gearI;
        this.gearScoreTimes[gearI] = gearScoreTimes[gearI];
    }
    public void onLowGoalClick (View v)
    {
        int lowGoalI = this.highGoalI;
        lowGoalI = lowGoalI + 1;
        long lowGoalScored = System.currentTimeMillis();
        lowGoalScoreTimes[lowGoalI] = lowGoalScored;
        this.lowGoalI = lowGoalI;
        this.lowGoalScoreTimes[lowGoalI] = lowGoalScoreTimes[lowGoalI];
    }
    public void onHighGoalClick (View v)
    {
        int highGoalI = this.highGoalI;
        highGoalI = highGoalI + 1;
        long highGoalScored = System.currentTimeMillis();
        highGoalScoreTimes[highGoalI] = highGoalScored;
        this.highGoalI = highGoalI;
        this.highGoalScoreTimes[highGoalI] = highGoalScoreTimes[highGoalI];
    }
    public void onEndMatchClick (View v)
    {
        Intent i = new Intent(this,Robot.class);
        startActivity(i);
    }
}
