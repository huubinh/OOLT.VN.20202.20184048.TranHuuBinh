package hust.soict.hedspi.aims.order;
import java.time.LocalDate;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;
import java.lang.Math;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;

	private MyDate dateOrdered; 
	public static final int MAX_LIMITED_ORDERS = 5;
	private static int nbOrders = 0;
	
	public static int getNbOrders() {
		return nbOrders;
	}
	public Order() {
		LocalDate currentdate = LocalDate.now();
		int day = currentdate.getDayOfMonth();
		int month = currentdate.getMonthValue();
		int year = currentdate.getYear();	
		dateOrdered = new MyDate(day,month,year); 
		nbOrders = nbOrders + 1;
		System.out.println("Order created. Total : " + nbOrders );
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full!");
			return;
		}
		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered++;
		System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
	}
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full!");
			return;
		}
		int i;
		for (i = 0; i < dvdList.length; i++) {
			if (qtyOrdered + 1 > MAX_NUMBERS_ORDERED)
				break;
			else {
				itemsOrdered[qtyOrdered] = dvdList[i];
				qtyOrdered++;
				System.out.println("The disc \"" + dvdList[i].getTitle() + "\" has been added.");
		}
		}
		while( i<dvdList.length ) {
			System.out.println("Full order. Can't add the disc \"" + dvdList[i].getTitle() + "\".");
			i++;
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full!");
			return;
		}
		if (qtyOrdered + 1 > MAX_NUMBERS_ORDERED) {
			System.out.println("Full order. Can't add the disc \"" + dvd1.getTitle() + "\".");
			return;
		}
		else {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			System.out.println("The disc \"" + dvd1.getTitle() + "\" has been added.");
		}
		if (qtyOrdered + 1 > MAX_NUMBERS_ORDERED) {
			System.out.println("Full order. Can't add the disc \"" + dvd2.getTitle() + "\".");
			return;
		}
		else {
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered++;
			System.out.println("The disc \"" + dvd2.getTitle() + "\" has been added.");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("Empty order! Nothing to remove!");
			return;
		}
		for (int i=0; i<qtyOrdered; i++)
			if (itemsOrdered[i] == disc) {
				if (i==qtyOrdered-1)
					qtyOrdered--;
				else {
					for(int j=i+1; j<qtyOrdered; j++)
						itemsOrdered[j-1]=itemsOrdered[j];
					qtyOrdered--;
				}
				System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
				return;
			}
		System.out.println("Can not find the disc \"" + disc.getTitle() + "\" in the order! Can not remove!");
	}
	public float totalCost() {
		float sum=0;
		for (int i=0; i<qtyOrdered; i++)
			sum += itemsOrdered[i].getCost();
		return sum;
	}
	public void print() {
		System.out.println("*********************************Order*********************************");
		System.out.println("Date: " + dateOrdered.toStringDate());
		//System.out.println("Date: " + dateOrdered.toStringDMYYYY());
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++)
			System.out.println(i+1 + "." + itemsOrdered[i].toStringDVD());
		System.out.println("***********************************************************************");
	}
	public DigitalVideoDisc getALuckyItem() {
		int max = qtyOrdered-1;
        int min = 0;
        int range = max - min + 1;
        int luckynumber = (int)(Math.random() * range) + min;
        System.out.println("You got \"" + itemsOrdered[luckynumber].getTitle() + "\" for free!" );
        itemsOrdered[luckynumber].setCost(0);
        return itemsOrdered[luckynumber];
	}
}
