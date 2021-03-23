
public class Aims {
	
	public static void main(String[] args) {
		
		Order anOrder = new Order("1st","February","2021");
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation","George Lucas", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd2);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd1);
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		anOrder.removeDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvdList[] = {dvd1,dvd2,dvd3};
		anOrder.addDigitalVideoDisc(dvdList);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		Order Order2 = new Order("2nd","February","2021");
		Order Order3 = new Order("3rd","March","2021");
		Order Order4 = new Order("4th","April","2021");
		Order Order5 = new Order("1st","May","2021");
		Order Order6 = new Order("25th","June","2021");
		Order2.addDigitalVideoDisc(dvd3);
		Order3.addDigitalVideoDisc(dvd2);
		Order4.addDigitalVideoDisc(dvd1);
		Order5.addDigitalVideoDisc(dvd2,dvd3);
		Order6.addDigitalVideoDisc(dvdList);
		
		anOrder.print();
		Order5.print();
	}
}
