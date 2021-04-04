package hust.soict.hedspi.aims.media;

import java.util.StringTokenizer;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category) {
		super(title,category);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title,category,cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title,category,cost);
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this(title,category,director,cost);
		this.length = length;
	}
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String displayInfo() {
		return String.join("","DVD - ",title," - ",category," - ",director," - ",Integer.toString(length),
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
	
}
