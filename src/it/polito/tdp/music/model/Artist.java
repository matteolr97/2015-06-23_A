package it.polito.tdp.music.model;

public class Artist {
	
	private int id ;
	private String artist ;
	private int freq;
	
	public Artist(int id, String artist) {
		super();
		this.id = id;
		this.artist = artist;
	}
	
	
	public Artist(int id, String artist, int freq) {
		super();
		this.id = id;
		this.artist = artist;
		this.freq = freq;
	}


	public int getFreq() {
		return freq;
	}


	public void setFreq(int freq) {
		this.freq = freq;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}


	@Override
	public String toString() {
		return  "Artista "+artist+" "+freq+" \n";
	}
	
}
