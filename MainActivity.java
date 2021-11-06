package com.example.myapplication;
import java.util.stream.DoubleStream;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button buttonback;
    private TextView textView1;
    private TextView textView2;
    private  TextView textView3;
    private TextView textView4;
    private  TextView textView5;
    private  TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private  TextView rankMath;
    private  TextView rankChinese;
    private TextView rankEnglish;
    private TextView rankCS;
    private TextView weightMean;
    private  TextView totaljidian;
    private  TextView totalxuefen;
    private  TextView generalRank;
    private  TextView balance;
    private String show1 ;
    private  String show2 ;
    private String show3 ;
    private String show4 ;
    private String show5 ;
    private String sho6 ;
    private String show7 ;
    private String show8 ;
    @Override

    @SuppressLint("SetTextI18n")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=findViewById(R.id.next);
        buttonback=findViewById(R.id.back);

        Intent intent2=getIntent();
        Bundle bd = intent2.getExtras();
        textView1=(TextView)findViewById(R.id.mm);
        textView2=(TextView)findViewById(R.id.ms);
        textView3=(TextView)findViewById(R.id.cm);
        textView4=(TextView)findViewById(R.id.cs);
        textView5=(TextView)findViewById(R.id.em);
        textView6=(TextView)findViewById(R.id.es);
        textView7=(TextView)findViewById(R.id.csm);
        textView8=(TextView)findViewById(R.id.css);
        TextView rankMath= findViewById(R.id.rankMath);
        TextView rankChinese= findViewById(R.id.rankChinese);
        TextView rankEnglish= findViewById(R.id.rankEnglish);;
        TextView rankCS= findViewById(R.id.rankCS);;
        TextView weightMean= findViewById(R.id.weightMean);;
        TextView totaljidian= findViewById(R.id.totaljidian);;
        TextView totalxuefen= findViewById(R.id.totalxuefen);;
        TextView generalRank= findViewById(R.id.generalRank);;
        TextView balance= findViewById(R.id.balance);;




        String show1 =bd.getString("mm");
        String show2 =bd.getString("ms");
        String show3 =bd.getString("cm");
        String show4 =bd.getString("cs");
        String show5 =bd.getString("em");
        String show6 =bd.getString("es");
        String show7 =bd.getString("csm");
        String show8 =bd.getString("css");









        //转成double型
        Double num1 = Double.parseDouble("".equals(show1.toString())?"0.00":show1.toString());

        Double num2=Double.parseDouble("".equals(show2.toString())?"0.00":show2.toString());
        Double num3=Double.parseDouble("".equals(show3.toString())?"0.00":show3.toString());
        Double num4=Double.parseDouble("".equals(show4.toString())?"0.00":show4.toString());
        Double num5=Double.parseDouble("".equals(show5.toString())?"0.00":show5.toString());
        Double num6=Double.parseDouble("".equals(show6.toString())?"0.00":show6.toString());
        Double num7=Double.parseDouble("".equals(show7.toString())?"0.00":show7.toString());
        Double num8=Double.parseDouble("".equals(show8.toString())?"0.00":show8.toString());



        //显示成绩
        textView1.setText("成绩：" + String.valueOf(show1) );

        textView3.setText("成绩：" + String.valueOf(show3) );

        textView5.setText("成绩：" + String.valueOf(show5) );

        textView7.setText("成绩：" + String.valueOf(show7) );

        Double totalmark=num2+num4+num6+num8;//总学分
        final Double weightmean =(num1*num2+num3*num4+num5*num6+num7*num8)/(num2+num4+num6+num8);//加权平均分
        Double[] array = {num1, num2, num3, num4, num5, num6, num7, num8};
        Double[] jidianzu = new Double [4];
        String[] rank =new String[4];
        final String[] analyze = new String[4];
        //绩点数组

        for (int i=0;i<array.length;i+=2) {
            if(array[i]>100) {
                System.out.println("error");

            }
            else if (array[i]>=90) {
                rank[i/2]="A";
                jidianzu[i/2]=4.0;
                analyze[i/2]="成绩表现优异，请继续努力！";
            }
            else if (array[i]>=86) {
                rank[i/2]="A-";
                jidianzu[i/2]=3.7;
                analyze[i/2]="成绩表现良好，请继续努力！";
            }
            else if (array[i]>=83) {
                rank[i/2]="B+";
                jidianzu[i/2]=3.3;
                analyze[i/2]="成绩表现一般，请继续努力！";
            }
            else if (array[i]>=80) {
                rank[i/2]="B";
                jidianzu[i/2]=3.0;
                analyze[i/2]="成绩表现一般，请继续努力！";
            }else if (array[i]>=76) {
                rank[i/2]="B-";
                jidianzu[i/2]=2.7;
                analyze[i/2]="你已经处在挂科边缘了！";
            }
            else if (array[i]>=73) {
                rank[i/2]="C+";
                jidianzu[i/2]=2.3;
                analyze[i/2]="你已经处在挂科边缘了！";
            }
            else if (array[i]>=70) {
                rank[i/2]="C";
                jidianzu[i/2]=2.0;
                analyze[i/2]="你已经处在挂科边缘了！";
            }
            else if (array[i]>=66) {
                rank[i/2]="C-";
                jidianzu[i/2]=1.7;
                analyze[i/2]="你已经处在挂科边缘了！";
            }
            else if (array[i]>=63) {
                rank[i/2]="D+";
                jidianzu[i/2]=1.3;
                analyze[i/2]="你已经处在挂科边缘了！";
            }
            else if (array[i]>=60) {
                rank[i/2]="D";
                jidianzu[i/2]=1.0;
                analyze[i/2]="你已经处在挂科边缘了！";
            }
            else if (array[i]>=0) {
                rank[i/2]="F";
                jidianzu[i/2]=0.0;
                analyze[i/2]="你已经挂科了！";
            }
        }

        //综合评级
        String rankzonghe = "";

        if (weightmean > 90) {
            rankzonghe = "A";

        }
        else if (weightmean > 86) {
            rankzonghe = "A-";
        }
        else if (weightmean > 83) {
            rankzonghe = "B+";
        }
        else if (weightmean > 80) {
            rankzonghe = "B";
        }
        else if (weightmean > 76) {
            rankzonghe = "B-";
        }
        else if (weightmean > 73) {
            rankzonghe = "C+";
        }
        else if (weightmean > 70) {
            rankzonghe = "C";
        }
        else if (weightmean > 66) {
            rankzonghe = "C-";
        }
        else if (weightmean > 63) {
            rankzonghe = "D+";
        }
        else if (weightmean > 60) {
            rankzonghe = "D";
        }
        else if (weightmean > 0) {
            rankzonghe = "F";
        }







        //稳定性   strwendingxing为待传输至活动2
        Double mean = num1 + num3 + num5 + num7;
        final Double fangcha = (num1-mean)*(num1-mean) + (num3-mean)*(num3-mean) + (num5-mean)*(num5-mean) +(num7-mean)*(num7-mean);
        String wendingxing ="" ;
        String strwendingxing ="" ;
        if (fangcha>=10.0) {
            wendingxing  = "差";

        }
        else if (fangcha>4.00) {
            wendingxing = "较差";

        }
        else if (fangcha>1.00) {
            wendingxing = "良好";

        }
        else if (fangcha>0.00) {
            wendingxing = "优秀";


        }

        //总绩点计算
        Double totaljidiand =( num2*jidianzu[0] + num4*jidianzu[1] + num6*jidianzu[2] + num8*jidianzu[3])/totalmark;
        rankMath.setText(rank[0]);
        rankChinese.setText(rank[1]);
        rankEnglish.setText(rank[2]);
        rankCS.setText(rank[3]);
        textView2.setText("学分：" + jidianzu[0]);
        textView4.setText("学分：" +jidianzu[1]);
        textView6.setText("学分：" + jidianzu[2] );
        textView8.setText("学分：" + jidianzu[3] );

        weightMean.setText(String.valueOf(weightmean));
        totaljidian.setText(String.valueOf(totaljidiand));
        totalxuefen.setText(String.valueOf(totalmark));
        generalRank.setText(rankzonghe);
        balance.setText(wendingxing);

        //传输数据










        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent intent2 = new Intent(MainActivity.this,MainActivity2.class);
                final String strMath,strChinese,strEnglish,strCS;
                //成绩评价时用到的等级，strzonghe待传输至活动2
                String strzonghe ="";
                if (weightmean>90) {
                     strzonghe = "你的总体成绩表现为优秀";
                }

                else if (weightmean>85) {
                    strzonghe ="你的总体成绩表现为良好";
                }
                else if (weightmean>75) {
                    strzonghe ="你的总体成绩表现为一般";
                }
                else if (weightmean>60) {
                    strzonghe ="你的总体成绩表现为较差";
                }
                else if (weightmean>0) {
                    strzonghe ="你的总体成绩表现为不合格";
                }

                String strwendingxing = "";
                if (fangcha>=10.0) {

                    strwendingxing = "，但存在偏科现象，请注意！";
                }
                else if (fangcha>4.00) {

                    strwendingxing = "，但部分存在偏科现象，请注意！";
                }
                else if (fangcha>1.00) {

                    strwendingxing = "，无明显偏科现象，继续努力吧！";
                }
                else if (fangcha>0.00) {

                    strwendingxing = "无偏科现象，请继续努力！";

                }

                strMath = analyze[0];
                strChinese = analyze[1];
                strEnglish = analyze[2];
                strCS = analyze[3];
                Bundle bd2 = new Bundle();
                bd2.putString("strzonghe1",strzonghe);
                bd2.putString("strwendingxing1",strwendingxing);
                bd2.putString("strMath",strMath);
                bd2.putString("strChinese",strChinese);
                bd2.putString("strEnglish",strEnglish);
                bd2.putString("strCS",strCS);
                intent2.putExtras(bd2);







                startActivity(intent2);
            }
        });
        buttonback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Intent intent2 = new Intent(MainActivity.this,MainActivity3.class);

                startActivity(intent2);
            }
        });




    }




}