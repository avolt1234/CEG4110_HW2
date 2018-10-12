package com.example.avoultos.finally_final_hw2;

import android.content.Context;

import com.turki.vectoranalogclockview.VectorAnalogClock;

public class AnalogClock extends VectorAnalogClock {

    public void init(){
        initializeSimple();
    }

    public AnalogClock(Context ctx) {
        super(ctx);
        init();
    }
}
