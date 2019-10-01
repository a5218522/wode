package com.example.administrator.yanggeproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class fragament_tuijian extends Fragment {
  private RecyclerView mRecyclerView,Y;
  private BannerAdapter bannerAdapter;
  private View view;
  private LinearLayout layout;
  private Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_fragament_tuijian,container,false);
        initRecyclerView1();

        return view;
    }




    private void initRecyclerView1(){
        Y=(RecyclerView)view.findViewById(R.id.aabb);
        final LinearLayoutManager ms=new LinearLayoutManager(getActivity());
        ms.setOrientation(LinearLayoutManager.HORIZONTAL);
        Y.setLayoutManager(ms);
        Y.setAdapter(bannerAdapter =new BannerAdapter());
        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(Y);

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {

            int i=0;
            public void run() {
                if(i<6){
                    Y.smoothScrollToPosition(ms.findFirstVisibleItemPosition()+1);
                    i++;
                }
                if(i==6){
                    Y.smoothScrollToPosition(0);
                    i=0;
                }

            }
        }, 2000, 2000, TimeUnit.MILLISECONDS);
        }


    }

//Y.smoothScrollToPosition(ms.findFirstVisibleItemPosition()+1);

       // int i=0;
       // if(i<3){
       // Y.smoothScrollToPosition(ms.findFirstVisibleItemPosition()+1);
       // i++;
       // }
       // if(i==3){
      //  Y.scrollToPosition(0);
      //  }
      //  }













