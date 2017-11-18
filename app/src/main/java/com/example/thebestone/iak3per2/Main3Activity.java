package com.example.thebestone.iak3per2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    int Score;

    Button btn1, btn2, btn3;
    TextView txtScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn1 = findViewById(R.id.btnPoint1);
        btn2 = findViewById(R.id.btnPoint2);
        btn3 = findViewById(R.id.btnPoint3);

        txtScore = findViewById(R.id.txtScore);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateScore(1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateScore(2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateScore(3);
            }
        });
    }

    private void upDateScore(int point) {
        Score = Score + point;
        txtScore.setText(Score+"");
    }

}
