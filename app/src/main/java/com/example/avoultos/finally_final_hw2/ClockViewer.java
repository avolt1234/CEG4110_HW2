package com.example.avoultos.finally_final_hw2;

import android.content.Context;
import android.view.View;

import java.util.Calendar;

public abstract class ClockViewer {
    private Context context;

    public ClockViewer(Context context){
        this.context = context;
    }

    public View getClockView(){
        return null;
    }

    public abstract void refreshTime(Calendar cal);
}
