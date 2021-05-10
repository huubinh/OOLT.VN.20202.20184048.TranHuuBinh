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
		if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full! Can not add the item \"" + 
								item.getTitle() + "\" !");
			return;
		}
		if (itemsOrdered.contains(item)) {
			System.out.println("Item \"" + item.getTitle() + "\" with id " + item.getId() + " existed! Can not add!");
			return;
		}
		itemsOrdered.add(item);
		System.out.println("The item \"" + item.getTitle() + "\" has been added.");
	}
	public void addMedia (ArrayList<Media> items){
		for (int i = 0; i < items.size(); i++)
			addMedia(items.get(i));
	}
	
	public void removeMedia(Media item) {
		if (itemsOrdered.size() == 0) {
			System.out.println("Empty order! Nothing to remove!");
			return;
		}
		if (itemsOrdered.remove(item))
			System.out.println("The item \"" + item.getTitle() + "\" has been removed.");
		else
			System.out.println("Can not find the item \"" + item.getTitle() + "\" in the order! Can not remove!");
	}
	public void removeMedia(int id) {
		if (itemsOrdered.size() == 0) {
			System.out.println("Empty order! Nothing to remove!");
			return;
		}
		if (id < 0 || id >= itemsOrdered.size())
			System.out.println("Invalid item id! Can not remove!");
		else {
			System.out.println("The item \"" + itemsOrdered.get(id).getTitle() + "\" has been removed.");
			itemsOrdered.remove(id);
		}
	}
	public float totalCost() {
		float sum=0;
		for (int i=0; i<itemsOrdered.size(); i++)
			sum += itemsOrdered.get(i).getCost();
		if (itemsOrdered.size()>=2) {
			randomLuckyItem();
			sum -= itemsOrdered.get(luckyItem).getCost();
		}
		return sum;
	}
	public void print() {
		System.out.println("\n*********************************Order*********************************");
		System.out.println("Date: " + dateOrdered.toStringDate());
		//System.out.println("Date: " + dateOrdered.toStringDMYYYY());
		System.out.println("Ordered Items:");
		for (int i = 0; i < itemsOrdered.size(); i++)
			System.out.println(itemsOrdered.get(i).displayInfo());
		System.out.println("***********************************************************************");
        System.out.println("Total cost: " + totalCost() + "$");
        if (itemsOrdered.size()>=2)
			System.out.println("Lucky item for free: " + itemsOrdered.get(luckyItem).getTitle());
        System.out.println("***********************************************************************");
	}
	public void randomLuckyItem() {
        int range = itemsOrdered.size();
        this.luckyItem = (int) (Math.random() * range);
    }
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
}
