package com.example.volekss.baseballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int totalRunsTeamA = 0;
    int totalOutsTeamA = 0;
    int totalRunsTeamB = 0;
    int totalOutsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayRunsNOutsTeamA(totalRunsTeamA, totalOutsTeamA);
        displayRunsNOutsTeamB(totalRunsTeamB, totalOutsTeamB);

    }

    public void displayRunsNOutsTeamA(int RunsTeamA, int OutsTeamA) {
        TextView runsView = (TextView) findViewById(R.id.team_a_run);
        TextView outsView = (TextView) findViewById(R.id.team_a_out);
        runsView.setText(String.valueOf(RunsTeamA));
        outsView.setText(String.valueOf(OutsTeamA));
    }

    public void displayRunsNOutsTeamB(int runsTeamB, int outsTeamB) {
        TextView runsView = (TextView) findViewById(R.id.team_b_run);
        TextView outsView = (TextView) findViewById(R.id.team_b_out);
        runsView.setText(String.valueOf(runsTeamB));
        outsView.setText(String.valueOf(outsTeamB));
    }

    /**
     * Team A
     */

    public void runForTeamA(View view) {
        if (isTeamAOut()) {
            displayRunsNOutsTeamA(totalRunsTeamA, totalOutsTeamA);
        } else {
            totalRunsTeamA++;
            displayRunsNOutsTeamA(totalRunsTeamA, totalOutsTeamA);
        }
    }

    public void outForTeamA(View view) {
        if (isTeamAOut()) displayRunsNOutsTeamA(totalRunsTeamA, totalOutsTeamA);
        else {
            totalOutsTeamA++;
            displayRunsNOutsTeamA(totalRunsTeamA, totalOutsTeamA);
        }
    }

    public boolean isTeamAOut() {
        return (totalOutsTeamA >= 3);
    }


    /**
     * Team B
     */

    public void runForTeamB(View view) {
        if (isTeamBOut()) displayRunsNOutsTeamB(totalRunsTeamB, totalOutsTeamB);
        else {
            totalRunsTeamB++;
            displayRunsNOutsTeamB(totalRunsTeamB, totalOutsTeamB);
        }
    }

    public void outForTeamB(View view) {
        if (isTeamBOut()) displayRunsNOutsTeamB(totalRunsTeamB, totalOutsTeamB);
        else {
            totalOutsTeamB++;
            displayRunsNOutsTeamB(totalRunsTeamB, totalOutsTeamB);
        }
    }

    public boolean isTeamBOut() {
        return (totalOutsTeamB >= 3);
    }


    public void resetScore (View view) {
        totalRunsTeamA = 0;
        totalOutsTeamA = 0;
        totalRunsTeamB = 0;
        totalOutsTeamB = 0;
        displayRunsNOutsTeamA(totalRunsTeamA, totalOutsTeamA);
        displayRunsNOutsTeamB(totalRunsTeamB, totalOutsTeamB);
    }
}
