package online.solution.IntentSimple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	private EditText editPass;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		final EditText editName = (EditText) findViewById(R.id.txtUser);
		editPass = (EditText) findViewById(R.id.txtPass);

		final Button btnLogin = (Button) findViewById(R.id.btnLogin);

		final Intent calc = new Intent(this, MultiplicationActivity.class);

		btnLogin.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				final String txtName = editName.getText().toString();
				final String txtPass = editPass.getText().toString();

				if (txtName.equals("admin")&& txtPass.equals("admin")) {
					calc.putExtra("user", txtName.toString());
					startActivity(calc);
				} else {
					Toast.makeText(getApplicationContext(),
							"Invalid userName & Password ...", Toast.LENGTH_LONG).show();
				}
			}
		});

	}

}
