package online.solution.progressBar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class ControlProgressBarActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final ProgressBar smallProgressBar = (ProgressBar) findViewById(R.id.progressBarSmall);

		new Thread(new Runnable() {
			int stopCounter = 0;

			@Override
			public void run() {

				while (stopCounter < 100) {
					synchronized (this) {
						try {
							wait(80);
							if (stopCounter == 80) {
								smallProgressBar.setVisibility(ProgressBar.GONE);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					

					stopCounter++;
				}// End of while loop.

			}
		}).start();
	}
}