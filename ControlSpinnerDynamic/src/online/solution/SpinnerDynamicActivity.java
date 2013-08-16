package online.solution;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SpinnerDynamicActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final Spinner spinner = (Spinner) findViewById(R.id.spinner1);
		final Button button = (Button) findViewById(R.id.button1);
		final String[] city = { "Rajkot", "Junagadh", "Kodinar", "DIU",
				"Gandhinagar" };

		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				ArrayAdapter<String> adapter = new ArrayAdapter<String>(
						getApplicationContext(),
						android.R.layout.simple_dropdown_item_1line, city);

				spinner.setAdapter(adapter);

			}
		});

	}
}