package com.example.amst4;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class CalendarViewActivity extends AppCompatActivity {

    CalendarView calendarView_id;
    TextView myDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_view);

        calendarView_id = (CalendarView) findViewById(R.id.calendarView_id);
        myDate = (TextView) findViewById(R.id.myDate);

        calendarView_id.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int i, int i1, int i2) {
                String date = (i1 + 1) + "/" + i2 + "/" + i;
                myDate.setText(date);
            }
        });

    }
}