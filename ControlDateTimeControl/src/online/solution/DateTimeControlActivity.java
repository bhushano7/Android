package online.solution;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class DateTimeControlActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final TextView textViewDate= (TextView) findViewById(R.id.textView1);
        
        final DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker1);
        
        final TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker1);
        
        datePicker.init(datePicker.getYear(),datePicker.getMonth(),datePicker.getMonth(),new DatePicker.OnDateChangedListener() {
			
			@Override
			public void onDateChanged(DatePicker view, int year, int monthOfYear,
					int dayOfMonth) {
				//Date date = new Date(year-1900,monthOfYear,dayOfMonth);
				Date date = new Date(year-1900,monthOfYear,dayOfMonth,timePicker.getCurrentHour(),timePicker.getCurrentMinute());
				
				textViewDate.setText(date.toString());
			}
		});
        
        final TextView textViewTime= (TextView) findViewById(R.id.textView2);
     
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
			
			@Override
			public void onTimeChanged(TimePicker arg0, int arg1, int arg2) {
				//textViewTime.setText(arg0.getCurrentHour()+"");
				Date date = new Date(datePicker.getYear()-1900,datePicker.getMonth(),datePicker.getDayOfMonth(),arg1,arg2);
				textViewTime.setText(date.toString());
			}
		});
    }
}