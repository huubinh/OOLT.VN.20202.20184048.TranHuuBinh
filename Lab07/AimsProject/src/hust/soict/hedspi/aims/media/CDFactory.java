package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.Aims;

public class CDFactory implements AbstractItemFactory {
	public Media createItemFromConsole() {
		Scanner keyboard = new Scanner(System.in);
		CompactDisc item = new CompactDisc(Aims.getId());
		System.out.println("Please enter title: ");
		item.title = keyboard.nextLine();
		System.out.println("Please enter artist: ");
		item.artist = keyboard.nextLine();
		System.out.println("Please enter category: ");
		item.category = keyboard.nextLine();
		System.out.println("Please enter director: ");
		item.director = keyboard.nextLine();
		System.out.println("Please enter length: ");
		item.length = Integer.parseInt(keyboard.nextLine());
		System.out.println("Please enter number of tracks: ");
		int num = Integer.parseInt(keyboard.nextLine());
		ArrayList<Track> tracks = new ArrayList<Track>();
		for(int i = 1; i <= num; i++) {
			
			System.out.println("Track " + i);
			System.out.println("Please enter title: ");
			String title = keyboard.nextLine();
			System.out.println("Please enter length: ");
			int length = Integer.parseInt(keyboard.nextLine());
			tracks.add(new Track(title,length));
		}
		item.tracks = tracks;
		
		System.out.println("Please enter cost: ");
		item.cost = Float.parseFloat(keyboard.nextLine());
		return item;
	}
}
