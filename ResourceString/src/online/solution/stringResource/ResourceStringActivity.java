package online.solution.stringResource;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


public class ResourceStringActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /*
        //String
        String name = getResources().getString(R.string.txtName);
        String no = getResources().getString(R.string.txtNo);
        
        Toast.makeText(this,name+" "+no, Toast.LENGTH_LONG).show();
        
        //String array
        String city[] = getResources().getStringArray(R.array.city);
        for (String string : city) {
        	Toast.makeText(this,string, Toast.LENGTH_SHORT).show();
		}
        
        
        //Boolean
        boolean who = getResources().getBoolean(R.bool.me);
        Toast.makeText(this,who+"",Toast.LENGTH_LONG).show();
        
        
        //Integer
        int java = getResources().getInteger(R.integer.sub1);
        int math = getResources().getInteger(R.integer.sub2);
    	Toast.makeText(this,java+" "+math, Toast.LENGTH_SHORT).show();
        */
        
        //Color
        int bgColor = getResources().getColor(R.color.colorBg);
        int txtColor = getResources().getColor(R.color.colorTxt);
        Toast.makeText(this,bgColor+" "+txtColor, Toast.LENGTH_LONG).show();
        
        
        
    }
}