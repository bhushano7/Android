package com.Prog_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Prog_2Activity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button b= (Button) findViewById(R.id.btnLogin);
        //implements OnClickListener
        b.setOnClickListener(this);
    }

	public void onClick(View v) {
		Intent i = new Intent(this, Activity2.class);				
		EditText t1= (EditText) findViewById(R.id.edtUname);
		EditText t2= (EditText) findViewById(R.id.edtPwd);
		String s1= t1.getText().toString();
		String s2= t2.getText().toString();
		
		if(s1.equals("Xyz") && s2.equals("Abc"))
		{
			i.putExtra("Param", s1);
			startActivity(i);
		}
		else
		{
			Toast t= Toast.makeText(this, "Invalid UserName or Password..", Toast.LENGTH_LONG);
			t.show();
		}		
	}
}