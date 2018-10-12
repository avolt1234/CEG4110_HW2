package com.example.avoultos.finally_final_hw2;

import java.util.Calendar;
import java.util.Stack;

public class UndoRedo {

    private Stack<Calendar> calStack;
    private Stack<Calendar> redoStack;

    public UndoRedo(){
        calStack = new Stack<>();
        redoStack = new Stack<>();
    }

    //Pushes the previous Cal onto the stack
    public void pushStack(Calendar cal){
        Calendar newcal = Calendar.getInstance();
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        int date = cal.get(Calendar.DAY_OF_WEEK);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        newcal.set(year, month, date, hour, minute, second);
        calStack.push(newcal);

    }

    //Returns the last cal object that was put
    public Calendar popStack(){
        if (calStack.size() > 0){
            Calendar newcal = Calendar.getInstance();
            Calendar cal = calStack.pop();
            int second = cal.get(Calendar.SECOND);
            int minute = cal.get(Calendar.MINUTE);
            int hour = cal.get(Calendar.HOUR);
            int date = cal.get(Calendar.DAY_OF_WEEK);
            int month = cal.get(Calendar.MONTH);
            int year = cal.get(Calendar.YEAR);
            newcal.set(year, month, date, hour, minute, second);
            redoStack.push(newcal);
            return cal;
        } else {
            return null;
        }
    }

    public Calendar redoMe(){
        if (redoStack.size() > 0){
            Calendar cal = redoStack.pop();
            return cal;
        } else {
            return null;
        }
    }
}
