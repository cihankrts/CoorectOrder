package com.cihan.correctorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.TypedArrayUtils;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public String selectedElement;
    private int temp = 0;
    private int selectedNumber;
    private int count;
    private int timeCounter;
    private int wrongClickCounter=0;

    private long startTime;
    private final Handler handler2 = new Handler();



    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;
    private Button mBtn4;
    private Button mBtn5;
    private Button mBtn6;
    private Button mBtn7;
    private Button mBtn8;
    private Button mBtn9;
    private TextView mtimeCounter;
    String[] buttonsMain = {"mBtn1","mBtn2","mBtn3","mBtn4","mBtn5","mBtn6","mBtn7","mBtn8",
            "mBtn9"};
    ArrayList<String> rakamlarMainArrayList = new ArrayList<String>(Arrays.asList("1", "2", "3",
                    "4",
                    "5",
                    "6","7",
            "8","9"));
    ArrayList<String> buttons = new ArrayList<String>();

    public void init(){
        mBtn1 = (Button) findViewById(R.id.btn1);
        mBtn2 = (Button) findViewById(R.id.btn2);
        mBtn3 = (Button) findViewById(R.id.btn3);
        mBtn4 = (Button) findViewById(R.id.btn4);
        mBtn5 = (Button) findViewById(R.id.btn5);
        mBtn6 = (Button) findViewById(R.id.btn6);
        mBtn7 = (Button) findViewById(R.id.btn7);
        mBtn8 = (Button) findViewById(R.id.btn8);
        mBtn9 = (Button) findViewById(R.id.btn9);
        mtimeCounter = (TextView) findViewById(R.id.timeCounter);

    }


    public void fillTheButtons(){
        for (int i=0; i<9; i++)
        {
            final int random = new Random().nextInt((rakamlarMainArrayList.size()-1) + 1);

            selectedElement = rakamlarMainArrayList.get(random);
            buttons.add(i,String.valueOf(selectedElement));
            rakamlarMainArrayList.remove(random);
        }
        mBtn1.setText(buttons.get(0));
        mBtn2.setText(buttons.get(1));
        mBtn3.setText(buttons.get(2));
        mBtn4.setText(buttons.get(3));
        mBtn5.setText(buttons.get(4));
        mBtn6.setText(buttons.get(5));
        mBtn7.setText(buttons.get(6));
        mBtn8.setText(buttons.get(7));
        mBtn9.setText(buttons.get(8));
    }

    @Override
    public void onClick(View v) {
         switch (v.getId())
         {
             case R.id.btn1:
             {
                 selectedNumber = Integer.valueOf(mBtn1.getText().toString());
                 if (temp+1==selectedNumber)
                 {
                     mBtn1.setTextSize(80);
                     temp = selectedNumber;
                     if (temp==9){     handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this,"Tebrikler oyunu kazandınız :) Süreniz:" +
                                 "  " + mtimeCounter.getText() + " sn", Toast.LENGTH_LONG).show();
                     }

                 }else{
                     wrongClickCounter++;
                     if (wrongClickCounter==3)
                     {
                         mBtn1.setBackgroundColor(Color.RED);
                         handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this," Maalesef 3 kere yanlış seçim yaptınız" +
                                 " :( ", Toast.LENGTH_LONG).show();

                     }
                   //  Toast.makeText(MainActivity.this,"Sıralamayı doğru bulamadınız...",
                  //           Toast.LENGTH_SHORT).show();
                    // fillTheButtons();
                 }
                 break;
             }
             case R.id.btn2:
             {
                 selectedNumber = Integer.valueOf(mBtn2.getText().toString());
                 if (temp+1==selectedNumber)
                 {
                     mBtn2.setTextSize(80);
                     temp = selectedNumber;
                     if (temp==9){     handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this,"Tebrikler oyunu kazandınız :) Süreniz:  " + mtimeCounter.getText()+ " sn", Toast.LENGTH_LONG).show();
                     }

                 }else{
                     wrongClickCounter++;
                     if (wrongClickCounter==3)
                     {
                         mBtn2.setBackgroundColor(Color.RED);
                         handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this," Maalesef 3 kere yanlış seçim yaptınız" +
                                 " :( ", Toast.LENGTH_LONG).show();

                     }
                     //     Toast.makeText(MainActivity.this,"Sıralamayı doğru bulamadınız...",
                     //             Toast.LENGTH_SHORT).show();
                     //  fillTheButtons();
                 }
                 break;
             }
             case R.id.btn3:
             {
                 selectedNumber = Integer.valueOf(mBtn3.getText().toString());
                 if (temp+1==selectedNumber)
                 {
                     mBtn3.setTextSize(80);
                     temp = selectedNumber;
                     if (temp==9){      handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this,"Tebrikler oyunu kazandınız :) Süreniz:  " + mtimeCounter.getText()+ " sn", Toast.LENGTH_LONG).show();
                     }

                 }else{
                     wrongClickCounter++;
                     if (wrongClickCounter==3)
                     {
                         mBtn3.setBackgroundColor(Color.RED);
                         handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this," Maalesef 3 kere yanlış seçim yaptınız" +
                                 " :( ", Toast.LENGTH_LONG).show();

                     }
                     //     Toast.makeText(MainActivity.this,"Sıralamayı doğru bulamadınız...",
                     //             Toast.LENGTH_SHORT).show();
                     //   fillTheButtons();
                 }
                 break;
             }
             case R.id.btn4:
             {
                 selectedNumber = Integer.valueOf(mBtn4.getText().toString());
                 if (temp+1==selectedNumber)
                 {
                     mBtn4.setTextSize(80);
                     temp = selectedNumber;
                     if (temp==9){    handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this,"Tebrikler oyunu kazandınız :) Süreniz:  " + mtimeCounter.getText()+ " sn", Toast.LENGTH_LONG).show();
                     }

                 }else{
                     wrongClickCounter++;
                     if (wrongClickCounter==3)
                     {
                         mBtn4.setBackgroundColor(Color.RED);
                         handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this," Maalesef 3 kere yanlış seçim yaptınız" +
                                 " :( ", Toast.LENGTH_LONG).show();

                     }
                     //     Toast.makeText(MainActivity.this,"Sıralamayı doğru bulamadınız...",
                     //           Toast.LENGTH_SHORT).show();
                     //   fillTheButtons();
                 }
                 break;
             }
             case R.id.btn5:
             {
                 selectedNumber = Integer.valueOf(mBtn5.getText().toString());
                 if (temp+1==selectedNumber)
                 {
                     mBtn5.setTextSize(80);
                     temp = selectedNumber;
                     if (temp==9){   handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this,"Tebrikler oyunu kazandınız :) Süreniz:" +
                                 "  " + mtimeCounter.getText()+ " sn", Toast.LENGTH_LONG).show();
                     }

                 }else{
                     wrongClickCounter++;
                     if (wrongClickCounter==3)
                     {
                         mBtn5.setBackgroundColor(Color.RED);
                         handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this," Maalesef 3 kere yanlış seçim yaptınız" +
                                 " :( ", Toast.LENGTH_LONG).show();

                     }
                     //    Toast.makeText(MainActivity.this,"Sıralamayı doğru bulamadınız...",
                     //            Toast.LENGTH_SHORT).show();
                     //    fillTheButtons();
                 }
                 break;
             }
             case R.id.btn6:
             {
                 selectedNumber = Integer.valueOf(mBtn6.getText().toString());
                 if (temp+1==selectedNumber)
                 {
                     mBtn6.setTextSize(80);
                     temp = selectedNumber;
                     if (temp==9){    handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this,"Tebrikler oyunu kazandınız :) Süreniz:  " + mtimeCounter.getText()+ " sn", Toast.LENGTH_LONG).show();
                     }

                 }else{
                     wrongClickCounter++;
                     if (wrongClickCounter==3)
                     {
                         mBtn6.setBackgroundColor(Color.RED);
                         handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this," Maalesef 3 kere yanlış seçim yaptınız" +
                                 " :( ", Toast.LENGTH_LONG).show();

                     }
                     //    Toast.makeText(MainActivity.this,"Sıralamayı doğru bulamadınız...",
                     //           Toast.LENGTH_SHORT).show();
                     //  fillTheButtons();
                 }
                 break;
             }
             case R.id.btn7:
             {
                 selectedNumber = Integer.valueOf(mBtn7.getText().toString());
                 if (temp+1==selectedNumber)
                 {
                     mBtn7.setTextSize(80);
                     temp = selectedNumber;
                     if (temp==9){    handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this,"Tebrikler oyunu kazandınız :) Süreniz:  " + mtimeCounter.getText()+ " sn", Toast.LENGTH_LONG).show();
                     }

                 }else{
                     wrongClickCounter++;
                     if (wrongClickCounter==3)
                     {
                         mBtn7.setBackgroundColor(Color.RED);
                         handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this," Maalesef 3 kere yanlış seçim yaptınız" +
                                 " :( ", Toast.LENGTH_LONG).show();

                     }
                     //    Toast.makeText(MainActivity.this,"Sıralamayı doğru bulamadınız...",
                     //           Toast.LENGTH_SHORT).show();
                     //  fillTheButtons();
                 }
                 break;
             }
             case R.id.btn8:
             {
                 selectedNumber = Integer.valueOf(mBtn8.getText().toString());
                 if (temp+1==selectedNumber)
                 {
                     mBtn8.setTextSize(80);
                     temp = selectedNumber;
                     if (temp==9){      handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this,"Tebrikler oyunu kazandınız :) Süreniz:  " + mtimeCounter.getText()+ " sn", Toast.LENGTH_LONG).show();
                     }

                 }else{
                     wrongClickCounter++;
                     if (wrongClickCounter==3)
                     {
                         mBtn8.setBackgroundColor(Color.RED);
                         handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this," Maalesef 3 kere yanlış seçim yaptınız" +
                                 " :( ", Toast.LENGTH_LONG).show();

                     }
                     //     Toast.makeText(MainActivity.this,"Sıralamayı doğru bulamadınız...",
                     //           Toast.LENGTH_SHORT).show();
                     //    fillTheButtons();
                 }
                 break;
             }
             case R.id.btn9:
             {
                 selectedNumber = Integer.valueOf(mBtn9.getText().toString());
                 if (temp+1==selectedNumber)
                 {

                     mBtn9.setTextSize(80);
                     temp = selectedNumber;
                     if (temp==9){
                         handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this,
                                 "Tebrikler oyunu kazandınız :) Süreniz:  " + mtimeCounter.getText() + " sn" ,
                                 Toast.LENGTH_LONG).show();
                     }

                 }else{
                     wrongClickCounter++;
                     if (wrongClickCounter==3)
                     {
                         mBtn9.setBackgroundColor(Color.RED);
                         handler2.removeCallbacksAndMessages(null);
                         Toast.makeText(MainActivity.this," Maalesef 3 kere yanlış seçim yaptınız" +
                                 " :( ", Toast.LENGTH_LONG).show();

                     }
                     //      Toast.makeText(MainActivity.this,"Sıralamayı doğru bulamadınız...",
                     //           Toast.LENGTH_SHORT).show();
                     //   fillTheButtons();
                 }
                 break;
             }


         }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        // fillTheButtons functionu random bir sekilde ekrandaki butonları rakamlarla dolduruyor
        fillTheButtons();

        // zorluk derecesinden gönderilen değer

        Intent intent = getIntent();
        String value = intent.getStringExtra("valueNumber");
        count = Integer.valueOf(value);

        // süre başlatılıyor


            startTime = System.currentTimeMillis();
            handler2.post(new Runnable() {
                @Override
                public void run() {
                    long diff = System.currentTimeMillis() - startTime;
                    mtimeCounter.setText(Long.toString(diff / 1000));
                    handler2.postDelayed(this, 1000);
                }

            });
            





        // 3 saniye sonra buttonlardaki textlerin görünürlüğünü kaldırıyor (aslında text duruyor
        // boyut 0 oluyor)
       new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
             mBtn1.setTextSize(0);
            // mBtn1.setBackgroundResource(R.drawable.human);
            mBtn2.setTextSize(0);
                // mBtn2.setBackgroundResource(R.drawable.human);
             mBtn3.setTextSize(0);
                //  mBtn3.setBackgroundResource(R.drawable.human);
             mBtn4.setTextSize(0);
                //   mBtn4.setBackgroundResource(R.drawable.human);
             mBtn5.setTextSize(0);
                //   mBtn5.setBackgroundResource(R.drawable.human);
             mBtn6.setTextSize(0);
                //  mBtn6.setBackgroundResource(R.drawable.human);
            mBtn7.setTextSize(0);
                //  mBtn7.setBackgroundResource(R.drawable.human);
           mBtn8.setTextSize(0);
                //    mBtn8.setBackgroundResource(R.drawable.human);
            mBtn9.setTextSize(0);
                //   mBtn9.setBackgroundResource(R.drawable.human);


           }

         }, count);

          mBtn1.setOnClickListener(this);
          mBtn2.setOnClickListener(this);
          mBtn3.setOnClickListener(this);
          mBtn4.setOnClickListener(this);
          mBtn5.setOnClickListener(this);
          mBtn6.setOnClickListener(this);
          mBtn7.setOnClickListener(this);
          mBtn8.setOnClickListener(this);
          mBtn9.setOnClickListener(this);
          


    }
}





