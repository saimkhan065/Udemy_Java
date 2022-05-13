package LinkedLists;

import java.util.LinkedList;
import java.util.Scanner;

public class Album {
    private LinkedList<Song> songLinkedList = new LinkedList<>(); // LL contains SONGS !!
    private String albumName;
    private String artistName;

    public Album(String artistName, String albumName) {
        this.artistName = artistName;
        this.albumName = albumName;
        //this.songLinkedList = new LinkedList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void addSong(String name, int duration, String albumName){
        songLinkedList.add(new Song(name, duration, albumName));
    }

    public void printAllSongs(){
        String albumSearchName;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Album Name : ");
        albumSearchName = input.nextLine();

        for (int i = 0 ; i < songLinkedList.size(); i++){
            if (songLinkedList.get(i).getAlbumName().equals(albumSearchName)){
                System.out.println("Track Title : "+songLinkedList.get(i).getTitle());
                System.out.println("Track Duration : "+songLinkedList.get(i).getDuration());
                System.out.println("------------------------------------------------------>");
            }

        }





    }
    public void createAlbum(String artistName, String albumName){
        this.albumName = albumName;
        this.artistName = artistName;
    }
}
