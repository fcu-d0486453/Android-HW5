package shiro.iecs.edu.fcu.list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ArrayList<Item> item_list = new ArrayList(); //item_list就是你要傳入的東西

        //public Item(String title,String details)
        item_list.add(new Item("A","A123456............"));
        item_list.add(new Item("B","B123456778........."));
        item_list.add(new Item("C","C123456778........."));
        item_list.add(new Item("D","D123456778........."));
        //這樣item_list就是你想要的資料了

        ListView listV;
        listV=(ListView)findViewById(R.id.list);

        //設定一下adapter
        MyAdapter adapter = new MyAdapter
                (MainActivity.this,  item_list);


        listV.setAdapter(adapter);
    }

}
