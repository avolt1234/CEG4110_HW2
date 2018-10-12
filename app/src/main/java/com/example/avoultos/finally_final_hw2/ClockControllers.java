package com.example.avoultos.finally_final_hw2;

import android.content.Context;

import java.util.Calendar;

public class ClockControllers {

    private ClockModel CM;
    private Context context;
    private UndoRedo undoredo;

    public ClockControllers(Context context){
        this.context = context;
        CM = new ClockModel();
        undoredo = new UndoRedo();
    }

    public ClockViewer GimmeAClock(int A){
        if (A == 0){
            return new AnalogHelper(context);
        } else {
            return new DigitalClock(context, this);
        }
    }

    public Calendar returnCal(){
        return CM.getCal();
    }

    public void undo(){
        Calendar newCal = undoredo.popStack();
        CM.setCal(newCal);
    }

    public void redo(){
        Calendar newCal = undoredo.redoMe();
        CM.setCal(newCal);
    }

    public void addSecond(){
        undoredo.pushStack(CM.getCal());
        Calendar newCal = CM.getCal();
        newCal.add(Calendar.SECOND, +1);
        CM.setCal(newCal);
    }

    public void subSecond(){
        undoredo.pushStack(CM.getCal());
        Calendar newCal = CM.getCal();
        newCal.add(Calendar.SECOND, -1);
        CM.setCal(newCal);
    }

    public void addMinute(){
        undoredo.pushStack(CM.getCal());
        Calendar newCal = CM.getCal();
        newCal.add(Calendar.MINUTE, +1);
        CM.setCal(newCal);
    }

    public void subMinute(){
        undoredo.pushStack(CM.getCal());
        Calendar newCal = CM.getCal();
        newCal.add(Calendar.MINUTE, -1);
        CM.setCal(newCal);
    }

    public void addHour(){
        undoredo.pushStack(CM.getCal());
        Calendar newCal = CM.getCal();
        newCal.add(Calendar.HOUR, +1);
        CM.setCal(newCal);
    }

    public void subHour(){
        undoredo.pushStack(CM.getCal());
        Calendar newCal = CM.getCal();
        newCal.add(Calendar.HOUR, -1);
        CM.setCal(newCal);
    }

    public void addDay(){
        undoredo.pushStack(CM.getCal());
        Calendar newCal = CM.getCal();
        newCal.add(Calendar.DAY_OF_MONTH, +1);
        CM.setCal(newCal);
    }

    public void subDay(){
        undoredo.pushStack(CM.getCal());
        Calendar newCal = CM.getCal();
        newCal.add(Calendar.DAY_OF_MONTH, -1);
        CM.setCal(newCal);
    }

    public void addMonth(){
        undoredo.pushStack(CM.getCal());
        Calendar newCal = CM.getCal();
        newCal.add(Calendar.MONTH, +1);
        CM.setCal(newCal);
    }
    public void subMonth(){
        undoredo.pushStack(CM.getCal());
        Calendar newCal = CM.getCal();
        newCal.add(Calendar.MONTH, -1);
        CM.setCal(newCal);
    }
    public void addYear(){
        undoredo.pushStack(CM.getCal());
        Calendar newCal = CM.getCal();
        newCal.add(Calendar.YEAR, +1);
        CM.setCal(newCal);
    }

    public void subYear(){
        undoredo.pushStack(CM.getCal());
        Calendar newCal = CM.getCal();
        newCal.add(Calendar.YEAR, -1);
        CM.setCal(newCal);
    }

    public int getSecond(){
        Calendar cal = CM.getCal();
        return cal.get(Calendar.SECOND);
    }

    public int getMinute(){
        Calendar cal = CM.getCal();
        return cal.get(Calendar.MINUTE);
    }

    public int getHour(){
        Calendar cal = CM.getCal();
        return cal.get(Calendar.HOUR);
    }
}
