package hust.soict.hedspi.test.book;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.media.Book;

public class BookTest {
	private static ArrayList<Book> list = new ArrayList<Book>();
	
	public static void main(String[] args) {
		List<String> authors = new ArrayList<String>();
		authors.add("john");
		authors.add("peter");
		Book b1 = new Book(1,"jungle","new",2.5f,authors,"a whole new world");
		Book b2 = new Book(2,"sea","mystery",2f,authors,"a very very beautiful world");
		Book b3 = new Book(2,"underworld","wow",3f,authors,"a very dark world");
		b1.setContent("welcome to the jungle");
		list.add(b1);
		list.add(b2);
		list.add(b3);
		for (Book b : list) {
			System.out.println(b.toString());
		}
	}
}
