package LinkedLists;

public class main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Album album = new Album("Jokhay","Khana Badhosh");
        playlist.addAlbum("Jokhay", "Khana Badhosh");
        playlist.addAlbum("JJ47", "Kehdo");
        album.addSong("Gulshan", 3, "Khana Badhosh");
        album.addSong("Manzar Kashi", 5, "Khana Badhosh");
        album.addSong("Gawah Rehna",5,"Karachi Mera");
        album.addSong("Karachi Mera", 4, "Karachi Mera");

        playlist.printAllAlbums();
        album.printAllSongs();
    }
}
