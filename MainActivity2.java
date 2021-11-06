package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView totalAnalyze,mathAnalyze,chineseAnalyze,englishAnalyze,csAnalyze;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent2 = getIntent();
        Bundle bd2 = intent2.getExtras();
        totalAnalyze = findViewById(R.id.totalAnalyze);
        mathAnalyze = findViewById(R.id.mathAnalyze);
        chineseAnalyze = findViewById(R.id.chineseAnalyze);
        englishAnalyze = findViewById(R.id.englishAnalyze);
        csAnalyze = findViewById(R.id.csAnalyze);

        String total1 = bd2.getString("strzonghe1");
        String total2 = bd2.getString("strwendingxing1");
        String math = bd2.getString("strMath");
        String chinese = bd2.getString("strChinese");
        String English = bd2.getString("strEnglish");
        String CS = bd2.getString("strCS");

        totalAnalyze.setText(String.valueOf(total1) + String.valueOf(total2));
        mathAnalyze.setText(math);
        chineseAnalyze.setText(chinese);
        englishAnalyze.setText(English);
        csAnalyze.setText(CS);




    }

    public void secondback(View view) {
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}