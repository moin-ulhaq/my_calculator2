package com.moin.my_calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    float value1,value2;

    private TextView textView;
    Button dot,plus,minus,devide,multiply,percentage,equal,clear,_1,_2,_3,_4,_5,_6,_7,_8,_9,_0,activityCh;
    boolean booladd,boolsub,boolmultip,booldiv,boolmod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.tv1);



        plus = findViewById(R.id.btnplus);
        minus = findViewById(R.id.btnsubtract);
        multiply = findViewById(R.id.btnmultip);
        devide = findViewById(R.id.btndivide);
        percentage = findViewById(R.id.btnmodulus);
        equal = findViewById(R.id.btnequal);
        clear = findViewById(R.id.btnclear);
        activityCh = findViewById(R.id.btnActivityChange);
        dot = findViewById(R.id.btndot);
        _0 = findViewById(R.id.btn0);
        _1 = findViewById(R.id.btn1);
        _2 = findViewById(R.id.btn2);
        _3 = findViewById(R.id.btn3);
        _4 = findViewById(R.id.btn4);
        _5 = findViewById(R.id.btn5);
        _6 = findViewById(R.id.btn6);
        _7 = findViewById(R.id.btn7);
        _8 = findViewById(R.id.btn8);
        _9 = findViewById(R.id.btn9);

//        try {
//
//
//            SharedPreferences sharedPreferences = getSharedPreferences("my_preferences", MODE_PRIVATE);
//            String str_pref = sharedPreferences.getString("name", "");
//            int _color=sharedPreferences.getInt("textcolor",0);
//           int _background=sharedPreferences.getInt("background", 0);
//
//            Toast.makeText(getApplicationContext(), str_pref, Toast.LENGTH_SHORT).show();
//            textView.setText(str_pref);
//            textView.setTextColor(_color);
//            textView.setBackgroundColor(_background);
//         //   textView.setBackgroundResource(_background);
//
//
//            Log.e("mess", str_pref);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        clear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // textView.setText(null);
                Toast.makeText(getApplicationContext(), "calling", Toast.LENGTH_SHORT).show();

                textView.setText(textView.getText().toString().substring(0, textView.getText().toString().length() - 1));


            }
        });

        equal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    value2 = Float.parseFloat(textView.getText() + "");
                    if (booladd == true) {
                        textView.setText(value1 + value2 + "");
                        booladd = false;
                    }

                    if (boolsub == true) {
                        textView.setText(value1 - value2 + "");
                        boolsub = false;
                    }
                    if (boolmultip == true) {
                        textView.setText(value1 * value2 + "");
                        boolmultip = false;
                    }
                    if (booldiv == true) {
                        textView.setText(value1 / value2 + "");
                        booldiv = false;
                    }
                    if (boolmod == true) {
                        textView.setText(value1 % value2 + " ");
                        boolmod = false;
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "provide value first", Toast.LENGTH_SHORT).show();
                }

            }
        });

        _0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {


                textView.setText(textView.getText().toString() + "0");
                // value2=Integer.parseInt(textView.getText().toString());
                // textView.setText("0");
//              value2=Integer.parseInt(textView.getText().toString());
            }
        });

        _1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(textView.getText() + "1");
                // value2=Integer.parseInt(textView.getText().toString());


                // textView.setText( "1");
                //value2=Integer.parseInt(textView.getText().toString());
            }
        });

        _2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "2");

                //textView.setText("2");
                // value2=Integer.parseInt(textView.getText().toString());
            }
        });
        _3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "3");

                //textView.setText("3");
                // value2=Integer.parseInt(textView.getText().toString());
            }
        });
        _4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "4");

                //textView.setText("4");
                // value2=Integer.parseInt(textView.getText().toString());
            }
        });
        _5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "5");

                // textView.setText("5");
                // value2=Integer.parseInt(textView.getText().toString());
            }
        });
        _6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "6");

                // textView.setText("6");
                // value2=Integer.parseInt(textView.getText().toString());
            }
        });
        _7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "7");

                // textView.setText("7");
                // value2=Integer.parseInt(textView.getText().toString());
            }
        });
        _8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "8");

                //textView.setText("8");
                //  value2=Integer.parseInt(textView.getText().toString());
            }
        });
        _9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "9");

                // textView.setText("9");
                // value2=Integer.parseInt(textView.getText().toString());
            }
        });
        dot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + ".");
            }
        });
        plus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // textView.setText("+");
                // operator=textView.getText().toString();
                try {
                    if (textView == null) {
                        textView.setText("");
                    } else {
                        value1 = Float.parseFloat(textView.getText() + "");
                        booladd = true;
                        textView.setText(null);
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Provide value First", Toast.LENGTH_SHORT).show();
                }

            }
        });
        minus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    value1 = Float.parseFloat(textView.getText() + "");
                    boolsub = true;
                    textView.setText(null);
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Provide value First", Toast.LENGTH_SHORT).show();
                }


            }
        });
        multiply.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    value1 = Float.parseFloat(textView.getText() + "");
                    boolmultip = true;
                    textView.setText(null);
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Provide value First", Toast.LENGTH_SHORT).show();

                }


            }
        });
        devide.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    value1 = Float.parseFloat(textView.getText() + "");
                    booldiv = true;
                    textView.setText(null);
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Provide value First", Toast.LENGTH_SHORT).show();
                }


            }
        });
        percentage.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    value1 = Float.parseFloat(textView.getText() + "");
                    boolmod = true;
                    textView.setText(null);
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Provide value First", Toast.LENGTH_SHORT).show();
                }
            }
        });
        activityCh.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = textView.getText().toString();
                Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
                intent1.putExtra("key", data);
                startActivity(intent1);

            }
        });
    }



    @Override
    protected void onResume() {
        super.onResume();

        try {


            SharedPreferences sharedPreferences = getSharedPreferences("my_preferences", MODE_PRIVATE);
            String str_pref = sharedPreferences.getString("name", "");
            int _color=sharedPreferences.getInt("textcolor",0);
            int _background=sharedPreferences.getInt("background", 0);

            Toast.makeText(getApplicationContext(), str_pref, Toast.LENGTH_SHORT).show();
            textView.setText(str_pref);
            textView.setTextColor(_color);
            textView.setBackgroundColor(_background);
            //   textView.setBackgroundResource(_background);


            Log.e("mess", str_pref);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
