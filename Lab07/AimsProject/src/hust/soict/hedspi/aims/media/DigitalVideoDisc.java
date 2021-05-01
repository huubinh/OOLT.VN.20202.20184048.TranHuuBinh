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

	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String displayInfo() {
		return String.join("",Integer.toString(id),".","DVD - ",title," - ",category," - ",director," - ",Integer.toString(length),
								" : ",Float.toString(cost),"$" );
	}
	public boolean search(String title) {
		StringTokenizer string = new StringTokenizer(title.toLowerCase());
		String t = this.title.toLowerCase();
		while (string.hasMoreTokens()) {
            if ( t.indexOf(string.nextToken()) == -1 )
            	return false;
        }
		return true;
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
