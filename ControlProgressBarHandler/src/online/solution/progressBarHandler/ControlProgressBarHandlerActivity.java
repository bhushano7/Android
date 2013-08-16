package online.solution.progressBarHandler;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;


public class ControlProgressBarHandlerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final ProgressBar smallProgressBar = (ProgressBar) findViewById(R.id.progressBarSmall);
        
		new Thread(new Runnable() {
			int stopCounter = 0;
			Handler progressHandler = new Handler();
	        
			@Override
			public void run() {

				while (stopCounter < 100) {
					synchronized (this) {
						try {
							wait(80);
							if (stopCounter == 80) {
								progressHandler.post(new Runnable() {
									
									@Override
									public void run() {
										smallProgressBar.setVisibility(ProgressBar.GONE);
									}
								});//No need to start();
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					

					stopCounter++;
				}// End of while loop.

			} 
		}).start(); //Must be use start();
    }
}