package college.edu.tomer.intentsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import models.PlayList;
import models.Song;

public class MainActivity extends AppCompatActivity {

    SongViewHolder song1, song2, song3, song4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();


       }

    private void initViews() {
        ArrayList<Song> songs = PlayList.songs;
        song1 = new SongViewHolder(findViewById(R.id.song1),songs.get(0) );
        song2 = new SongViewHolder(findViewById(R.id.song2), songs.get(1));
        song3 = new SongViewHolder(findViewById(R.id.song3), songs.get(2));
        song4 = new SongViewHolder(findViewById(R.id.song4), songs.get(3));
    }
}
class SongViewHolder{
    TextView tvTitle;
    TextView tvArtist;
    ImageView ivAlbum;

    public SongViewHolder(View songView, Song song) {
        tvArtist  = (TextView) songView.findViewById(R.id.tvArtist);
        tvTitle  = (TextView) songView.findViewById(R.id.tvTitle);
        ivAlbum  = (ImageView) songView.findViewById(R.id.ivAlbum);
        dispSong(song);
    }

    private void dispSong(Song song){
        tvArtist.setText(song.getArtist());
        tvTitle.setText(song.getTitle());
        ivAlbum.setImageResource(song.getImageResID());
    }
}