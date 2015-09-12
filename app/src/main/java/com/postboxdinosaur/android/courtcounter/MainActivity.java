package com.postboxdinosaur.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScores();
    }

    public void displayScores() {
        TextView scoreViewTeamA = (TextView) findViewById(R.id.team_a_score_text_view);
        TextView scoreViewTeamB = (TextView) findViewById(R.id.team_b_score_text_view);

        scoreViewTeamA.setText(String.valueOf(scoreTeamA));
        scoreViewTeamB.setText(String.valueOf(scoreTeamB));
    }

    public void scoreTeamA1(View v) {
        scoreTeamA += 1;
        displayScores();
    }

    public void scoreTeamA2(View v) {
        scoreTeamA += 2;
        displayScores();
    }

    public void scoreTeamA3(View v) {
        scoreTeamA += 3;
        displayScores();
    }

    public void scoreTeamB1(View v) {
        scoreTeamB += 1;
        displayScores();
    }

    public void scoreTeamB2(View v) {
        scoreTeamB += 2;
        displayScores();
    }

    public void scoreTeamB3(View v) {
        scoreTeamB += 3;
        displayScores();
    }

    public void scoreReset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScores();
    }
}
