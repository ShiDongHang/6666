package com.example.cal;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button bpoint;
    private Button b_plus;
    private Button b_minus;
    private Button b_div;
    private Button b_result;
    private Button b_mul;
    private Button b_clean;
    private TextView textView1;
    private Boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       textView1 = findViewById(R.id.textView1);

        Button b0 = findViewById(R.id.b0);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button bpoint = findViewById(R.id.bpoint);
        Button b_plus = findViewById(R.id.b_plus);
        Button b_minus = findViewById(R.id.b_minus);
        Button b_mul=findViewById(R.id.b_mul);
        Button b_div = findViewById(R.id.b_div);
        Button b_result = findViewById(R.id.b_result);
        Button b_clean=findViewById(R.id.b_clean);

        flag=true;

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "0");


            }


        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "1");

            }


        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView1.setText(textView1.getText().toString() + "2");

            }


        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "3");

            }


        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "4");

            }


        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "5");

            }


        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "6");

            }


        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "7");

            }


        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "8");

            }


        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + "9");

            }


        });
        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + ".");

            }


        });


        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() +" "+"+"+" ");

            }


        });

        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + " "+"-"+" ");

            }
        });

        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView1.setText(textView1.getText().toString() + " "+"*"+" ");

            }
        });


        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(textView1.getText().toString()+" "+"/"+" ");
            }
        });


        b_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getResult();
            }
        });

      b_clean.setOnClickListener(new View.OnClickListener(){
          public void onClick(View view){

              textView1.setText("");
          }
      });


    }

        private void getResult(){

        String words=textView1.getText().toString();

        double result=0;


        String s1 = words.substring(0,words.indexOf(" "));

        String s2 = words.substring(words.indexOf(" ")+1,words.indexOf(" ")+2);

        String s3=words.substring(words.indexOf(" ")+3);
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s3);



        if(s2.equals("+")){
            result=a+b;
            textView1.setText(result+"");
        }


       else if(s2.equals("-")){

                result=a-b;
            textView1.setText(result+"");
            }

       else if(s2.equals("*")){

                result=a*b;


              textView1.setText(result+"");


            }

        else    if(s2.equals("/")){

                result=a/b;
            textView1.setText(result+"");
            }








    }

}