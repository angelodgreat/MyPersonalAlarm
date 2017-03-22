package com.angelo.mypersonalalarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Settings extends AppCompatActivity {

    @BindView(R.id.cb_alarmeveryhour)CheckBox cb_alarmeveryhour;
    @BindView(R.id.cb_mon)CheckBox cb_monday;
    @BindView(R.id.cb_tues)CheckBox cb_tues;
    @BindView(R.id.cb_wed)CheckBox cb_wed;
    @BindView(R.id.cb_thurs)CheckBox cb_thurs;
    @BindView(R.id.cb_fri)CheckBox cb_fri;
    @BindView(R.id.cb_sat)CheckBox cb_sat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);
    }


}
