package com.example.darkmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.mahfa.dnswitch.DayNightSwitch;
import com.mahfa.dnswitch.DayNightSwitchListener;

public class MainActivity extends AppCompatActivity {

    DayNightSwitch dayNightSwitch;
    Switch aSwitch;
    View bg_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch=findViewById(R.id.switch_toggle);
       aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(isChecked)
               {
                   Toast.makeText(MainActivity.this, "Night selected", Toast.LENGTH_SHORT).show();
                   getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
           }
           else {
                   Toast.makeText(MainActivity.this, "Day mode selected", Toast.LENGTH_SHORT).show();
                   getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);

                }
            }
        });
    }
}
