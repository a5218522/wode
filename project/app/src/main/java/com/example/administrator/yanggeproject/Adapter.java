package com.example.administrator.yanggeproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class Adapter extends FragmentStatePagerAdapter {
    public List<Fragment> mFragmentList;

    public Adapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        mFragmentList=fragmentList;
    }

    @Override
    public Fragment getItem(int position) {

        return mFragmentList==null?null:mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList==null?0:mFragmentList.size();
    }
}
