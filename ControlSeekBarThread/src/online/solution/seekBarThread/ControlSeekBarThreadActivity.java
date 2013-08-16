package online.solution.seekBarThread;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class ControlSeekBarThreadActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final SeekBar bar = (SeekBar) findViewById(R.id.seekBar1);
		final TextView textView = (TextView) findViewById(R.id.textView1);
		
		//Must be change in AndroidManifest.xml
		final Intent page = new Intent(this, PageActivity.class);

		
		new Thread(new Runnable() {
			Handler myHandler = new Handler();
			int counter = 0;
			int secondCounter = 5;
			
			
			@Override
			public void run() {
				synchronized (this) {
					while (counter < 101) {
						try {
							myHandler.post(new Runnable() {
								public void run() {
									if (counter == 100) {
										bar.setVisibility(SeekBar.GONE);
										Toast.makeText(getApplicationContext(), "Application is closed.", Toast.LENGTH_LONG);
										finish();
										
										//new Intent(getApplicationContext(),ControlSeekBarThreadActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
										//startActivity(page);
									}
								}
							});
							wait(80);
							bar.setProgress(counter);
							bar.setSecondaryProgress(secondCounter);

						} catch (Exception e) {
							e.printStackTrace();
						}
						counter++;
					}
				}
			}
		}).start();

		bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

			@Override
			public void onStopTrackingTouch(SeekBar arg0) {

			}

			@Override
			public void onStartTrackingTouch(SeekBar arg0) {
			}

			@Override
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				textView.setText(arg1 + "");
			}

		});
	}
}