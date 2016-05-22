package models;

import java.util.ArrayList;

import college.edu.tomer.intentsdemo.R;

/**
 * Created by master on 22/05/16.
 */
public class PlayList {
    //class properties:
   public static ArrayList<Song> songs = new ArrayList<>();
    //static initializer:
    static {
        Song s1 = new Song("Hello", "Adele", R.mipmap.hello);
        Song s2 = new Song("Someone Like You", "Adele", R.mipmap.nothing_like_you);
        Song s3 = new Song("Rolling in deep", "Adele", R.mipmap.rolling_in_deep);
        Song s4 = new Song("Hello", "Adele", R.mipmap.hello);
        songs.add(s1);
        songs.add(s2);
        songs.add(s3);
        songs.add(s4);
    }
}
