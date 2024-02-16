package com.example.date;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private DatePicker time1;
    private TextView showtime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time1 = findViewById(R.id.dp);
        showtime = findViewById(R.id.txt_time);
        Button ok = findViewById(R.id.btn1);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                showtime.setText(getCurrentDate());
            }
        });
    }
    public String getCurrentDate(){
        String CurrentDate = "Current date :"+time1.getDayOfMonth()+"/"+(time1.getMonth()+1)+"/"+time1.getYear();
        return CurrentDate;
    }
}