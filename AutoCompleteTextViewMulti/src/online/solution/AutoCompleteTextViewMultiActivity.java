package online.solution;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class AutoCompleteTextViewMultiActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final MultiAutoCompleteTextView multiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);

		final String[] city = { "Rajkot", "Junagadh", "Kodinar", "DIU",
				"Gandhinagar" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line, city);
		
		multiAutoCompleteTextView.setFilters(new InputFilter[]{
				new InputFilter.LengthFilter(9)
		});
		
		multiAutoCompleteTextView.setAdapter(adapter);
		multiAutoCompleteTextView
				.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

	}
}