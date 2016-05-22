package college.edu.tomer.intentsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import models.PlayList;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent dIntent = getIntent();
        int songIndex = dIntent.getIntExtra("SongIndex", -1);

        Toast.makeText(DetailsActivity.this, PlayList.songs.get(songIndex).getTitle(), Toast.LENGTH_SHORT).show();
    }
}
