package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
     TextView textView;
    Button button;
    private EditText mm,ms,cm,cs,em,es,csm,css;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button=findViewById(R.id.next);

         mm=findViewById(R.id.edit_mathmark);
         ms=findViewById(R.id.edit_mathscore);
         cm=findViewById(R.id.edit_chinesemark);
         cs=findViewById(R.id.edit_chinesescore);
         em=findViewById(R.id.edit_englishmark);
         es=findViewById(R.id.edit_englishscore);
         csm=findViewById(R.id.edit_csmark);
         css=findViewById(R.id.edit_csscore);





        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String mm1,ms1,cm1,cs1,em1,es1,csm1,css1;
                mm1=mm.getText().toString();
                ms1=ms.getText().toString();
                cm1=cm.getText().toString();
                cs1=cs.getText().toString();
                em1=em.getText().toString();
                es1=es.getText().toString();
                csm1=csm.getText().toString();
                css1 = css.getText().toString();
                 Intent intent2 = new Intent(MainActivity3.this,MainActivity.class);
                Bundle bd = new Bundle();
                bd.putString("mm",mm1);
                bd.putString("ms",ms1);
                bd.putString("cm",cm1);
                bd.putString("cs",cs1);
                bd.putString("em",em1);
                bd.putString("es",es1);
                bd.putString("mm",mm1);
                bd.putString("csm",csm1);
                bd.putString("css",css1);
                intent2.putExtras(bd);
                startActivity(intent2);
            }
        });


    }


}