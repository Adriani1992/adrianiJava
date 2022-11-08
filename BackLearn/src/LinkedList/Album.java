package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String name, String artist) {
		this.artist = artist;
		this.name = name;
		songs = new ArrayList<Song>();
	}
	
	private Song findSong(String titleOfSong) {
		int findNumber = -1;
		for(int i=0; i<this.songs.size(); i++) {
			Song findSong = this.songs.get(i);
			if(findSong.getTitle().equals(titleOfSong)) {
				findNumber = i;
			}
		}
		if(findNumber < 0) {
			return null;
		}else {
			Song findSong = this.songs.get(findNumber);
			return findSong;
		}
	}
	
	public boolean addSong(String titleOfSong, double durationOfSong) {
		Song isExisting = findSong(titleOfSong);
		if(isExisting == null) {
			Song newSong = new Song(titleOfSong, durationOfSong);
			this.songs.add(newSong);
			return true;
		}
		return false;
	}
	
	public boolean addToPlayList(int number, LinkedList<Song>songList) {
		int index = number-1;
		if(index>0 && index <=this.songs.size()) {
			songList.add(this.songs.get(index));
			return true;
		}else {
			return false;
		}
	}
	
	public boolean addToPlayList(String titleOfSong, LinkedList<Song>songList) {
		Song isExisting = findSong(titleOfSong);
		if(isExisting == null) {
			return false;
		}else {
			songList.add(isExisting);
			return true;
		}
	}
	
	public void print() {
		for(int i = 0; i < this.songs.size(); i++) {
			System.out.println(this.songs.get(i));
		};
	}
	
	public void printLinkedList(LinkedList<Song>songList) {
//		ListIterator<Song> songItem = songList.listIterator();
		System.out.println("songItem " + songList);
	}
	
	
}
