package com.example.linzw.caculate;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.javia.arity.Symbols;
import org.javia.arity.SyntaxException;

import static com.example.linzw.caculate.R.id.add_button;
import static com.example.linzw.caculate.R.id.btn_0;
import static com.example.linzw.caculate.R.id.btn_1;
import static com.example.linzw.caculate.R.id.btn_2;
import static com.example.linzw.caculate.R.id.btn_3;
import static com.example.linzw.caculate.R.id.btn_4;
import static com.example.linzw.caculate.R.id.btn_5;
import static com.example.linzw.caculate.R.id.btn_6;
import static com.example.linzw.caculate.R.id.btn_7;
import static com.example.linzw.caculate.R.id.btn_8;
import static com.example.linzw.caculate.R.id.btn_9;
import static com.example.linzw.caculate.R.id.btn_div;
import static com.example.linzw.caculate.R.id.btn_equ;
import static com.example.linzw.caculate.R.id.btn_mult;
import static com.example.linzw.caculate.R.id.btn_sub;
import static com.example.linzw.caculate.R.id.c_button;
import static com.example.linzw.caculate.R.id.dec_button;
import static com.example.linzw.caculate.R.id.display_edit;
import static com.example.linzw.caculate.R.id.display_result;
import static com.example.linzw.caculate.R.id.dot_button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  onClick(View view)
    {
            switch (view.getId())
            {
                case  c_button:
                {
                    TextView display_zone=(TextView)findViewById(R.id.display_edit);
                    display_zone.setText("");
                    TextView format_zone=(TextView)findViewById(R.id.display_result);
                    format_zone.setText("");
                }
                break;
                case add_button:
                case dot_button:
               // case dec_button:
                case btn_0:
                case btn_1:
                case btn_2:
                case btn_3:
                case  btn_4:
                case  btn_5:
                case  btn_6:
                case btn_7 :
                case  btn_8 :
                case btn_9 :
                case  btn_div:
                case btn_mult:
                case btn_sub:
                {
                    Log.d("test","test1");
                    Button btn=(Button)view;
                    Log.d("test","test2");
                    String btn_value=btn.getText().toString();
                    Log.d("test","test3");
                    TextView  edit_display=(TextView)findViewById(R.id.display_edit);
                    Log.d("test","test4");
                    String content_edit=edit_display.getText().toString();
                    Log.d("test","test5");
                    String new_content_edit=content_edit+btn_value;
                    Log.d("test","test6");
                    edit_display.setText(new_content_edit);
                    Log.d("test","test7");

                }
                break;
                case btn_equ:
                {

                    try {
                        TextView tw =(TextView)findViewById(display_edit);
                        String  formal=tw.getText().toString();
                        Symbols symbol=new Symbols();
                        double formalContent=symbol.eval(formal);
                        TextView ts =(TextView)findViewById(display_result);
                        ts.setText(String.valueOf(formalContent));

                    } catch (SyntaxException e)
                    {
                        Toast.makeText(this,"error",Toast.LENGTH_SHORT).show();
                    }


                }
                break;
            }
    }
}
