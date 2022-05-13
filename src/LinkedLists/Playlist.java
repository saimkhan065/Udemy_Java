package LinkedLists;

import java.util.LinkedList;

public class Playlist {
    private Album album;
    private String artistName;
    private LinkedList<Album> albumLinkedList = new LinkedList<>();

//    public void createArtist(String artistName, String albumName){
//        albumLinkedList.add(new artistName, albumName)
//}
    public void addAlbum(String artistName,String albumName){
        albumLinkedList.add(new Album(artistName,albumName));

    }

    public String getArtistName() {
        return artistName;
    }

    public void printAllAlbums(){
        for (int i=-0 ; i< albumLinkedList.size() ; i++){
            System.out.println("Album Name : "+ albumLinkedList.get(i).getAlbumName());
            System.out.println("Artist Name : "+ albumLinkedList.get(i).getArtistName());
            System.out.println("----------------------------------");
        }
    }
}
