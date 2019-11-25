package com.example.counquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity2 extends Activity {
    Button a_choice2, b_choice2, c_choice2, d_choice2;

    ImageView flag_pic;

    List<CountryItems> list;

    Random r;

    int turn = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        flag_pic = (ImageView) findViewById((R.id.flag_pic));
        a_choice2 = (Button) findViewById((R.id.a_choice2));
        b_choice2 = (Button) findViewById((R.id.b_choice2));
        c_choice2 = (Button) findViewById((R.id.c_choice2));
        d_choice2 = (Button) findViewById((R.id.d_choice2));

        list = new ArrayList<>();

        for (int i = 0; 1 < new Database().answers.length; i++) {
            list.add(new CountryItems(new Database().capitals[1], new Database().flags[1]));

        }


        Collections.shuffle(list);

        newQuestion(turn);

        a_choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a_choice2.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    Toast.makeText(MainActivity2.this, "Correct", Toast.LENGTH_LONG).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(MainActivity2.this, "quiz finsihed", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity2.this, "wrong", Toast.LENGTH_LONG).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(MainActivity2.this, "finished", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        b_choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b_choice2.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    Toast.makeText(MainActivity2.this, "Correct", Toast.LENGTH_LONG).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(MainActivity2.this, "quiz finsihed", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity2.this, "wrong", Toast.LENGTH_LONG).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(MainActivity2.this, "finished", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        c_choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c_choice2.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    Toast.makeText(MainActivity2.this, "Correct", Toast.LENGTH_LONG).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(MainActivity2.this, "quiz finsihed", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity2.this, "wrong", Toast.LENGTH_LONG).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(MainActivity2.this, "finished", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        d_choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (d_choice2.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    Toast.makeText(MainActivity2.this, "Correct", Toast.LENGTH_LONG).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(MainActivity2.this, "quiz finsihed", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity2.this, "wrong", Toast.LENGTH_LONG).show();
                    if (turn < list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else {
                        Toast.makeText(MainActivity2.this, "finished", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }


    private void newQuestion(int number){
        flag_pic.setImageResource(list.get(number-1).getImage());
        int correct_answer = r.nextInt(4 +1);

        int firstButton= number -1;
        int secondButton;
        int thirdButton;
        int forthButton;

        switch (correct_answer){
            case 1:
            a_choice2.setText(list.get(firstButton).getName());

            do{
                secondButton = r.nextInt(list.size());
            } while(secondButton == firstButton);
            do{
                    thirdButton = r.nextInt(list.size());
            } while(thirdButton == secondButton || thirdButton == firstButton);
            do{
                    forthButton = r.nextInt(list.size());
            } while(forthButton == thirdButton || forthButton ==  secondButton  || forthButton == firstButton);

            b_choice2.setText(list.get(secondButton).getName());
            c_choice2.setText(list.get(thirdButton).getName());
            d_choice2.setText(list.get(forthButton).getName());
            case 2:
                b_choice2.setText(list.get(firstButton).getName());

                do{
                    secondButton = r.nextInt(list.size());
                } while(secondButton == firstButton);
                do{
                    thirdButton = r.nextInt(list.size());
                } while(thirdButton == secondButton || thirdButton == firstButton);
                do{
                    forthButton = r.nextInt(list.size());
                } while(forthButton == thirdButton || forthButton ==  secondButton  || forthButton == firstButton);

                a_choice2.setText(list.get(secondButton).getName());
                c_choice2.setText(list.get(thirdButton).getName());
                d_choice2.setText(list.get(forthButton).getName());
            case 3:
                c_choice2.setText(list.get(firstButton).getName());

                do{
                    secondButton = r.nextInt(list.size());
                } while(secondButton == firstButton);
                do{
                    thirdButton = r.nextInt(list.size());
                } while(thirdButton == secondButton || thirdButton == firstButton);
                do{
                    forthButton = r.nextInt(list.size());
                } while(forthButton == thirdButton || forthButton ==  secondButton  || forthButton == firstButton);

                a_choice2.setText(list.get(secondButton).getName());
                b_choice2.setText(list.get(thirdButton).getName());
                d_choice2.setText(list.get(forthButton).getName());
            case 4:
                d_choice2.setText(list.get(firstButton).getName());

                do{
                    secondButton = r.nextInt(list.size());
                } while(secondButton == firstButton);
                do{
                    thirdButton = r.nextInt(list.size());
                } while(thirdButton == secondButton || thirdButton == firstButton);
                do{
                    forthButton = r.nextInt(list.size());
                } while(forthButton == thirdButton || forthButton ==  secondButton  || forthButton == firstButton);

                a_choice2.setText(list.get(secondButton).getName());
                b_choice2.setText(list.get(thirdButton).getName());
                c_choice2.setText(list.get(forthButton).getName());

        }

    }


}
