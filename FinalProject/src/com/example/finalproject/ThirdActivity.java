package com.example.finalproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends Activity {
	private static Button finishButton; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		finishButton = (Button) findViewById(R.id.button1); 
		finishButton.setText("Finish"); 
	}
    
	public void finishActivity(View v){ 
		Intent intent = new Intent(ThirdActivity.this, MainActivity.class); 
		startActivity(intent);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_third, menu);
		return true;
	}

}
