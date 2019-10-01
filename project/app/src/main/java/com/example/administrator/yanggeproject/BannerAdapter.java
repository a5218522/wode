package com.example.administrator.yanggeproject;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.ViewHolder> {
    private int[] r={R.mipmap.c1,R.mipmap.c2,R.mipmap.c3,R.mipmap.c4,R.mipmap.c5,R.mipmap.c6};
    public BannerAdapter(){
    }
    public BannerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int ViewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.banner, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return 6;
    }


    public void onBindViewHolder( BannerAdapter.ViewHolder holder, int position) {

        holder.img.setImageResource(r[position]);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        public ViewHolder(View itemview){
            super(itemview);
            img=itemview.findViewById(R.id.im);
        }
    }


}