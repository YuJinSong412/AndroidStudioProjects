package org.techtown.doitmission04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView2);
    }

    public void onButton1Clicked(View v){
        String message = editText.getText().toString();
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    public void onButton2Clicked(View v){
        finish();
    }
}
