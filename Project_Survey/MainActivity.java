package org.techtown.layoutinflater2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FrameLayout container;
    boolean index = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (FrameLayout) findViewById(R.id.container);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                if(index) {
                    inflater.inflate(R.layout.sub1, container, true);
                    container.setVisibility(View.VISIBLE);
                    index = false;
                }else{
                    container.setVisibility(View.INVISIBLE);
                    index = true;
                }
            }
        });
    }

    public void onButton1Clicked(View v){
        LayoutInflater inflater2 = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater2.inflate(R.layout.sub2,container,true);

        Toast.makeText(this,"시작 버튼을 눌렀습니다.",Toast.LENGTH_LONG).show();
    }

    public void onButton2Clicked(View v){
        Toast.makeText(this,"수고하셨습니다.:)",Toast.LENGTH_LONG).show();

        finish();
    }
}
