package com.example.avoultos.finally_final_hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.avoultos.finally_final_hw2.ClockControllers;
import com.example.avoultos.finally_final_hw2.ClockViewer;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ClockViewer> NameDaClocks;
    private ClockControllers HandleMeDaddy;
    private LinearLayout myLayour;
    private TextView theDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HandleMeDaddy = new ClockControllers(this);
        NameDaClocks = new ArrayList<>();
        myLayour = findViewById(R.id.clockBlocker);

        theDate = (TextView) findViewById(R.id.Dating);
        setCal();

    }

    public void setCal(){
        Calendar cals = HandleMeDaddy.returnCal();
        int Year = cals.get(Calendar.YEAR);
        int Month = cals.get(Calendar.MONTH) + 1;
        int Day = cals.get(Calendar.DAY_OF_MONTH);
        String y = Integer.toString(Year);
        String m = Integer.toString(Month);
        String d = Integer.toString(Day);
        theDate.setText(m + "/" + d + "/" + y);
    }

    public void newAnalog(View v){
        NameDaClocks.add(HandleMeDaddy.GimmeAClock(0));
        myLayour.addView(NameDaClocks.get(NameDaClocks.size()-1).getClockView());
    }

    public void newDigital(View v){
        NameDaClocks.add(HandleMeDaddy.GimmeAClock(1));
        myLayour.addView(NameDaClocks.get(NameDaClocks.size()-1).getClockView());
    }

    public void minusSec(View v){
        HandleMeDaddy.subSecond();
        updateClocks();
    }

    public void addSec(View v){
        HandleMeDaddy.addSecond();
        updateClocks();
    }

    public void minusMin(View v){
        HandleMeDaddy.subMinute();
        updateClocks();
    }

    public void addMin(View v){
        HandleMeDaddy.addMinute();
        updateClocks();
    }

    public void minusHour(View v){
        HandleMeDaddy.subHour();
        updateClocks();
    }

    public void addHour(View v){
        HandleMeDaddy.addHour();
        updateClocks();
    }

    public void minusDay(View v){
        HandleMeDaddy.subDay();
        updateClocks();
        setCal();
    }

    public void addDay(View v){
        HandleMeDaddy.addDay();
        updateClocks();
        setCal();
    }

    public void minusMonth(View v){
        HandleMeDaddy.subMonth();
        updateClocks();
        setCal();
    }

    public void addMonth(View v){
        HandleMeDaddy.addMonth();
        updateClocks();
        setCal();
    }

    public void minusYear(View v){
        HandleMeDaddy.subYear();
        updateClocks();
        setCal();
    }

    public void addYear(View v){
        HandleMeDaddy.addYear();
        updateClocks();
        setCal();
    }

    public void updateClocks(){
        for(ClockViewer cv: NameDaClocks){
            cv.refreshTime(HandleMeDaddy.returnCal());
        }
    }

    public void undoer(View v){
        HandleMeDaddy.undo();
        for(ClockViewer cv: NameDaClocks){
            cv.refreshTime(HandleMeDaddy.returnCal());
        }
        setCal();
    }

    public void redoer(View v){
        HandleMeDaddy.redo();
        for(ClockViewer cv: NameDaClocks){
            cv.refreshTime(HandleMeDaddy.returnCal());
        }
        setCal();
    }
}
