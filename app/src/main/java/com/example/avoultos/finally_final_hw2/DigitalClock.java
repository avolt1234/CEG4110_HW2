package com.example.avoultos.finally_final_hw2;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class DigitalClock extends ClockViewer{

    private TextView tv;

    public DigitalClock(Context context, ClockControllers cc){
        super(context);
        tv = new TextView(context);
        int second = cc.getSecond();
        int minute = cc.getMinute();
        int hour = cc.getHour();
        tv.setText(hour + ":" + minute + ":" + second);
    }

    public View getClockView(){
        return tv;
    }

    @Override
    public void refreshTime(Calendar cal) {
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        tv.setText(hour + ":" + minute + ":" + second);
    }

}
