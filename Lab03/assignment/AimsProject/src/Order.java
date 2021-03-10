
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full!");
			return;
		}
		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered++;
		System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
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
}
