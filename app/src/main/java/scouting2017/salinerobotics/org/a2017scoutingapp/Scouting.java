package scouting2017.salinerobotics.org.a2017scoutingapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/*import android.widget.Toast;
import android.content.Context;*/

public class Scouting extends AppCompatActivity {
    public String user;
    public int robot;
    public long startTime;
    public int autonSwitch = 0;
    public boolean autonomous;
    public long[] gearScoreTimes;
    public int gearI = -1;
    public long[] lowGoalScoreTimes;
    public int lowGoalI = -1;
    public long[] highGoalScoreTimes;
    public int highGoalI = -1;
    public int climbSwitch = 0;
    public boolean climbed;
    public long climbTime;
    public long endTime = 0;
    public String penalties;
    public String comments;

    final Button btnStart = (Button) findViewById(R.id.btnStartOfMatch);
    final Button btnAuton = (Button) findViewById(R.id.btnAuton);
    final Button btnClimbed = (Button) findViewById(R.id.btnRopeClimb);
    final EditText txtboxComments = (EditText) findViewById(R.id.txtboxComments);
    final EditText txtboxPenalties = (EditText) findViewById(R.id.txtboxPenalties);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scouting);
        Intent i = getIntent();
    }
    public void onStartMatchClick (View v)
    {
        startTime = System.currentTimeMillis();
        endTime = startTime + 150000;
        btnStart.setBackgroundColor(Color.GREEN);
    }
    public void onAutonClick (View v)
    {
        autonSwitch = autonSwitch + 1;
        if (autonSwitch % 2 == 0 && autonSwitch != 0)
        {
            autonomous = true;
            btnAuton.setBackgroundColor(Color.GREEN);
        }
        else
        {
            autonomous = false;
            btnAuton.setBackgroundColor(Color.RED);
        }
    }
    public void onGearClick (View v)
    {
        gearI = gearI + 1;
        long gearScored = System.currentTimeMillis();
        gearScoreTimes[gearI] = gearScored;
    }
    /*public void onUndoGearClick (View v)
    {
        gearI = gearI - 1;
    }*/
    public void onLowGoalClick (View v)
    {
        lowGoalI = lowGoalI + 1;
        long lowGoalScored = System.currentTimeMillis();
        lowGoalScoreTimes[lowGoalI] = lowGoalScored;
    }
   /* public void onUndoLowGoal (View v)
    {
        lowGoalI = lowGoalI - 1;
    }*/
    public void onHighGoalClick (View v)
    {
        highGoalI = highGoalI + 1;
        long highGoalScored = System.currentTimeMillis();
        highGoalScoreTimes[highGoalI] = highGoalScored;
    }
    /* public void onUndoHighGoal (View v)
    {
        highGoalI = highGoalI - 1;
    }*/
    public void onClimbClick (View v)
    {
        climbSwitch = climbSwitch + 1;
        if (climbSwitch % 2 == 0 && climbSwitch != 0)
        {
            climbed = true;
            btnClimbed.setBackgroundColor(Color.GREEN);
            climbTime = System.currentTimeMillis();
        }
        else
        {
            climbed = false;
            btnClimbed.setBackgroundColor(Color.RED);
        }
    }
    public void onFinishClick (View v)
    {
        String penalties = txtboxPenalties.getText().toString();
        String comments = txtboxComments.getText().toString();
    }
}
