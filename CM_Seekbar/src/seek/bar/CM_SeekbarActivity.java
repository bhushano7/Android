package seek.bar;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class CM_SeekbarActivity extends Activity {
	int counter=0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Handler myhand=new Handler();
        final SeekBar s1=(SeekBar)findViewById(R.id.seekBar1);
        final TextView tv=(TextView)findViewById(R.id.textView1);
        
        new Thread(new Runnable() {
			
			@Override
			public void run() 
			{
				while(counter<100)
				{
					try {
						synchronized(this)
						{
							s1.setProgress(counter);
							s1.setSecondaryProgress(counter+50);
							wait(10);
							if(counter==99)
							{
								myhand.post(new Runnable() 
								{
									@Override
									public void run() 
									{
										//s1.setVisibility(SeekBar.GONE);
										
									}
								});
							}
						}
						
					} catch (Exception e) {}
					
					counter++;
				}

				
			}
		}).start();
        
        s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				
				if(arg1==99)
				{
					tv.setText("Completed...");					
				}
				else
				{
					tv.setText("\nProgress ::\n"+arg1+"%"+"\nForm User ::\n"+arg2);
				}

				
			
				
				
			}
		});
        
        
    }
}