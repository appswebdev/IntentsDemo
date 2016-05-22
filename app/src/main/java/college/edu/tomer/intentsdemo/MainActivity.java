package college.edu.tomer.intentsdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewParent;
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

    public void showDetails(View view) {
        //view.setBackgroundColor(0xFF0000FF);
        //1) instantiate a new Intent with the destination class
        ViewParent parent = view.getParent();
        Context c = getApplicationContext();
        Intent dIntent = new Intent(c, DetailsActivity.class);

        //put extra data
        switch (view.getId()){
            case R.id.song1:
                dIntent.putExtra("SongIndex", 0);
                break;
            case R.id.song2:
                dIntent.putExtra("SongIndex", 1);
                break;
            case R.id.song3:
                dIntent.putExtra("SongIndex", 2);
                break;
            case R.id.song4:
                dIntent.putExtra("SongIndex", 3);
                break;
        }

        //3) start the intent:
        startActivity(dIntent);
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