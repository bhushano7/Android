package online.solution.IntentSimple;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class IntentExampleActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		String user = getIntent().getExtras().getString("user");
		String answer = getIntent().getExtras().getString("answer");

		final TextView editUserName = (TextView) findViewById(R.id.txtUserName);
		final TextView editAnswer = (TextView) findViewById(R.id.txtAnswer);

		editUserName.setText("Welcome -> " + user);
		editAnswer.setText("Multiplication  -> " + answer);

		Toast.makeText(getApplicationContext(), "Welcome " + user,
				Toast.LENGTH_LONG).show();

	}
}