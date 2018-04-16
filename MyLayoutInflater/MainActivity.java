package org.techtown.mytest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //editText = (EditText) findViewById(R.id.editText4);
        frameLayout = (FrameLayout) findViewById(R.id.container);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                inflater.inflate(R.layout.sub1,frameLayout,true); //객체화 시킬 수 있다. sub1을 어느뷰에 붙여줄것인가!
            }
        });

    }

    public void onButton1Clicked(View v){
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        editText = (EditText) findViewById(R.id.editText4);
        String message = editText.getText().toString();
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    public void onButton2Clicked(View v){
        finish();
    }

}
