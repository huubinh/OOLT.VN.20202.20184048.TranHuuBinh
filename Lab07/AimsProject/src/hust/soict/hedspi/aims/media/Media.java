package hust.soict.hedspi.aims.media;

public abstract class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	
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
}
