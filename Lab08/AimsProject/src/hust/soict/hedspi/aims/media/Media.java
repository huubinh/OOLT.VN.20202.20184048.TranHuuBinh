package hust.soict.hedspi.aims.media;

public abstract class Media implements Comparable<Object>{
	private int id;
	private String title;
	private String category;
	private float cost;
	
	public Media(int id) {
		this.id = id;
	}
	public Media(int id, String title) {
		this(id);
		this.title = title;
	}
	public Media(int id, String title, String category) {
		this(id,title);
		this.category = category;
	}
	public Media(int id, String title, String category, float cost) {
		this(id,title,category);
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public abstract String displayInfo();
	
	public boolean equals(Object o) {
		Media m = (Media) o;
		if(this.id == m.id)
			return true;
		return false;
	}
	public int compareTo(Object obj) {
		Media m = (Media) obj;
		return this.title.compareTo(m.getTitle());
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
}
