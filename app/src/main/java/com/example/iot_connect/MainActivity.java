package com.example.iot_connect;


import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Switch btnSwitch;
    private TextView switchStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSwitch = findViewById(R.id.btnswitch);
        switchStatus = findViewById(R.id.switchStatus);

        btnSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                switchStatus.setText("Switch is ON");
            } else {
                switchStatus.setText("Switch is OFF");
            }
        });
    }
}
