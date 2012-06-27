package com.zafaralam.thenewboston;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity {

	Button chkCmd;
	ToggleButton passTog;
	EditText input;
	TextView display;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		
		//Setup values for class variable.
		setValues();
		
		chkCmd.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String str = input.getText().toString();
				
				if(str.equalsIgnoreCase("t"))
				{
					passTog.setChecked(true);
					display.setText(input.getText());
				}
				else
				{
					passTog.setChecked(false);
					display.setText("Invalid Command: " + input.getText());
				}
				
			}
		});
		
	}
	
	protected void setValues() {
		
		chkCmd = (Button) findViewById(R.id.bResults);
		passTog = (ToggleButton) findViewById(R.id.tbPassword);
		input = (EditText) findViewById(R.id.etCommands);
		display = (TextView) findViewById(R.id.tResults);
		
	}

}
