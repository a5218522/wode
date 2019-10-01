package com.example.administrator.yanggeproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class geqv extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView myListView;
    private String[] name = {" So Cute", " 可不可以", " 吻得太逼真", ""};
    private String[] name2 = {"  Lopu$", "  张紫豪", "  张敬轩", ""};
    private List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geqv);
        myListView = (ListView) findViewById(R.id.lv2);
        for (int i = 0; i < name.length; i++) {
            HashMap<String, Object> item = new HashMap<String, Object>();
            item.put("a1", name[i]);
            item.put("a2", name2[i]);
            list.add(item);
        }
        SimpleAdapter simAdapt = new SimpleAdapter(this, list, R.layout.geqvitem, new String[]{"a1", "a2"}, new int[]{R.id.tx1, R.id.tx2});
        myListView.setAdapter(simAdapt);
        myListView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if(position==0){
            Intent intent = new Intent(this,socute.class);
            startActivity(intent);

        }

    }
        public void finish1(View v){
            finish();
        }
    }



