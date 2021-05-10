package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	private String content;
	List<String> contentTokens = new ArrayList<String>();
	Map<String,Integer> wordFrequency = new TreeMap<String,Integer>();
	
	public Book(int id) {
		super(id);
		}
	public Book(int id, String title) {
		super(id,title);
		}
	public Book(int id, String title, String category) {
		super(id,title, category);
	}
	public Book(int id, String title, String category, List<String> authors) {
		super(id,title, category);
		this.authors = authors;
	}
	public Book(int id, String title, String category, float cost, List<String> authors) {
		super(id,title,category,cost);
		this.authors = authors;
	}
	
	public Book(int id, String title, String category, float cost, List<String> authors, String content) {
		this(id,title,category,cost,authors);
		this.content = content;
		processContent();
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
		return String.join("",Integer.toString(getId()),".","Book - ",getTitle()," - ",getCategory()," - ",authors.toString(),
				" : ",Float.toString(getCost()),"$" );
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
		processContent();
	}

	public void processContent() {
		List<String> c = Arrays.asList( content.split(" ") );
		Collections.sort(c);
		contentTokens = c;
		wordFrequency.clear();
		for (String str : c) {
			if(wordFrequency.containsKey(str)) {
				int i = wordFrequency.get(str);
				wordFrequency.put(str,++i);
			}
			else
				wordFrequency.put(str,1);
		}
	}
	public String toString() {
		return String.join("",Integer.toString(getId()),".","Book - ",getTitle()," - ",getCategory()," - ",authors.toString(),
				" : ",Float.toString(getCost()),"$","\nContent: ",content,"\nNumber of tokens: ",Integer.toString(contentTokens.size()),
				"\nToken list: ",contentTokens.toString(),"\nWord frequency: ",wordFrequency.toString() );
	}
}
