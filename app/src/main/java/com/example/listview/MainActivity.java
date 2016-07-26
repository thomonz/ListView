package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<ItemBean> list = new ArrayList<ItemBean>();
        for (int i = 0 ; i < 2000;i++)
        {
            list.add(new ItemBean(R.mipmap.ic_launcher,"我是标题"+i,"我是内容"+i));
        }

        ListView listView = (ListView) findViewById(R.id.li_1);
        listView.setAdapter(new MyAdapter(this,list));
    }
}
