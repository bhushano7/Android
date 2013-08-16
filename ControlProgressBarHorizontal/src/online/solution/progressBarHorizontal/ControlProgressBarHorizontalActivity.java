package online.solution.progressBarHorizontal;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class ControlProgressBarHorizontalActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final ProgressBar horizontalProgressBar = (ProgressBar) findViewById(R.id.progressBarHorizontal);

		// horizontalProgressBar.setProgress(50);
		// horizontalProgressBar.setSecondaryProgress(70);

		new Thread(new Runnable() {
			int mainCounter = 0;
			int secondCounter = 15;
			boolean flag = false;

			@Override
			public void run() {
				try {
					synchronized (this) {
						while (mainCounter < 101) {

							wait(70);

							if (mainCounter > 98) {
								flag = true;
							}
							if(mainCounter==0){
								flag=false;
							}

							if (flag == true) {
								mainCounter--;
								secondCounter--;
								horizontalProgressBar.setProgress(mainCounter);
								horizontalProgressBar
										.setSecondaryProgress(secondCounter);
							} else {

								horizontalProgressBar.setProgress(mainCounter);
								horizontalProgressBar
										.setSecondaryProgress(++secondCounter);
								mainCounter++;
							}
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}