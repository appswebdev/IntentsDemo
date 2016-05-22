package models;

/**
 * Created by master on 22/05/16.
 */
public class Song {
   final private String title;
   final private String artist;
   final private int imageResID;

    //Constructor:
    public Song(String title, String artist, int imageResID) {
        this.title = title;
        this.artist = artist;
        this.imageResID = imageResID;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getImageResID() {
        return imageResID;
    }
}
