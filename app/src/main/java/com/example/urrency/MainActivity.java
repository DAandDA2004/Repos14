package com.example.urrency;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) this.findViewById(R.id.listview);

        ArrayList<DataFlags> list = new ArrayList<>();

        list.add(new DataFlags(R.drawable.ru, R.string.russian, R.string.russiaRUB,R.string.capitalrussia));
        list.add(new DataFlags(R.drawable.za, R.string.africa, R.string.africaZAR,R.string.capitalafrika));
        list.add(new DataFlags(R.drawable.sg, R.string.singapore, R.string.singaporeSGD,R.string.capitalsingapore));
        list.add(new DataFlags(R.drawable.tr, R.string.turkish, R.string.turkishTRY,R.string.capitalturkish));
        list.add(new DataFlags(R.drawable.cn, R.string.china, R.string.chinaYUA,R.string.capitalchina));
        list.add(new DataFlags(R.drawable.de, R.string.germany, R.string.germanyEUR,R.string.capitalgerman));
        list.add(new DataFlags(R.drawable.ch, R.string.switzerland, R.string.switzerlandFRA,R.string.capitalswitzerland));


        MyListAdapter myListAdapter = new MyListAdapter(this, list);
        listView.setAdapter(myListAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.string.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}