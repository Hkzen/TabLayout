package com.ibnumadjah.tablayout;

import android.content.Context;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private BeritaFragment _beritaFragment = new BeritaFragment();
    private ECommerceFragment _eCommerceFragment = new ECommerceFragment();
    private WikipediaFragment _wikipediaFragment = new WikipediaFragment();
    private Context _context;
    private int _tabCount;

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount){
        super(fragmentManager);

        _context = context;
        _tabCount = tabCount;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return _eCommerceFragment;
            case 1:
                return _beritaFragment;
            default:
                return _wikipediaFragment;
        }
    }

    @Override
    public int getCount() {
        return _tabCount;
    }
}
