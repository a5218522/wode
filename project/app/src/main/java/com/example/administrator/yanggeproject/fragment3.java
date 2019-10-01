package com.example.administrator.yanggeproject;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class fragment3 extends Fragment implements AdapterView.OnItemClickListener{
    private ListView myListView;
    private String[] names={"本地音乐                                ","最近播放                                ","下载管理                                ","我的电台                                ","我的收藏                                "};
    private int[] picture={R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5};
    View view;
    private List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment3, container, false);
        a();
        return view;
    }


    public void a() {
        for (int i = 0; i < names.length; i++) {
            HashMap<String, Object> item = new HashMap<String, Object>();
            item.put("a1",names[i]);
            item.put("b",picture[i]);
            list.add(item);
        }
        myListView=view.findViewById(R.id.lv) ;
        SimpleAdapter simAdapt = new SimpleAdapter(getContext(), list, R.layout.item, new String[] { "a1","b"}, new int[] { R.id.textView1, R.id.imageView});
        myListView.setAdapter(simAdapt);
        myListView.setOnItemClickListener(this);
    }
    public  void onItemClick (AdapterView<?> parent, View view, int position, long id){
        if(position==0){
        Intent intent = new Intent(getContext(),geqv.class);
        startActivity(intent);}
    }


}



