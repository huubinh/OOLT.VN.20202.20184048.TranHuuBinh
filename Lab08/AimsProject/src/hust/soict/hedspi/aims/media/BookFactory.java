package hust.soict.hedspi.aims.media;

import java.util.Scanner;

import hust.soict.hedspi.aims.Aims;

public class BookFactory implements AbstractItemFactory {
	public Media createItemFromConsole() {
		Scanner keyboard = new Scanner(System.in);
		Book item = new Book(Aims.getId());
		System.out.println("Please enter title: ");
		item.setTitle(keyboard.nextLine());
		System.out.println("Please enter category: ");
		item.setCategory(keyboard.nextLine());
		System.out.println("Please enter number of authors: ");
		int num = Integer.parseInt(keyboard.nextLine());
		for(int i = 1; i <= num; i++) {
			System.out.println("Author " + i);
			System.out.println("Please enter author: ");
			String author = keyboard.nextLine();
			item.addAuthor(author);
		}
		System.out.println("Please enter cost: ");
		item.setCost(Float.parseFloat(keyboard.nextLine()));
		return item;
	}
}
