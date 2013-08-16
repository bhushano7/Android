package online.solution;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ImageView;
import android.widget.Toast;

public class ControlContextMenuActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ImageView imageView = (ImageView) findViewById(R.id.imageView1);
		registerForContextMenu(imageView);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		menu.add("Edit").setIcon(android.R.drawable.ic_menu_edit);

		menu.add("Speak").setIcon(android.R.drawable.ic_btn_speak_now);

		menu.add("Map").setIcon(android.R.drawable.ic_dialog_map);

		super.onCreateContextMenu(menu, v, menuInfo);
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		if ("Edit".equalsIgnoreCase(item.getTitle().toString())) {
			Toast.makeText(getApplicationContext(), "Edit menu", Toast.LENGTH_LONG).show();
    		return true;
		}
		return super.onContextItemSelected(item);
	}
}