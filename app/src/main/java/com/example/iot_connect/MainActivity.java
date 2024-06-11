package com.example.iot_connect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch botaoSwitch;
    private ToggleButton botaoToogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoSwitch = findViewById(R.id.btnswitch);
    //    botaoToogle = findViewById(R.id.btnToogle);
    }

    public void btnListner(){
        botaoSwitch.setOnCheckedChangeListener((buttonView, isChecked));
    }
}