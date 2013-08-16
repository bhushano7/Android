package online.solution.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends Activity {
	/** Called when the activity is first created. */
	EditText txt = null;
	String tempText = null;
	String operation = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final Button btn0 = (Button) findViewById(R.id.btn0);
		final Button btn1 = (Button) findViewById(R.id.btn1);
		final Button btn2 = (Button) findViewById(R.id.btn2);
		final Button btn3 = (Button) findViewById(R.id.btn3);
		final Button btn4 = (Button) findViewById(R.id.btn4);
		final Button btn5 = (Button) findViewById(R.id.btn5);
		final Button btn6 = (Button) findViewById(R.id.btn6);
		final Button btn7 = (Button) findViewById(R.id.btn7);
		final Button btn8 = (Button) findViewById(R.id.btn8);
		final Button btn9 = (Button) findViewById(R.id.btn9);
		final Button btnPlus = (Button) findViewById(R.id.btnPlus);
		final Button btnMin = (Button) findViewById(R.id.btnMin);
		final Button btnMulti = (Button) findViewById(R.id.btnMulti);
		final Button btnDiv = (Button) findViewById(R.id.btnDivi);
		final Button btnDot = (Button) findViewById(R.id.btnDot);
		final Button btnEqual = (Button) findViewById(R.id.btnEqual);

		txt = (EditText) findViewById(R.id.txt);

		btn0.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				insert(btn0);
			}
		});

		btn1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				insert(btn1);
			}
		});

		btn2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				insert(btn2);
			}
		});

		btn3.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				insert(btn3);
			}
		});

		btn4.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				insert(btn4);
			}
		});

		btn5.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				insert(btn5);
			}
		});

		btn6.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				insert(btn6);
			}
		});

		btn7.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				insert(btn7);
			}
		});

		btn8.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				insert(btn8);
			}
		});

		btn9.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				insert(btn9);
			}
		});

		btnEqual.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				calculation();
			}
		});

		btnPlus.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				perform("+");
			}
		});

		btnMin.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				perform("-");
			}
		});

		btnMulti.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				perform("*");
			}
		});

		btnDiv.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				perform("/");
			}
		});

		btnDot.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				insert(btnDot);
			}
		});

	}

	private void insert(Button button) {
		String digit = button.getText().toString();
		txt.setText(txt.getText() + digit);
	}

	private void perform(String op) {
		operation = op;
		tempText = txt.getText().toString();
		txt.setText("");
	}

	private void calculation() {
		double answer = 0 ;
		double value= Double.parseDouble(txt.getText().toString());
		double temp = Double.parseDouble(tempText);
		
		if (operation == "+") {
			answer= temp + value;
		}
		
		if (operation == "*") {
			answer= temp * value;
		}
		
		if (operation == "/") {
			answer= temp / value;
		}
		
		if (operation == "-") {
			answer= temp - value;
		}
		//answer= temp + value;
		
		txt.setText(String.valueOf(answer));
	}
}