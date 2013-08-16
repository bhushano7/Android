package online.solution;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonControlActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton1);

		toggleButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if (toggleButton.isChecked()) {
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