package hust.soict.hedspi.test.media;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

import hust.soict.hedspi.aims.Aims;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;

public class TestMediaCompareTo {
	private static int id;
	private static ArrayList<Media> listOfProducts = new ArrayList<Media>();
	
	public static Media createDVD() {
		Scanner keyboard = new Scanner(System.in);
		DigitalVideoDisc item = new DigitalVideoDisc(id);
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
	
	public static Media createCD() {
		Scanner keyboard = new Scanner(System.in);
		CompactDisc item = new CompactDisc(id);
		System.out.println("Please enter title: ");
		item.setTitle(keyboard.nextLine());
		System.out.println("Please enter artist: ");
		item.setArtist(keyboard.nextLine());
		System.out.println("Please enter category: ");
		item.setCategory(keyboard.nextLine());
		System.out.println("Please enter director: ");
		item.setDirector(keyboard.nextLine());
		System.out.println("Please enter number of tracks: ");
		int num = Integer.parseInt(keyboard.nextLine());
		for(int i = 1; i <= num; i++) {
			System.out.println("Track " + i);
			System.out.println("Please enter title: ");
			String title = keyboard.nextLine();
			System.out.println("Please enter length: ");
			int length = Integer.parseInt(keyboard.nextLine());
			Track t = new Track(title,length);
			item.addTrack(t);
		}
		
		System.out.println("Please enter cost: ");
		item.setCost(Float.parseFloat(keyboard.nextLine()));
		return item;
	}
	
	public static Media createBook() {
		Scanner keyboard = new Scanner(System.in);
		Book item = new Book(id);
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
	
	public static void showCreationMenu() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1.1. Create new Book");
		System.out.println("1.2. Create new DVD");
		System.out.println("1.3. Create new CD");
		int m = Integer.parseInt(keyboard.nextLine());
		if (m==1) {
			listOfProducts.add(createBook());
		}
		else if (m==2) {
			listOfProducts.add(createDVD());
		}
		else if (m==3) {
			listOfProducts.add(createCD());
		}
		else {
			System.out.println("Invalid number! Enter 1, 2 or 3!");
			return;
		}
		System.out.println("Item added!");
		id++;
	}
	
	public static void deleteItem() {
		Scanner keyboard = new Scanner(System.in);
		displayListOfProduct();
		System.out.println("Please enter item id: ");
		int itemId = Integer.parseInt(keyboard.nextLine());
		for ( int i = 0; i < listOfProducts.size(); i++)
			if (listOfProducts.get(i).getId() == itemId ) {
				listOfProducts.remove(i);
				System.out.println("Item removed!");
				return;
			}
		System.out.println("Invalid item id!");
	}
	
	public static void sortListOfProduct() {
		Collections.sort((List<Media>)listOfProducts);
		System.out.println("List of products sorted!");
	}
	public static void displayListOfProduct() {
		Iterator<Media> iterator = listOfProducts.iterator();
		while( iterator.hasNext() )
			System.out.println(iterator.next().displayInfo());
	}
	
	public static void showMenu() {
		Scanner keyboard = new Scanner(System.in);
		int n;
		do {
		System.out.println("Product Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new item");
		System.out.println("2. Delete item by id");
		System.out.println("3. Sort the items");
		System.out.println("4. Display the items list");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");

		n = Integer.parseInt(keyboard.nextLine());
		switch(n) {
		case 0:
			System.out.println("Exit Menu");
			break;
		case 1:
			showCreationMenu();
			break;
		case 2:
			deleteItem();
			break;
		case 3:
			sortListOfProduct();
			break;
		case 4:
			displayListOfProduct();
			break;
		default:
			System.out.println("Invalid number!");
		}
		} while (n!=0);
		keyboard.close();
	}
	
	public static void main(String[] args) {
		showMenu();
	}
}

/*
ArrayList<Media> c = new ArrayList<Media>(); 

DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"jungleDVD");
DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"cinderellaDVD");
DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"lionDVD");
// Add the DVD objects to the ArrayList 
c.
collection.add(dvd2); 
collection.add(dvd3);
// Iterate through the ArrayList and output their titles 
// (unsorted order) 
Iterator<Media> iterator = collection.iterator();
System.out.println("------------------------------------");
System.out.println("The DVDS currently in the order are: ");

while (iterator.hasNext()) { 
	System.out.println(((DigitalVideoDisc)iterator.next()).getTitle()); 
}
// Sort the collection of DVDS - based on the compareTo () 
// method 
Collection.sort((List)collection);

// Iterate through the ArrayList and output their titles 
// in sorted order
iterator = collection.iterator();
System.out.println("------------------------------------"); 
System.out.println("The DVDS in sorted order are: ");

while (iterator.hasNext()) { 
	System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
}

System.out.println("------------------------------------");

*/