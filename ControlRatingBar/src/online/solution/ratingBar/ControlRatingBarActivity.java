package online.solution.ratingBar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class ControlRatingBarActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar1);
        final TextView textView = (TextView) findViewById(R.id.textView1);
        
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
				textView.setText(arg1+"");
			}
		});
    }
}