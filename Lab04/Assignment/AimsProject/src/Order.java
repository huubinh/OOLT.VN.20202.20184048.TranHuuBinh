
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;

	private MyDate dateOrdered; 
	public static final int MAX_LIMITED_ORDERS = 5;
	private static int nbOrders = 0;
	
	public Order(String day, String month, String year) {
		if(nbOrders+1 > MAX_LIMITED_ORDERS) {
			itemsOrdered = null;
			System.out.println("Max number of orders reached! Can not create!");
		}
		else {
			dateOrdered = new MyDate(day,month,year); 
			nbOrders = nbOrders + 1;
			System.out.println("Order created. Total : " + nbOrders );
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (itemsOrdered == null) {
			System.out.println("Invalid order!");
			return;
		}
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full!");
			return;
		}
		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered++;
		System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
	}
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
		if (itemsOrdered == null) {
			System.out.println("Invalid order!");
			return;
		}
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
		if (itemsOrdered == null) {
			System.out.println("Invalid order!");
			return;
		}
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
		if (itemsOrdered == null) {
			System.out.println("Invalid order!");
			return;
		}
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
		if (itemsOrdered == null) {
			System.out.println("Invalid order!");
			return -1;
		}
		float sum=0;
		for (int i=0; i<qtyOrdered; i++)
			sum += itemsOrdered[i].getCost();
		return sum;
	}
	public void print() {
		System.out.println("*********************************Order*********************************");
		System.out.print("Date: ");
		dateOrdered.print();
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.print(i+1+".DVD - ");
			System.out.println(itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " +
					itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " : " +
					itemsOrdered[i].getCost() + "$" );
		}
		System.out.println("***********************************************************************");
	}
}
