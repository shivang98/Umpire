package com.streakcoder.shivang_agarwal.umpire;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int scoreCount = 0;
    private int wkt = 0;
    private double overs = 0;
    private int ballsLeft = 60;
    private int balls = 0;
    private int ov = 0;
    private TextView scoreShow;
    private TextView ovrs;
    private TextView ballslft;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn6;
    private Button btnnb;
    private Button btnwd;
    private Button btnb;
    private Button btnwkt;
    private Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreShow = (TextView) findViewById(R.id.score_id);
        ovrs = (TextView) findViewById(R.id.over_id);
        ballslft = (TextView) findViewById(R.id.ballsLeft_id);

        clear = (Button)findViewById(R.id.clear_id);
        clear.setOnClickListener(this);

        btnwkt = (Button) findViewById(R.id.wkt_id);
        btnwkt.setOnClickListener(this);

        btn1 = (Button) findViewById(R.id.one_id);
        btn1.setOnClickListener(this);

        btn2 = (Button) findViewById(R.id.two_id);
        btn2.setOnClickListener(this);

        btn3 = (Button) findViewById(R.id.three_id);
        btn3.setOnClickListener(this);

        btn4 = (Button) findViewById(R.id.four_id);
        btn4.setOnClickListener(this);

        btn6 = (Button) findViewById(R.id.six_id);
        btn6.setOnClickListener(this);

        btnnb = (Button) findViewById(R.id.noball_id);
        btnnb.setOnClickListener(this);

        btnwd = (Button) findViewById(R.id.wide_id);
        btnwd.setOnClickListener(this);

        btnb = (Button) findViewById(R.id.ball_id);
        btnb.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view == clear){
            scoreCount = 0;
            wkt = 0;
            overs = 0;
            ballsLeft = 60;
            balls = 0;
            ov = 0;
        }
        if (ballsLeft == 0) {
            Toast tost = Toast.makeText(this,"No more balls left.",Toast.LENGTH_LONG);
            tost.show();
        } else {
            if (view == btn1) {
                scoreCount += 1;
                ballsLeft--;
                balls++;
            } else if (view == btn2) {
                scoreCount += 2;
                ballsLeft--;
                balls++;
            } else if (view == btn3) {
                scoreCount += 3;
                ballsLeft--;
                balls++;
            } else if (view == btn4) {
                scoreCount += 4;
                ballsLeft--;
                balls++;
            } else if (view == btn6) {
                scoreCount += 6;
                ballsLeft--;
                balls++;
            } else if (view == btnwkt) {
                wkt += 1;
                ballsLeft--;
                balls++;
            } else if (view == btnnb) {
                scoreCount += 1;
            } else if (view == btnwd) {
                scoreCount += 1;
            } else if (view == btnb) {
                ballsLeft--;
                balls++;
            }

            if (balls == 6) {
                ov++;
                balls = 0;
            }

            scoreShow.setText("Score: " + scoreCount + " - " + wkt);
            ballslft.setText("Balls Left: " + ballsLeft);
            ovrs.setText("Over: " + ov + "." + balls);
        }
    }
}
