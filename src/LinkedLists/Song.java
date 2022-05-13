package LinkedLists;

public class Song {
    private String title;
    private double duration;
    private String albumName;
    public Song(String title, double duration, String albumName){
        this.title = title;
        this.duration = duration;
        this.albumName = albumName;

    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String getAlbumName() {
        return albumName;
    }
}
