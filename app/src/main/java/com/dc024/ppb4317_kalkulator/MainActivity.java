package com.dc024.ppb4317_kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Mendefinisikan Variable element
    private EditText etAngka1, etAngka2;
    private Button btTambah, btKurang, btKali, btBagi;
    private TextView tvDisclaimer, tvHasil;

    // Variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mendaftarkan element
        etAngka1 = findViewById(R.id.etAngka1);
        etAngka2 = findViewById(R.id.etAngka2);
        btTambah = findViewById(R.id.btTambah);
        btKurang = findViewById(R.id.btKurang);
        btKali = findViewById(R.id.btKali);
        btBagi = findViewById(R.id.btBagi);
        tvDisclaimer = findViewById(R.id.tvDisclaimer);
        tvHasil = findViewById(R.id.tvHasil);

        btTambah.setOnClickListener(new View.OnClickListener() {
            private void doNothing() {

            }
            @Override
            public void onClick(View view) {
                if (!etAngka1.getText().toString().trim().equalsIgnoreCase("") && !etAngka2.getText().toString().trim().equalsIgnoreCase("")){
                    tvDisclaimer.setVisibility(View.VISIBLE);
                    tvHasil.setText("" + etAngka1.getText().toString().trim() + " + " + etAngka2.getText().toString().trim() + " = " + hitungCalculator(Double.parseDouble(etAngka1.getText().toString().trim()), Double.parseDouble(etAngka2.getText().toString().trim()), "tambah"));
                    tvHasil.setVisibility(View.VISIBLE);
                    etAngka1.setText("");
                    etAngka2.setText("");
                }else {
                    Toast.makeText(MainActivity.this, "Harap lengkapi isian yang tersedia !", Toast.LENGTH_LONG).show();
                }
            }
        });

        btKurang.setOnClickListener(new View.OnClickListener() {
            private void doNothing() {

            }
            @Override
            public void onClick(View view) {
                if (!etAngka1.getText().toString().trim().equalsIgnoreCase("") && !etAngka2.getText().toString().trim().equalsIgnoreCase("")){
                    tvDisclaimer.setVisibility(View.VISIBLE);
                    tvHasil.setText("" + etAngka1.getText().toString().trim() + " - " + etAngka2.getText().toString().trim() + " = " + hitungCalculator(Double.parseDouble(etAngka1.getText().toString().trim()), Double.parseDouble(etAngka2.getText().toString().trim()), "kurang"));
                    tvHasil.setVisibility(View.VISIBLE);
                    etAngka1.setText("");
                    etAngka2.setText("");
                }else {
                    Toast.makeText(MainActivity.this, "Harap lengkapi isian yang tersedia !", Toast.LENGTH_LONG).show();
                }
            }
        });

        btKali.setOnClickListener(new View.OnClickListener() {
            private void doNothing() {

            }
            @Override
            public void onClick(View view) {
                if (!etAngka1.getText().toString().trim().equalsIgnoreCase("") && !etAngka2.getText().toString().trim().equalsIgnoreCase("")){
                    tvDisclaimer.setVisibility(View.VISIBLE);
                    tvHasil.setText("" + etAngka1.getText().toString().trim() + " x " + etAngka2.getText().toString().trim() + " = " + hitungCalculator(Double.parseDouble(etAngka1.getText().toString().trim()), Double.parseDouble(etAngka2.getText().toString().trim()), "kali"));
                    tvHasil.setVisibility(View.VISIBLE);
                    etAngka1.setText("");
                    etAngka2.setText("");
                }else {
                    Toast.makeText(MainActivity.this, "Harap lengkapi isian yang tersedia !", Toast.LENGTH_LONG).show();
                }
            }
        });

        btBagi.setOnClickListener(new View.OnClickListener() {
            private void doNothing() {

            }
            @Override
            public void onClick(View view) {
                if (!etAngka1.getText().toString().trim().equalsIgnoreCase("") && !etAngka2.getText().toString().trim().equalsIgnoreCase("")){
                    tvDisclaimer.setVisibility(View.VISIBLE);
                    tvHasil.setText("" + etAngka1.getText().toString().trim() + " / " + etAngka2.getText().toString().trim() + " = " + hitungCalculator(Double.parseDouble(etAngka1.getText().toString().trim()), Double.parseDouble(etAngka2.getText().toString().trim()), "bagi"));
                    tvHasil.setVisibility(View.VISIBLE);
                    etAngka1.setText("");
                    etAngka2.setText("");
                }else {
                    Toast.makeText(MainActivity.this, "Harap lengkapi isian yang tersedia !", Toast.LENGTH_LONG).show();
                }
            }
        });



    }

    private double hitungCalculator(double angka1, double angka2, String sOperator){
        if (sOperator.equalsIgnoreCase("tambah")){
            return angka1 + angka2;
        }else if (sOperator.equalsIgnoreCase("kurang")){
            return angka1 - angka2;
        }else if (sOperator.equalsIgnoreCase("kali")){
            return angka1 * angka2;
        }else if (sOperator.equalsIgnoreCase("bagi")){
            return angka1 / angka2;
        }else{
            return 0;
        }
    }
}