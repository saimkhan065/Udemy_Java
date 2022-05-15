package InnerClass;

import java.util.ArrayList;
import java.util.List;

public class AlbumSong {
    private String albumTitle;
    private String albumArtist;
    private List<Song> albumList = new ArrayList<>();


    public AlbumSong(String albumTitle, String albumArtist) {
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    public List<Song> getAlbumList() {
        return albumList;
    }

    void addToAlbum(Song songList){
        albumList.add(songList);
    }

    void printAllAlbums(){
        for (int i=0 ; i<albumList.size(); i++){
            System.out.println(albumList.get(i).getAlbumName());
        }
    }

    public class Song {
        private String title;
        private String artistName;
        private String albumName;
        private List<Song> songList = new ArrayList<>();

        public Song(String albumName){
            this.albumName = albumName;
        }

        public Song(String title, String artistName, String albumName) {
            this.title = title;
            this.artistName = artistName;
            this.albumName = albumName;
        }

        public String getTitle() {
            return title;
        }

        public String getArtistName() {
            return artistName;
        }

        public String getAlbumName() {
            return albumName;
        }

        void addSong(Song object){
            songList.add(object);
        }

        void printSong(){
            for (int i = 0; i<songList.size();i++)
                System.out.println(songList.get(i).getTitle());

        }
    }
}
