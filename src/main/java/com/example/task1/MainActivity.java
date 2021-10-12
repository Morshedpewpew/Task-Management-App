package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int val1;
    private int val2;
    private int count=0;
    public Button button1, button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button1=findViewById(R.id.button1);
         button2=findViewById(R.id.button2);
         newRand();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val1>val2)
                {
                    count++;
                }
                else
                {
                    Toast t1= Toast.makeText(getApplicationContext(),"Wrong answer",Toast.LENGTH_SHORT);
                    t1.show();
                }

                TextView score=findViewById(R.id.score);
                score.setText("Score - "+ count);
                newRand();

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val1<val2)
                {
                    count++;
                }
                else
                {
                    Toast t2= Toast.makeText(getApplicationContext(),"Wrong answer",Toast.LENGTH_SHORT);
                    t2.show();
                }

                TextView score=findViewById(R.id.score);
                score.setText("Score - "+ count);
                newRand();

            }
        });



    }

    public void newRand(){
        Random rand= new Random();
        val1=rand.nextInt(50);
        val2=rand.nextInt(50);





        button1.setText(Integer.toString(val1));
        button2.setText(Integer.toString(val2));

    }
}