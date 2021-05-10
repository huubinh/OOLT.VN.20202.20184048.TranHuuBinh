package hust.soict.hedspi.aims.media;

import java.util.StringTokenizer;

public class DigitalVideoDisc extends Disc implements Playable {
	
	public DigitalVideoDisc(int id) {
		super(id);
	}
	public DigitalVideoDisc(int id, String title) {
		super(id,title);
	}
	public DigitalVideoDisc(int id, String title, String category) {
		super(id,title,category);
	}
	public DigitalVideoDisc(int id, String title, String category, float cost) {
		super(id,title,category,cost);
	}
	public DigitalVideoDisc(int id, String title, String category, float cost, String director) {
		super(id,title,category,cost,director);
	}
	public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
		super(id,title,category,cost,director,length);
	}

	public String displayInfo() {
		return String.join("",Integer.toString(getId()),".","DVD - ",getTitle()," - ",getCategory()," - ",getDirector()," - ",Integer.toString(getLength()),
								" : ",Float.toString(getCost()),"$" );
	}
	public boolean search(String title) {
		StringTokenizer string = new StringTokenizer(title.toLowerCase());
		String t = getTitle().toLowerCase();
		while (string.hasMoreTokens()) {
            if ( t.indexOf(string.nextToken()) == -1 )
            	return false;
        }
		return true;
	}
	public void play() {
		System.out.println("Playing DVD: " + getTitle());
		System.out.println("DVD length: " + getLength());
	}
	public int compareTo(Object obj) {
		DigitalVideoDisc d = (DigitalVideoDisc) obj;
		Float cost = getCost();
		return cost.compareTo(d.getCost());
	}
}
