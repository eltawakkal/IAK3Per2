package com.example.thebestone.iak3per2;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    CardView cardCalc, cardScore, cardFamily;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        inisialisasi();

        cardCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
            }
        });

        cardScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this, Main3Activity.class));
            }
        });

        cardFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this, Main4Activity.class));
            }
        });
    }

    private void inisialisasi() {
        cardCalc = findViewById(R.id.cardCalc);
        cardScore = findViewById(R.id.cardScore);
        cardFamily = findViewById(R.id.cardFamily);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.action_tentang){
            AlertDialog.Builder pesan = new AlertDialog.Builder(this);

            pesan.setTitle("Tentang");
            pesan.setMessage("Aplikasi ku dari IAK Batch 3");
            pesan.setCancelable(false);
            pesan.setPositiveButton("Oke", null);
            pesan.create().show();
        }

        return true;
    }
}
