package hust.soict.hedspi.aims.media;

public abstract class Disc extends Media {
	private String director;
	private int length;
	
	public Disc(int id) {
		super(id);
	}
	public Disc(int id, String title) {
		super(id,title);
	}
	public Disc(int id, String title, String category) {
		super(id,title,category);
	}
	public Disc(int id, String title, String category, float cost) {
		super(id,title,category,cost);
	}
	public Disc(int id, String title, String category, float cost, String director) {
		super(id,title,category,cost);
		this.setDirector(director);
	}
	public Disc(int id, String title, String category, float cost, String director, int length) {
		this(id,title,category,cost,director);
		this.setLength(length);
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

}
