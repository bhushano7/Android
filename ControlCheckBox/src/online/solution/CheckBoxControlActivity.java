package online.solution;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxControlActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox1);
		checkBox.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if (checkBox.isChecked()) {
					Toast.makeText(getApplicationContext(), "Hello Guest",
							Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(getApplicationContext(), "Bye bye Guest",
							Toast.LENGTH_SHORT).show();
				}

			}
		});
	}
}