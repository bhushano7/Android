package online.solution;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ControlRadioGroupActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
		final Button button = (Button) findViewById(R.id.button1);

		radioGroup
				.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

					@Override
					public void onCheckedChanged(RadioGroup group, int checkedId) {
						if (checkedId != -1) {
							RadioButton button = (RadioButton) findViewById(checkedId);
							Toast.makeText(getApplicationContext(),
									button.getText(), Toast.LENGTH_SHORT)
									.show();
						}
					}
				});

		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				radioGroup.clearCheck();
			}
		});
	}
}