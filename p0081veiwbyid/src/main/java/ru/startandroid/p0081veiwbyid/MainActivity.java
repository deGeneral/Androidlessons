package ru.startandroid.p0081veiwbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.myText);
        myTextView.setText("A new text for my TextView");

        Button myBtn = (Button) findViewById(R.id.myBtn);
        myBtn.setText("My Button");
        myBtn.setEnabled(false);

        CheckBox myCheckBox = (CheckBox) findViewById(R.id.myCheckBox);
        myCheckBox.setChecked(true);
    }
}
