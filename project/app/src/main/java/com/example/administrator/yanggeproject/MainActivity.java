package com.example.administrator.yanggeproject;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lwj.widget.viewpagerindicator.ViewPagerIndicator;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;
import com.roughike.bottombar.TabSelectionInterceptor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    ImageView menu;
    private List<String> mDatas;
    private Button tuijian;
    private BottomBar bottomBar;
    private BottomBarTab nearby;
    private List<Fragment> fragmentList;
    private ViewPager vp;
    private List<TextView> textViewList;
    private TextView aaa,bbb,ccc;
    private int mDefaultColor= Color.BLACK;
    private TextView textView,aaa1,bbb1,ccc1;
    private ViewPagerIndicator viewPagerIndicator;
    private int mActiveColor=Color.WHITE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        //drawLayout
        drawerLayout = (DrawerLayout) findViewById(R.id.activity_na);
        navigationView = (NavigationView) findViewById(R.id.nav);
        menu = (ImageView) findViewById(R.id.chitem);
        View headerView = navigationView.getHeaderView(0);//获取头布局
        menu.setOnClickListener(this);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //item.setChecked(true);
                Toast.makeText(MainActivity.this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawer(navigationView);
                return true;
            }
        });

        //按钮
        aaa1=(TextView)findViewById(R.id.aaa);
        bbb1=(TextView)findViewById(R.id.bbb);
        ccc1=(TextView)findViewById(R.id.ccc);

      // tuijian=(Button) findViewById(R.id.tuijian);
        fragmentList=new ArrayList<Fragment>();
        fragmentList.add(new fragament_tuijian());
        fragmentList.add(new fragament2());
        fragmentList.add(new fragment3());
        aaa=(TextView)findViewById(R.id.aaa);
        bbb=(TextView)findViewById(R.id.bbb);
        ccc=(TextView)findViewById(R.id.ccc);
        textViewList=new ArrayList<TextView>();
        textViewList.add(aaa);
        textViewList.add(bbb);
        textViewList.add(ccc);
        textViewList.get(0).setTextColor(mActiveColor);
        vp=(ViewPager)findViewById(R.id.vp);
        vp.setOffscreenPageLimit(3);
        vp.setAdapter(new Adapter(getSupportFragmentManager(),fragmentList));
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                //Do Nothing
            }

            @Override
            public void onPageSelected(int position) {
                for (TextView viewer :
                        textViewList) {
                    viewer.setTextColor(mDefaultColor);
                }
                textViewList.get(position).setTextColor(mActiveColor);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                //Do Nothing
            }
        });






    }




    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.chitem:
                if (drawerLayout.isDrawerOpen(navigationView)) {
                    drawerLayout.closeDrawer(navigationView);
                } else {
                    drawerLayout.openDrawer(navigationView);
                }
                break;
        }
    }


    public void guanzhu(View v) {
        Intent intent = new Intent(this,guanzhu.class);
        startActivity(intent);
    }

//Button 推荐 点击事件
   // public void abc(View view)
   // {

    //    fragament_tuijian fra=new fragament_tuijian();
   //     getSupportFragmentManager().beginTransaction().replace(R.id.aaa,fra).commit();
  // }
    public void aaa(View v){
        vp.setCurrentItem(0);;
   }
     public void bbb(View v){
        vp.setCurrentItem(1);;
     }
    public void ccc(View v){
        vp.setCurrentItem(2);;
    }



}






