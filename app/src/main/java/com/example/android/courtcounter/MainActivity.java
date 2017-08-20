package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA;
    int scoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void threePointsA(View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void twoPointsA(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void reset(View view){
        scoreA=scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    public void freeThrowA(View view){
        scoreA++;
        displayForTeamA(scoreA);
    }
    public void threePointsB(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void twoPointsB(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void freeThrowB(View view){
        scoreB++;
        displayForTeamB(scoreB);
    }


    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
