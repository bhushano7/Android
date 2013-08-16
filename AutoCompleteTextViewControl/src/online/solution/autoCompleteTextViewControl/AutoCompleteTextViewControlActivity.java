package online.solution.autoCompleteTextViewControl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewControlActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        String[] names={"Bhushan","Vijay","Bhavesh","Snehal","Amit","Harshal","MDP","NSP"};
        
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        /*
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
        (
        this,android.R.layout.select_dialog_item,names		
        );
        */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
        (
        this,android.R.layout.simple_dropdown_item_1line,names		
        );

        
        autoCompleteTextView.setAdapter(adapter);
    }
}