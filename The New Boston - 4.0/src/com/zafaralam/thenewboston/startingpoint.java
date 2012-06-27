package com.zafaralam.thenewboston;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class startingpoint extends Activity {
    /** Called when the activity is first created. */
	int counter;
	Button add, sub;
	TextView display;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setValues();
        
        add.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				//counter = counter + 1;
				counter++;
				display.setText("Your total is " + counter);
			}
		});
        
        sub.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("Your Total is " + counter);
			}
		});
    }
    
    public void setValues() {
    	counter = 0;
    	add = (Button) findViewById(R.id.bAdd);
    	sub = (Button) findViewById(R.id.bSub);
    	display = (TextView) findViewById(R.id.textView1);
    }
}