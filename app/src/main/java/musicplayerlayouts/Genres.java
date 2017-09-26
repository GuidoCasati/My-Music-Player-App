package musicplayerlayouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.mymusicplayer.MainActivity;
import com.example.android.mymusicplayer.R;
import com.example.android.mymusicplayer.Song;
import com.example.android.mymusicplayer.SongAdapter;

import java.util.ArrayList;

public class Genres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genres);

        // ArrayList + ListAdapter
        ArrayList<Song> alGenres = new ArrayList<>();
        alGenres.add(new Song("Blues","Eric Clapton, BB King"));
        alGenres.add(new Song("Country","Johnny Cash, Steve Ray Vaughn"));
        alGenres.add(new Song("Funk","Stevie Wonder, Prince"));
        SongAdapter songsAdapter =  new SongAdapter(this, alGenres, R.color.category_genres);

        //android.R.layout.simple_list_item_1
        ListView listView = (ListView) findViewById(R.id.GenreList);
        listView.setAdapter(songsAdapter);
    }
    @Override
    public void onBackPressed(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    /*listview.setOnItemClickListener(new OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?>adapter,View v, int position){
            ItemClicked item = adapter.getItemAtPosition(position);

            Intent intent = new Intent(Activity.this,destinationActivity.class);
            //based on item add info to intent
            startActivity(intent);
        }
    });*/
}
