package com.project.harsh.buttonlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by harsh on 7/3/17.
 */

public class MainActivity extends AppCompatActivity {

    String[] demolist = new String[]{"list1", "list2", "list3", "list4", "list5", "list6",
            "list7", "list8", "list9", "list10", "list11", "list12",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Post> posts = new ArrayList<>();

        for (int i = 0; i < demolist.length; i++) {
            Post item = new Post(demolist[i]);
            posts.add(item);

            ListView listView = (ListView) findViewById(R.id.list);
            CustomAdapter adapter = new CustomAdapter(MainActivity.this, R.layout.single_list, posts);
            listView.setItemsCanFocus(false);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Toast.makeText(MainActivity.this, "List View Clicked:"+ position,
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
