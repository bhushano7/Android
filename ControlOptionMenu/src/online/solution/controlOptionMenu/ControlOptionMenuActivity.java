package online.solution.controlOptionMenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ControlOptionMenuActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

	}

	@Override
    
	public boolean onCreateOptionsMenu(Menu menu) {
    	
    	menu.add("Edit").setIcon(android.R.drawable.ic_menu_edit);
    	
    	menu.add("Speak").setIcon(android.R.drawable.ic_btn_speak_now);
    	
    	menu.add("Map").setIcon(android.R.drawable.ic_dialog_map);
    	
    	return super.onCreateOptionsMenu(menu);
    	
    	
    }
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		if ("Edit".equalsIgnoreCase(item.getTitle().toString())) {
			Toast.makeText(getApplicationContext(), "Edit menu", Toast.LENGTH_LONG).show();
    		return true;
		}
		
		return super.onOptionsItemSelected(item);

	}
}