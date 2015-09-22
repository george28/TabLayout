package hargis.tablayout;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class AndroidTabLayoutActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_tab_layout);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec photospec = tabHost.newTabSpec("Photos");

        photospec.setIndicator("Photos", getResources().getDrawable(R.drawable.icon_photo_tab));
        Intent photosIntent = new Intent(this, PhotosActivity.class);
        photospec.setContent(photosIntent);


        TabHost.TabSpec songsspec = tabHost.newTabSpec("Songs");

        songsspec.setIndicator("Songs", getResources().getDrawable(R.drawable.icon_photo_tab));

        Intent songsIntent = new Intent(this, SongsActivity.class);
        photospec.setContent(songsIntent);


        TabHost.TabSpec videosspec = tabHost.newTabSpec("Video");

        videosspec.setIndicator("Videos", getResources().getDrawable(R.drawable.icon_photo_tab));
        Intent videosIntent = new Intent(this, VideosActivity.class);
        photospec.setContent(videosIntent);

        tabHost.addTab(photospec);
        tabHost.addTab(songsspec);
        tabHost.addTab(videosspec);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_android_tab_layout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
