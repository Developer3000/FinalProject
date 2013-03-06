package com.example.finalproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {
	private static Button thirdActivityButton; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	    thirdActivityButton = (Button) findViewById(R.id.button1);
	    thirdActivityButton.setText("Next"); 
	}
    
    public void nextActivity(View v){
		Intent intent = new Intent(this, ThirdActivity.class);
	    startActivity(intent);
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}

}
