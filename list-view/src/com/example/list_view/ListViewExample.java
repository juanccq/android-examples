package com.example.list_view;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewExample extends Activity {
	
	public String listData[] = { "option one", "option two", "option three", 
										"option four", "option five", "option six" };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view_example);
		
		ListView listOptions = (ListView) findViewById(R.id.list);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listData);
		
		listOptions.setAdapter(adapter);
		
		listOptions.setOnItemClickListener(new AdapterView.OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> supView, View elementClicked, int position,
					long index) {
				
				Toast.makeText(ListViewExample.this, "Selected element: \"" +  listData[position] + 
						"\" index: [" + index + "]", Toast.LENGTH_SHORT).show();
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_list_view, menu);
		return true;
	}

}
