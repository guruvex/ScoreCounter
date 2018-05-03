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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // link objects to XML
        displayTeamAScore = findViewById(R.id.team_A_Score);
        displayTeamBScore = findViewById(R.id.team_B_Score);
        displayTeamAName = findViewById(R.id.team_A_Name);
        displayTeamBName = findViewById(R.id.team_B_Name);
        // set team names and score
        displayTeamAScore.setText("" + teamAScore);
        displayTeamBScore.setText("" + teamBScore);
        displayTeamAName.setText(teamAName);
        displayTeamBName.setText(teamBName);
    }

    /**
     * save variables in the out bundle
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("Score_A", teamAScore);
        outState.putInt("Score_B", teamBScore);
        outState.putString("Name_A", teamAName);
        outState.putString("Name_B", teamBName);
        super.onSaveInstanceState(outState);
    }

    /**
     * Restores app data on new state screen rotation
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        teamAScore = (savedInstanceState.getInt("Score_A"));
        teamBScore = (savedInstanceState.getInt("Score_B"));
        teamAName = (savedInstanceState.getString("Name_A"));
        teamBName = (savedInstanceState.getString("Name_B"));
    }

    /**
     * set team a score and display
     */
    public void teamATwoPoint(View view) {
        teamAScore += 2;
        displayTeamA(teamAScore);
    }

    public void teamAThreePoint(View view) {
        teamAScore += 3;
        displayTeamA(teamAScore);
    }

    public void teamAFivePoint(View view) {
        teamAScore += 5;
        displayTeamA(teamAScore);
    }

    /**
     * set team b score and display
     */
    public void teamBTwoPoint(View view) {
        teamBScore += 2;
        displayTeamB(teamBScore);
    }

    public void teamBThreePoint(View view) {
        teamBScore += 3;
        displayTeamB(teamBScore);
    }

    public void teamBFivePoint(View view) {
        teamBScore += 5;
        displayTeamB(teamBScore);
    }

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayTeamA(teamAScore);
        displayTeamB(teamBScore);
    }

    public void displayTeamA(int teamAScore) {
        displayTeamAScore.setText("" + teamAScore);
    }

    public void displayTeamB(int teamBScore) {
        displayTeamBScore.setText("" + teamBScore);
    }

}
