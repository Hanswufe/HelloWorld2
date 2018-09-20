package com.example.administrator.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.name;

public class Hello extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        TextView text = (TextView) findViewById(R.id.textView4);
        text.setText("Hello swufer!");
        TextView text2 = (TextView) findViewById(R.id.textView2);
        text2.setText("centigrade:");
        Button btn = (Button) findViewById(R.id.button);
        //btn.setOnClickListener(this);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText input1 = (EditText) findViewById(R.id.editText2);
                String name = input1.getText().toString();
                TextView text = (TextView) findViewById(R.id.textView4);
                if(isNumber(name)){
                    double c = Double.parseDouble(name);
                    text.setText("The Fahrenheit is:"+(9.0/5*c+32));
                }else{
                    text.setText("Sorry,your input is illegal!");
                    input1.setText("");
                }
            }

        });

    }

    @Override
    public void onClick(View view) {
        EditText input1 = (EditText) findViewById(R.id.editText2);
        String name = input1.getText().toString();
        EditText input2 = (EditText) findViewById(R.id.editText4);
        String psw = input2.getText().toString();
        TextView text = (TextView) findViewById(R.id.textView4);
        if(name.equals("han") && psw.equals("123")){
            text.setText("Hello " + name + "!");
        }else{
            text.setText("Sorry!");
        }

    }
    public static boolean isNumber(String str){
        String reg = "^[0-9]+(.[0-9]+)?$";
        return str.matches(reg);
    }
}
