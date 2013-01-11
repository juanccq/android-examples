package com.example.custom_list_view2;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class CustomListViewExample extends Activity {
	
	private ListView listViewSong;
	private Context context;
	
	public String elements[] = { "option one", "option two", "option three", "option four", 
								"option five", "option six", "option seven", "option eight"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_list_view_example);
		
		context = this;
		
		ArrayList<Song> listSong = new ArrayList<Song>();
		
		listSong.add( new Song( "Me recordaras", "05:23", "Folk", "" ) );
		listSong.add( new Song( "Añoransas", "04:18", "Folk", "" ) );
		listSong.add( new Song( "El olvido", "05:03", "Folk", "" ) );
		
		listViewSong = (ListView)findViewById(R.id.listView);
		listViewSong.setAdapter( new SongListAdapter(context, R.layout.custom_list_view, listSong) );
		
		/*ListView listOptions = (ListView) findViewById(R.id.listView);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, elements);
		
		listOptions.setAdapter(adapter);*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_custom_list_view_example,
				menu);
		return true;
	}

}
