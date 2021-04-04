package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {
	public static void main(String[] args) {

	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers", 87, 19.95f);

	System.out.println(dvd1.search("Same"));
	System.out.println(dvd1.search("King Lion"));
	System.out.println(dvd1.search("the KING "));
	
	Order anOrder = new Order();
//	if(Order.getNbOrders() < Order.MAX_LIMITED_ORDERS) {
//		anOrder = new Order();
//	}
//	else {
//		anOrder = null;
//		System.out.println("Max number of orders reached! Can not create!");
//	}
	
	anOrder.addMedia(dvd1);
	
	DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas", 87, 24.95f);
	anOrder.addMedia(dvd2);
	
	DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation","George Lucas", 18.99f);
	anOrder.addMedia(dvd3);
	
	anOrder.print();
	
	}
}
