package com.example.abhishek.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        int scoreTeamA = 0;
        int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null){
            scoreTeamA = savedInstanceState.getInt("TeamA");
            displayForTeamA(scoreTeamA);
            scoreTeamB = savedInstanceState.getInt("TeamB");
            displayForTeamB(scoreTeamB);
        }
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThreeB(View view){
         scoreTeamB += 3 ;
        displayForTeamB(scoreTeamB);
    }

    public void plusTwoB(View view){
         scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowB(View view){
         scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void plusThreeA(View view){
        scoreTeamA += 3 ;
        displayForTeamA(scoreTeamA);
    }

    public void plusTwoA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void resetButton(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("TeamA", scoreTeamA);
        outState.putInt("TeamB", scoreTeamB);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
