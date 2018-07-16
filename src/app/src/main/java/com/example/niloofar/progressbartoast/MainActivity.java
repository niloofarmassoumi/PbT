package com.example.niloofar.progressbartoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){

        EditText maxObj=findViewById(R.id.txt_max);
        EditText progressObj=findViewById(R.id.txt_progress);

        TextView erorrObj=findViewById(R.id.txv_text);

        ProgressBar mainObj=findViewById(R.id.pb_main);

        String temp=maxObj.getText().toString();
        int maxValue=Integer.parseInt(temp);

        temp=progressObj.getText().toString();
        int progressValue=Integer.parseInt(temp);

        if(progressValue<=maxValue){
            mainObj.setMax(maxValue);
            mainObj.setProgress(progressValue);

            erorrObj.setText("");

        }else{
            erorrObj.setText("Erorr");
            erorrObj.setTextColor(Color.RED);

            Toast.makeText(this, "Erorr!", Toast.LENGTH_SHORT).show();
        }
    }
}
