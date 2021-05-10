package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {
	public static void main(String[] args) {

	DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King","Animation",19.95f,"Roger Allers", 87);

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
	
	DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star Wars","Science Fiction", 24.95f,"George Lucas", 87);
	anOrder.addMedia(dvd2);
	
	DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Aladin","Animation", 18.99f,"George Lucas");
	anOrder.addMedia(dvd3);
	
	anOrder.print();
	
	}
}
