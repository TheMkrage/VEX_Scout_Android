package org.team3309.vexscout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.parse.Parse;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "EdPqJx6LYWJ0cbCcPfcZQMdOuZweb1EQKDiqKkjN", "0M3N843YfciB1tZPqlwL3IFlh8LRHdDMk9c0fYLu");

        setContentView(R.layout.activity_main_menu);

        RecyclerView view = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        view.setLayoutManager(layoutManager);

        List<Team> list = new ArrayList<Team>();
        list.add(new Team("HOWDY"));
        list.add(new Team("PARTNER"));
        list.add(new Team("THIS"));
        list.add(new Team("IS"));
        list.add(new Team("A"));
        list.add(new Team("CARD"));
        CardAdapter adapter = new CardAdapter(list);
        view.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
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
