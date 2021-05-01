package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	protected String artist;
	protected ArrayList<Track> tracks;
	public String getArtist() {
		return artist;
	}
	
	public CompactDisc(int id) {
		super(id);
	}
	public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist, ArrayList<Track> tracks) {
		super(id,title,category,cost,director,length);
		this.artist = artist;
		this.tracks = tracks;
	}
	public void addTrack(Track newtrack) {
		if(tracks.contains(newtrack)) {
			System.out.println("Track existed! Can not add.");
		}
		else {
			tracks.add(newtrack);
			System.out.println("Track added!");
		}
	}
	public void removeTrack(Track oldtrack) {
		if(!tracks.contains(oldtrack)) {
			System.out.println("Can not find the track! Can not remove.");
		}
		else {
			tracks.remove(oldtrack);
			System.out.println("Track removed!");
		}
	}	
	public int getLength() {
		int sum = 0;
		for (int i=0; i<tracks.size(); i++)
			sum += tracks.get(i).getLength();
		return sum;
	}
	public String displayInfo() {
		return String.join("",Integer.toString(id),".","CD - ",title," - ",artist," - ",tracks.toString()," - ",category," - ",director," - ",Integer.toString(length),
				" : ",Float.toString(cost),"$" );
	}
	public void play() {
		displayInfo();
		for (int i=0; i<tracks.size(); i++)
			tracks.get(i).play();
	}
}
