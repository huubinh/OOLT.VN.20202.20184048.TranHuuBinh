package hust.soict.hedspi.aims.media;

public class Track implements Playable , Comparable<Object> {
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public Track() {
		
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	public void play() {
		System.out.println("Playing track: " + getTitle());
		System.out.println("Track length: " + getLength());
	}
	public boolean equals(Object o) {
		Track t = (Track) o;
		if(this.title == t.title && this.length == t.length)
			return true;
		return false;
	}
	public int compareTo(Object obj) {
		Track t = (Track) obj;
		return this.title.compareTo(t.getTitle());
	}
}
