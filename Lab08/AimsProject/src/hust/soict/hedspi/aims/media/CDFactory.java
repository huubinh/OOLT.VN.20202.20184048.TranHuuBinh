package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.Aims;

public class CDFactory implements AbstractItemFactory {
	public Media createItemFromConsole() {
		Scanner keyboard = new Scanner(System.in);
		CompactDisc item = new CompactDisc(Aims.getId());
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
}
