package com.example.custom_list_view2;

public class Song {
	
	private String title;
	private String duration;
	private String genere;
	private String cover;
	
	//Class constructor
	public Song(String title, String duration, String genere, String cover) {
		super();
		this.title 		= title;
		this.duration 	= duration;
		this.genere 	= genere;
		this.cover		= cover;
	}
	
	//Seters and geters
	public void setTitle( String title ) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setDuration( String duration ) {
		this.duration = duration;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public void setGenere( String genere ) {
		this.genere = genere;
	}
	
	public String getGenere() {
		return genere;
	}
	
	public void setCover( String cover ) {
		this.cover = cover;
	}
	
	public String getCover() {
		return cover;
	}
}
