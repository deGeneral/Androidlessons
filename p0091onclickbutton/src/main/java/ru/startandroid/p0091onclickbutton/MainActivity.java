package ru.startandroid.p0091onclickbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        OnClickListener oclBtnOk = new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка Ok");
            }

        };

        btnOk.setOnClickListener(oclBtnOk);

        OnClickListener oclBtnCancel = new OnClickListener() {

            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата снопка Cancel");
            }
        };

        btnCancel.setOnClickListener(oclBtnCancel);

    }
}
