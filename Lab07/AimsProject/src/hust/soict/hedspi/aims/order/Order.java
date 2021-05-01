package hust.soict.hedspi.aims.order;
import java.time.LocalDate;
import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private MyDate dateOrdered; 
	public static final int MAX_LIMITED_ORDERS = 5;
	//private static int nbOrders = 0;
	private int luckyItem;
	
	public int getLuckyItem() {
        return luckyItem;
    }
//	public static int getNbOrders() {
//		return nbOrders;
//	}
	public Order() {
		LocalDate currentdate = LocalDate.now();
		int day = currentdate.getDayOfMonth();
		int month = currentdate.getMonthValue();
		int year = currentdate.getYear();	
		dateOrdered = new MyDate(day,month,year); 
		//nbOrders = nbOrders + 1;
		//System.out.println("Order created. Total : " + nbOrders );
	}

	public void addMedia(Media item) {
		if (getItemsOrdered().size() == MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full! Can not add the item \"" + 
								item.getTitle() + "\" !");
			return;
		}
		getItemsOrdered().add(item);
		System.out.println("The item \"" + item.getTitle() + "\" has been added.");
	}
	public void addMedia (ArrayList<Media> items){
		for (int i = 0; i < items.size(); i++)
			addMedia(items.get(i));
	}
	
	public void removeMedia(Media item) {
		if (getItemsOrdered().size() == 0) {
			System.out.println("Empty order! Nothing to remove!");
			return;
		}
		if (getItemsOrdered().remove(item))
			System.out.println("The item \"" + item.getTitle() + "\" has been removed.");
		else
			System.out.println("Can not find the item \"" + item.getTitle() + "\" in the order! Can not remove!");
	}
	public void removeMedia(int id) {
		if (getItemsOrdered().size() == 0) {
			System.out.println("Empty order! Nothing to remove!");
			return;
		}
		if (id < 0 || id >= getItemsOrdered().size())
			System.out.println("Invalid item id! Can not remove!");
		else {
			System.out.println("The item \"" + getItemsOrdered().get(id).getTitle() + "\" with id " + id + " has been removed.");
			getItemsOrdered().remove(id);
		}
	}
	public float totalCost() {
		float sum=0;
		for (int i=0; i<getItemsOrdered().size(); i++)
			sum += getItemsOrdered().get(i).getCost();
		if (getItemsOrdered().size()>=2) {
			randomLuckyItem();
			sum -= getItemsOrdered().get(luckyItem).getCost();
		}
		return sum;
	}
	public void print() {
		System.out.println("\n*********************************Order*********************************");
		System.out.println("Date: " + dateOrdered.toStringDate());
		//System.out.println("Date: " + dateOrdered.toStringDMYYYY());
		System.out.println("Ordered Items:");
		for (int i = 0; i < getItemsOrdered().size(); i++)
			System.out.println(i + "." + getItemsOrdered().get(i).displayInfo());
		System.out.println("***********************************************************************");
        System.out.println("Total cost: " + totalCost() + "$");
        if (getItemsOrdered().size()>=2)
			System.out.println("Lucky item for free: " + getItemsOrdered().get(luckyItem).getTitle());
	}
	public void randomLuckyItem() {
        int range = getItemsOrdered().size();
        this.luckyItem = (int) (Math.random() * range);
    }
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
}
