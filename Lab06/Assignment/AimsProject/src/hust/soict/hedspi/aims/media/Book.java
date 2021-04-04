package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book(String title) {
		super(title);
		}
	public Book(String title, String category) {
		super(title, category);
	}
	public Book(String title, String category, List<String> authors) {
		super(title, category);
		this.authors = authors;
	}
	public Book(String title, String category, List<String> authors, float cost) {
		super(title,category,cost);
		this.authors = authors;
	}
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.println("Author existed! Can not add!");
			return;
		}
		authors.add(authorName);
	}
	public void removeAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			System.out.println("Can not find the author! Can not remove!");
			return;
		}
		authors.remove(authorName);	
	}
	public String displayInfo() {
		return String.join("","Book - ",title," - ",category," - ",authors.toString(),
				" : ",Float.toString(cost),"$" );
	}
}
