package com.moin.my_calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    int counter;
    TextView tv1;
    Button buttonsave,buttontextcolor,buttonbachground,buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        buttonbachground=findViewById(R.id.btnBgcolor);
        buttonback=findViewById(R.id.btnback);
        buttontextcolor=findViewById(R.id.btntxtcolor);
    //    buttonsave=findViewById(R.id.btnsave);
        tv1=findViewById(R.id.tvgetdata);
      //  tv1.setTextColor(getResources().getColor(R.color.green));




        // getting intent from First activity(Mainactivity.class)


      Intent collect_intent=getIntent();
      String collect_data=collect_intent.getStringExtra("key");

        try{
         tv1.setText(collect_data );
       }
       catch(NullPointerException e){
           Toast.makeText(getApplicationContext(),"exception occuring",Toast.LENGTH_SHORT).show();
       }


        //   button text color listener
        buttontextcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                counter++;

                switch (counter) {

                    case 1:
                        tv1.setTextColor(getResources().getColor(R.color.gray));
                        break;
                    case 2:
                        tv1.setTextColor(getResources().getColor(R.color.steelblue));
                        break;
                    case 3:
                        tv1.setTextColor(getResources().getColor(R.color.blue));
                        break;
                    case 4:
                        tv1.setTextColor(getResources().getColor(R.color.orange));
                        break;
                    case 5:
                        tv1.setTextColor(getResources().getColor(R.color.green));
                        break;
                    case 6:
                        tv1.setTextColor(getResources().getColor(R.color.brown));
                        break;
                    case 7:
                        tv1.setTextColor(getResources().getColor(R.color.cyan));
                        break;
                    case 8:
                        if(counter==8) {
                            counter=0;
                            tv1.setTextColor(getResources().getColor(R.color.gray));
                        }
                        break;
                }




            }
        });

        //   button back ground color listener

        buttonbachground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;

                switch (counter) {

                    case 1:
                        tv1.setBackgroundColor(getResources().getColor(R.color.gray));
                        break;
                    case 2:
                        tv1.setBackgroundColor(getResources().getColor(R.color.steelblue));
                        break;
                    case 3:
                        tv1.setBackgroundColor(getResources().getColor(R.color.blue));
                        break;
                    case 4:
                        tv1.setBackgroundColor(getResources().getColor(R.color.orange));
                        break;
                    case 5:
                        tv1.setBackgroundColor(getResources().getColor(R.color.green));
                        break;
                    case 6:
                        tv1.setBackgroundColor(getResources().getColor(R.color.brown));
                        break;
                    case 7:
                        tv1.setBackgroundColor(getResources().getColor(R.color.cyan));
                        break;
                    case 8:
                        if(counter==8) {
                            counter=0;
                            tv1.setBackgroundColor(getResources().getColor(R.color.gray));
                        }
                        break;
                }

            }
        });

        //      button save on click listener
//        buttonsave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                ColorDrawable viewColor = (ColorDrawable) tv1.getBackground();
//               int colorbackground = viewColor.getColor();
//
//
//               SharedPreferences sharedPreferences=getSharedPreferences("my_preferences",MODE_PRIVATE);
//
//                SharedPreferences.Editor myEditor=sharedPreferences.edit();
//               myEditor.putString("name",tv1.getText().toString());
//                myEditor.putInt("textcolor",tv1.getCurrentTextColor());
//                myEditor.putInt("background",colorbackground);
//
//
//
//                myEditor.apply();
//
//            }
//        });

        //     button back  listener
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Toast.makeText(getApplicationContext(),"back",Toast.LENGTH_SHORT).show();



            }
        });

    }

@Override
    public void onPause(){
        super.onPause();

              ColorDrawable viewColor = (ColorDrawable) tv1.getBackground();
              int colorbackground = viewColor.getColor();
              SharedPreferences sharedPreferences=getSharedPreferences("my_preferences",MODE_PRIVATE);
                SharedPreferences.Editor myEditor=sharedPreferences.edit();
               myEditor.putString("name",tv1.getText().toString());
                myEditor.putInt("textcolor",tv1.getCurrentTextColor());
                myEditor.putInt("background",colorbackground);
                myEditor.apply();

    }
}
