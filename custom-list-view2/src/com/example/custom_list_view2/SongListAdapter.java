package com.example.custom_list_view2;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SongListAdapter extends ArrayAdapter<Song> {
	
	private int resource;
	private LayoutInflater inflater;
	private Context context;
	
	public SongListAdapter( Context context, int resource, ArrayList<Song> items ) {
		super( context, resource, items );
		
		this.resource 	= resource;
		inflater 		= LayoutInflater.from(context);
		this.context 	= context;
	}

	@Override
	public View getView( int position, View convertView,  ViewGroup parent) {
		convertView = ( LinearLayout ) inflater.inflate( resource, null );
		
		Song song = getItem( position );
		
		TextView listTitle = (TextView) convertView.findViewById(R.id.listTitle);
		listTitle.setText( song.getTitle() );
		
		TextView listDuration = (TextView) convertView.findViewById(R.id.listDuration);
		listDuration.setText( song.getDuration() );
		
		return convertView;
	}
}
