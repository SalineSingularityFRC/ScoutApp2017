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
    public boolean autonomous;
    public long[] gearScoreTimes;
    public int gearI = 0;
    public long[] lowGoalScoreTimes;
    public int lowGoalI = 0;
    public long[] highGoalScoreTimes;
    public int highGoalI = 0;
    public boolean climbed;
    public long climbTime;
    public long endTime = 0;
    public String penalties;
    public String comments;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scouting);

        Intent i=getIntent();
    }
    public void onStartMatchClick (View v)
    {
        startTime = System.currentTimeMillis();
        endTime = startTime + 150000;
    }
    public void onAutonClick (View v)
    {
        autonomous = true;

    }
    public void onGearClick (View v)
    {
        gearI = gearI + 1;
        long gearScored = System.currentTimeMillis();
        gearScoreTimes[gearI] = gearScored;
        this.gearI = gearI;
        this.gearScoreTimes[gearI] = gearScoreTimes[gearI];
    }
    public void onLowGoalClick (View v)
    {
        lowGoalI = lowGoalI + 1;
        long lowGoalScored = System.currentTimeMillis();
        lowGoalScoreTimes[lowGoalI] = lowGoalScored;
    }
    public void onHighGoalClick (View v)
    {
        highGoalI = highGoalI + 1;
        long highGoalScored = System.currentTimeMillis();
        highGoalScoreTimes[highGoalI] = highGoalScored;
    }
    public void onClimbClick (View v)
    {
        climbed = true;
        climbTime = System.currentTimeMillis();
    }
    public void onFinishClick (View v) {
        /*System.out.println("Start time: " + startTime);
        System.out.println("End Time: " + endTime);
        System.out.println("Gears Scored: " + gearI);
        System.out.println("High Goals Scored: " + highGoalI);
        System.out.println("Low Goals Scored: " + lowGoalI);*/

        String penalties =((EditText)findViewById(R.id.txtboxPenalties)).getText().toString();
        String comments =((EditText)findViewById(R.id.txtboxComments)).getText().toString();
    }
}
