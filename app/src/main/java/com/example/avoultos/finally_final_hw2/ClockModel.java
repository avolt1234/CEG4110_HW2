package com.example.avoultos.finally_final_hw2;

import java.util.Calendar;

public class ClockModel {

    private Calendar cal;

    public ClockModel() {
        cal = Calendar.getInstance();
    }

    public Calendar getCal() {
        return cal;
    }

    public void setCal(Calendar cal) {
        this.cal = cal;
    }
}
