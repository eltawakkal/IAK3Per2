package com.example.thebestone.iak3per2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    String[] nama = {"Bapak", "Mama", "Nenek"};
    int[] gambar = {R.drawable.bapak, R.drawable.mama, R.drawable.nenek};

    ImageView imgProfil;
    TextView txtNama;
    Button btnBack, btnNext;

    int posisi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        inisialisasi();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (posisi != 0) {
                    posisi = posisi - 1;

                    imgProfil.setImageResource(gambar[posisi]);
                    txtNama.setText(nama[posisi]);
                }
                else {
                    Toast.makeText(Main4Activity.this, "Anda dihalaman pertama", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (posisi != 2) {
                    posisi = posisi + 1;

                    imgProfil.setImageResource(gambar[posisi]);
                    txtNama.setText(nama[posisi]);
                }
                else {
                    Toast.makeText(Main4Activity.this, "Anda dihalaman terakhir", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void inisialisasi() {
        imgProfil = findViewById(R.id.imgProfil);
        txtNama = findViewById(R.id.txtNama);
        btnBack = findViewById(R.id.btnBack);
        btnNext = findViewById(R.id.btnNext);
    }
}
