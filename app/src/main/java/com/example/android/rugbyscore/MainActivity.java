package com.example.android.rugbyscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;
    String teamAName = "Team A";
    String teamBName = "Team B";

    TextView displayTeamAName;
    TextView displayTeamBName;
    TextView displayTeamAScore;
    TextView displayTeamBScore;

    final String SCORE_A = "scoreA";
    final String SCORE_B = "scoreB";
    final String NAME_A = "scoreA";
    final String NAME_B = "scoreB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayTeamAScore = findViewById(R.id.team_A_Score);
        displayTeamBScore = findViewById(R.id.team_B_Score);
        displayTeamAName = findViewById(R.id.team_A_Name);
        displayTeamBName = findViewById(R.id.team_B_Name);

        displayTeamAScore.setText(""+teamAScore);
        displayTeamBScore.setText(""+teamBScore);
        displayTeamAName.setText(teamAName);
        displayTeamBName.setText(teamBName);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_A, teamAScore);
        outState.putInt(SCORE_B, teamBScore);
        outState.putString(NAME_A, teamAName);
        outState.putString(NAME_B, teamBName);

    }

    /** Restores app data on new state screen rotation */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        teamAScore =(savedInstanceState.getInt(SCORE_A));
        teamBScore =(savedInstanceState.getInt(SCORE_B));
        teamAName =(savedInstanceState.getString(NAME_A));
        teamBName =(savedInstanceState.getString(NAME_B));

    }
    /** set team a score and display */
    public void teamATwoPoint (View view) {
        teamAScore+=2;
        displayTeamA(teamAScore);
    }
    public void teamAThreePoint (View view) {
        teamAScore+=3;
        displayTeamA(teamAScore);
    }
    public void teamAFivePoint (View view) {
        teamAScore+=5;
        displayTeamA(teamAScore);
    }
    /** set team b score and display */
    public void teamBTwoPoint (View view) {
        teamBScore+=2;
        displayTeamB(teamBScore);
    }
    public void teamBThreePoint (View view) {
        teamBScore+=3;
        displayTeamB(teamBScore);
    }
    public void teamBFivePoint (View view) {
        teamBScore+=5;
        displayTeamB(teamBScore);
    }

    public void reset (View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayTeamA(teamAScore);
        displayTeamB(teamBScore);
    }

    public void displayTeamA (int teamAScore) {

        displayTeamAScore.setText (""+teamAScore);
    }
    public void displayTeamB (int teamBScore) {

        displayTeamBScore.setText (""+teamBScore);}

    public void setNames(View view) {
    }
}
