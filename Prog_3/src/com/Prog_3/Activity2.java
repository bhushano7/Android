package com.Prog_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends Activity implements OnClickListener{
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main2);
	        
	        Intent i= getIntent();
	        String str=i.getStringExtra("Param");
	        TextView t= (TextView) findViewById(R.id.txtWelCome);
	        t.setText("WelCome.. " + str);
	        
	        Button b= (Button) findViewById(R.id.btnExit);
	        b.setOnClickListener(this);
	    }

	public void onClick(View v) {		
		finish();		
	}

}
