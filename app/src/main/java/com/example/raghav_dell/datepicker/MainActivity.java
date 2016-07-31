package com.example.raghav_dell.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;
    DatePicker date;
    EditText change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changedate();
    }

    public void changedate() {
        change = (EditText) findViewById(R.id.editText);
        date = (DatePicker) findViewById(R.id.datePicker);
        b = (Button) findViewById(R.id.button);
        change.setText(get());
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change.setText(get());
            }
        });}

    public String get() {
        StringBuilder builder = new StringBuilder();
        builder.append((date.getDayOfMonth()) + "/" + (date.getMonth() + 1) + "/" + (date.getYear()));
        return builder.toString();

    }
}



