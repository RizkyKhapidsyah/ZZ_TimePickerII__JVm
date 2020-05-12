package com.rk.tp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TimePicker TP_TimePicker_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TP_TimePicker_IDJAVA = findViewById(R.id.TP_TimePicker_IDXML);
        TP_TimePicker_IDJAVA.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(getApplicationContext(), hourOfDay + ":" + minute, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
