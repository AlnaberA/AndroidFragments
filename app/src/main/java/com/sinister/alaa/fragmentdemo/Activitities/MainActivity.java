package com.sinister.alaa.fragmentdemo.Activitities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sinister.alaa.fragmentdemo.Adapters.SectionStatePagerAdapter;
import com.sinister.alaa.fragmentdemo.Fragments.Fragment1;
import com.sinister.alaa.fragmentdemo.Fragments.Fragment2;
import com.sinister.alaa.fragmentdemo.Fragments.Fragment3;
import com.sinister.alaa.fragmentdemo.R;

public class MainActivity extends AppCompatActivity {

    private SectionStatePagerAdapter sectionStatePagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sectionStatePagerAdapter = new SectionStatePagerAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.container);
        //Setup the pager
        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionStatePagerAdapter adapter = new SectionStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(), "Fragment1");
        adapter.addFragment(new Fragment2(), "Fragment2");
        adapter.addFragment(new Fragment3(), "Fragment3");
        viewPager.setAdapter(adapter);
    }
    public void setViewPager(int fragmentNumber){
        viewPager.setCurrentItem(fragmentNumber);
    }
}
