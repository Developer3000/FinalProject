package com.example.finalproject;






import android.os.Bundle;
import android.app.Activity;

import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends Activity {
	private ListView todayList;
	private String[] todayArray;
	private String[] tomorrowArray; 
	private ArrayAdapter<String> arrayAdapter; 
	private ArrayAdapter<String> arrayAdapter1; 
    private TextView todayText;
    private TextView tomorrowText; 
    private ListView tomorrowList;
    String[] todayTask = {"eat", "work", "sleep"}; 
    String[] tomorrowTask = {"love", "hate", "makeup"}; 

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	    todayList = (ListView) findViewById(R.id.listView1);
	    todayText = (TextView) findViewById(R.id.textView1);
	    todayText.setText("Today");
	    tomorrowList = (ListView) findViewById(R.id.listView2); 
	    tomorrowText = (TextView) findViewById(R.id.textView2);
	    tomorrowText.setText("Tomorrow");
	    tomorrowArray = tomorrowTask; 
	    
	    todayArray = todayTask; 
        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,todayArray); 
        arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,tomorrowArray); 
		todayList.setAdapter(arrayAdapter);
		tomorrowList.setAdapter(arrayAdapter1);
		
		todayList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			    startActivity(intent);
			}
		});
 
		tomorrowList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			    startActivity(intent);
			}
		});
	    
		
	}
	
	

//	public void nextActivity(View v){
//		Intent intent = new Intent(this, SecondActivity.class);
//	    startActivity(intent);
//    }
//    
	
	

}
