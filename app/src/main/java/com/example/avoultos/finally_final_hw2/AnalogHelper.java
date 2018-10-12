package com.example.avoultos.finally_final_hw2;

import android.content.Context;
import android.view.View;

import java.util.Calendar;

public class AnalogHelper extends ClockViewer{
    private AnalogClock analclock;

    public AnalogHelper(Context context){
        super(context);
        analclock = new AnalogClock(context);
    }

    @Override
    public View getClockView(){
        return analclock;
    }

    public void setTimes(Calendar cal){
        analclock.setCalendar(cal);
    }

    public void refreshTime(Calendar cal){
        analclock.setCalendar(cal);
    }
}
