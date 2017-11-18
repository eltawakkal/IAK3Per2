package com.example.thebestone.iak3per2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editAngka1;
    EditText editAngka2;
    Button btnKalikan, btnBagikan;
    TextView txtHasil;

    int a1;
    int a2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialaisasi EditText
        //editAngka1 = (EditText) findViewById(R.id.editAngka1);
        editAngka1 = (EditText) findViewById(R.id.editAngka1);
        editAngka2 = findViewById(R.id.editAngka2);

        //inisialaisasi Button
        btnKalikan = findViewById(R.id.btnKalikan);
        btnBagikan = findViewById(R.id.btnBagikan);

        //inisialaisasi TextView
        txtHasil = findViewById(R.id.txtHasil);

        btnKalikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a1 = Integer.parseInt(editAngka1.getText().toString());
                a2 = Integer.parseInt(editAngka2.getText().toString());

                kalikanWOi(a1, a2);
            }
        });

        btnBagikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
    }

    private void setIdentisas(String nama, String asal) {
        txtHasil.setText("Nama : " + nama + "\nAsal : " + asal);
    }

    public void reset(){
        editAngka1.setText("");
        editAngka2.setText("");

        editAngka1.requestFocus();
    }

    public void kalikanWOi(int angka1, int angka2){
        txtHasil.setText("Hasil Perkalian = " + (angka1*angka2));
    }

    public void bagiaknWOi(int angka1, int angka2){
        txtHasil.setText("Hasil Pembagian = " + (angka1/angka2));
    }

}
