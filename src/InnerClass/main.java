package InnerClass;

public class main {
    public static void main(String[] args) {
        AlbumSong album = new AlbumSong("Planet Her", "Doja Cat");
        AlbumSong.Song song1 = album.new Song("Freaky Deaky","Doja Cat","Planet Her");
        AlbumSong.Song song2 = album.new Song("Need to Know", "Doja Cat", "Planet Her");
        AlbumSong.Song song3 = album.new Song("So High", "Doja Cat", "Planet Her");
        song1.addSong(song1);
        song1.addSong(song2);
        song1.addSong(song3);
        album.addToAlbum( song1);
        album.addToAlbum( song2);
        album.addToAlbum( song3);

        song1.printSong();
        album.printAllAlbums();
    }

}
