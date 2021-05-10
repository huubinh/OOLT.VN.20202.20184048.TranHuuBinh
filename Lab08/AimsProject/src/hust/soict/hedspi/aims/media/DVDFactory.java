package hust.soict.hedspi.aims.media;

import java.util.Scanner;

import hust.soict.hedspi.aims.Aims;

public class DVDFactory implements AbstractItemFactory {
	public Media createItemFromConsole() {
		Scanner keyboard = new Scanner(System.in);
		DigitalVideoDisc item = new DigitalVideoDisc(Aims.getId());
		System.out.println("Please enter title: ");
		item.setTitle(keyboard.nextLine());
		System.out.println("Please enter category: ");
		item.setCategory(keyboard.nextLine());
		System.out.println("Please enter director: ");
		item.setDirector(keyboard.nextLine());
		System.out.println("Please enter length: ");
		item.setLength(Integer.parseInt(keyboard.nextLine()));
		System.out.println("Please enter cost: ");
		item.setCost(Float.parseFloat(keyboard.nextLine()));
		return item;
	}
}
//dependency
