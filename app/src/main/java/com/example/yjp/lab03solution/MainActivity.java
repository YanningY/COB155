package com.example.yjp.lab03solution;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    //Extra Mile: a function defined to display a ListView using the dummy data
    public void dispLV(){
        //create the datasource
        String[] datasource = {"Today - Storm 8 / 12", "Tomorrow - Foggy 9 / 13", "Thurs - Rainy 8 / 13", "Fri - foggy 8 / 12",
                "Sat - Sunny 9 / 14", "Sun - Sunny 10 / 15", "Mon - Sunny 11 / 15"};
        //instantiate an adapter
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), R.layout.listview, R.id.list_item, datasource);
        //get hold of the ListView element
        ListView mylv = (ListView) findViewById(R.id.listview);
        //bind the adapter to the listview
        mylv.setAdapter(adapter);
    }

    public void refresh(View view){
        //1.create the 3 arguments required to create a Toast message
        Context context = getApplicationContext();
        CharSequence msg = "Refreshing Weather!";
        int duration = Toast.LENGTH_SHORT;
        //2. create an object of Toast
        Toast toast = Toast.makeText(context,msg,duration);
        //3. display the toast
        toast.show();
        //Extra mile: display a ListView
        dispLV();
    }
}
