package hust.soict.hedspi.aims;
import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.BookFactory;
import hust.soict.hedspi.aims.media.CDFactory;
import hust.soict.hedspi.aims.media.DVDFactory;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	private static ArrayList<Order> Orders = new ArrayList<Order>();
	private static int id;
	private static ArrayList<Media> listOfProducts = new ArrayList<Media>();
	
	public static int getId() {
		return id;
	}
	
	public static void createOrder() {
		if(Orders.size() < Order.MAX_LIMITED_ORDERS ) {
			Order newOrder = new Order();
			System.out.println("Order created. Id : " + Orders.size());
			Orders.add(newOrder);
		}
		else
			System.out.println("Max number of orders reached! Can not create!");
	}
	public static void addItem() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter order id: ");
		int orderId = Integer.parseInt(keyboard.nextLine());
		if (orderId < 0 || orderId >= Orders.size()) {
			System.out.println("Invalid order id!");
			return;
		}
		Orders.get(orderId).print();
		displayListOfProduct();
		System.out.println("Please enter item id: ");
		int itemId = Integer.parseInt(keyboard.nextLine());
		for ( int i = 0; i < listOfProducts.size(); i++)
			if (listOfProducts.get(i).getId() == itemId ) {
				Orders.get(orderId).addMedia(listOfProducts.get(i));
				System.out.println("Item added!");
				return;
			}
		System.out.println("Invalid item id!");
	}
	public static void deleteOrderItem() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter order id: ");
		int orderId = Integer.parseInt(keyboard.nextLine());
		if (orderId < 0 || orderId >= Orders.size()) {
			System.out.println("Invalid order id!");
			return;
		}
		Orders.get(orderId).print();
		System.out.println("Please enter item id: ");
		int itemId = Integer.parseInt(keyboard.nextLine());
		for ( int i = 0; i < Orders.get(orderId).getItemsOrdered().size(); i++)
			if (Orders.get(orderId).getItemsOrdered().get(i).getId() == itemId ) {
				Orders.get(orderId).removeMedia(i);
				System.out.println("Item removed!");
				return;
			}
		System.out.println("Invalid item id!");
	}
	public static void displayOrder() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter order id: ");
		int orderId = Integer.parseInt(keyboard.nextLine());
		if (orderId < 0 || orderId >= Orders.size())
			System.out.println("Invalid order id!");
		else
			Orders.get(orderId).print();
	}
	
	public static void showCreationMenu() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1.1. Create new Book");
		System.out.println("1.2. Create new DVD");
		System.out.println("1.3. Create new CD");
		int m = Integer.parseInt(keyboard.nextLine());
		if (m==1) {
			BookFactory create = new BookFactory();
			listOfProducts.add(create.createItemFromConsole());
		}
		else if (m==2) {
			DVDFactory create = new DVDFactory();
			listOfProducts.add(create.createItemFromConsole());
		}
		else if (m==3) {
			CDFactory create = new CDFactory();
			listOfProducts.add(create.createItemFromConsole());
		}
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
	
	public static void displayListOfProduct() {
		for ( int i = 0; i < listOfProducts.size(); i++) {
			System.out.println(listOfProducts.get(i).displayInfo());
		}
	}
	
	public static void showUserMenu() {
		Scanner keyboard = new Scanner(System.in);
		int n;
		do {
		System.out.println("\nOrder Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the item list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");

		n = keyboard.nextInt();
		switch(n) {
		case 0:
			System.out.println("Exit User Menu");
			break;
		case 1:
			createOrder();			
			break;
		case 2:
			addItem();
			break;
		case 3:
			deleteOrderItem();
			break;
		case 4:
			displayOrder();
			break;
		default:
			System.out.println("Invalid number!");
		}
		} while (n!=0);
	}
	public static void showAdminMenu() {
		Scanner keyboard = new Scanner(System.in);
		int n;
		do {
		System.out.println("Product Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new item");
		System.out.println("2. Delete item by id");
		System.out.println("3. Display the items list");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");

		n = Integer.parseInt(keyboard.nextLine());
		switch(n) {
		case 0:
			System.out.println("Exit Admin Menu");
			break;
		case 1:
			showCreationMenu();
			break;
		case 2:
			deleteItem();
			break;
		case 3:
			displayListOfProduct();
			break;
		default:
			System.out.println("Invalid number!");
		}
		} while (n!=0);
	}
	public static void showMenu() {
		Scanner keyboard = new Scanner(System.in);
		int n;
		do {
		System.out.println("MENU ");
		System.out.println("--------------------------------");
		System.out.println("1. User Menu");
		System.out.println("2. Admin Menu");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");

		n = Integer.parseInt(keyboard.nextLine());
		switch(n) {
		case 0:
			System.out.println("Goodbye!");
			break;
		case 1:
			showUserMenu();
			break;
		case 2:
			showAdminMenu();
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