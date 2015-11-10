package com.example.user.hairstyle;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import fragments.FullImageFragment;
import fragments.OneButtonFragment;


/**
 * A placeholder fragment containing a simple view.
 */
public class ViewPhotoActivity extends AppCompatActivity {

    public ViewPhotoActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_view);

        initialize();
    }

    private void initialize() {
        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MainFragmentAdapter(getSupportFragmentManager()));
        pager.setCurrentItem(0);
    }

    class MainFragmentAdapter extends FragmentPagerAdapter{

        public MainFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0 :
                    return FullImageFragment.newInstance(R.drawable.sample1);
                case 1:
                    return FullImageFragment.newInstance(R.drawable.sample2);
                case 2:
                    return new OneButtonFragment();
                default:
                    return new Fragment();
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
