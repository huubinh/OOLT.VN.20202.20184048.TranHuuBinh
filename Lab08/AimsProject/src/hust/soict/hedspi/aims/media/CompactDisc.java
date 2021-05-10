package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public String getArtist() {
		return artist;
	}
	
	public CompactDisc(int id) {
		super(id);
	}
	public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist, ArrayList<Track> tracks) {
		super(id,title,category,cost,director,length);
		this.setArtist(artist);
		this.setTracks(tracks);
	}
	public void addTrack(Track newtrack) {
		if(getTracks().contains(newtrack)) {
			System.out.println("Track existed! Can not add.");
		}
		else {
			getTracks().add(newtrack);
			System.out.println("Track added!");
		}
	}
	public void removeTrack(Track oldtrack) {
		if(!getTracks().contains(oldtrack)) {
			System.out.println("Can not find the track! Can not remove.");
		}
		else {
			getTracks().remove(oldtrack);
			System.out.println("Track removed!");
		}
	}	
	public int getLength() {
		int sum = 0;
		for (int i=0; i<getTracks().size(); i++)
			sum += getTracks().get(i).getLength();
		return sum;
	}
	public String displayInfo() {
		return String.join("",Integer.toString(getId()),".","CD - ",getTitle()," - ",getArtist()," - ",displayTracksInfo()," - ",getCategory()," - ",getDirector()," - ",Integer.toString(getLength()),
				" : ",Float.toString(getCost()),"$" );
	}
	public void play() {
		displayInfo();
		for (int i=0; i<getTracks().size(); i++)
			getTracks().get(i).play();
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String displayTracksInfo() {
		String str = "[";
		for( Track t : tracks) {
			str = String.join("",str,t.getTitle(),"-",Integer.toString(t.getLength()),", ");
		}
		if(str.length()>1)
			return String.join("",str.substring(0,str.length()-2),"]");
		else
			return String.join("",str," ]");
	}
	
	public int compareTo(Object obj) {
		CompactDisc d = (CompactDisc) obj;
		int num1 = tracks.size();
		int num2 = d.getTracks().size();
		if ((num1 - num2) != 0)
			return num1 - num2;
		else
			return getLength() - d.getLength();
	}
}
