package com.Prog_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Prog_3Activity extends Activity implements OnClickListener, TextWatcher, OnFocusChangeListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        EditText uname= (EditText) findViewById(R.id.edtUname);
        uname.addTextChangedListener(this);
        //uname.setOnFocusChangeListener(this);
        EditText pwd= (EditText) findViewById(R.id.edtPwd);
        pwd.addTextChangedListener(this);
        //pwd.setOnFocusChangeListener(this);
        
        Button b= (Button) findViewById(R.id.btnLogin);
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

	public void onFocusChange(View v, boolean hasFocus) {		
	/*	EditText t1= (EditText) findViewById(R.id.edtUname);
		EditText t2= (EditText) findViewById(R.id.edtPwd);
		String s1= t1.getText().toString();
		String s2= t2.getText().toString();
		Button b= (Button) findViewById(R.id.btnLogin);
		
		if(s1.equals("Xyz") && s2.equals("Abc"))
		{
			b.setEnabled(true);			
		}*/
	}

	public void afterTextChanged(Editable s) {
		EditText t1= (EditText) findViewById(R.id.edtUname);
		EditText t2= (EditText) findViewById(R.id.edtPwd);
		String s1= t1.getText().toString();
		String s2= t2.getText().toString();
		Button b= (Button) findViewById(R.id.btnLogin);
		
		if(s1.equals("Xyz") && s2.equals("Abc"))
		{
			b.setEnabled(true);			
		}
		else
		{
			b.setEnabled(false);
		}
		
	}

	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {		
	}

	public void onTextChanged(CharSequence s, int start, int before, int count) {
				
	}
}