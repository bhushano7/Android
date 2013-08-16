package online.solution.IntentSimple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MultiplicationActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calc);

		final EditText editFirst = (EditText) findViewById(R.id.txtFirst);
		final EditText editSecond = (EditText) findViewById(R.id.txtSecond);

		final Button btnMulti = (Button) findViewById(R.id.btnMulti);

		final Intent i = new Intent(getApplicationContext(), IntentExampleActivity.class);

		btnMulti.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				final String txtFirst = editFirst.getText().toString();
				final String txtSecond = editSecond.getText().toString();

				if (txtFirst != null & txtSecond != null) {
					int ans = Integer.parseInt(txtFirst)
							+ Integer.parseInt(txtSecond);
					String user = getIntent().getExtras().getString("user");
					
					i.putExtra("user",user.toString());
					i.putExtra("answer",ans+"");
					startActivity(i);
				}

			}
		});

	}
}
