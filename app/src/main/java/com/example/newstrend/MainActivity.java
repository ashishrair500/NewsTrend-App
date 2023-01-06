package com.example.newstrend;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;


    TabItem mhome,mscience,mhealth,mtech,mentertainment,msport ;
     PagerAdapter pagerAdapter;

     Toolbar mtoolbar;

     String api="bba4d648a90243de9638e524ada1e673";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);

        mhome=findViewById(R.id.home);
        mscience= findViewById(R.id.science);
        msport=findViewById(R.id.sport);
        mtech=findViewById(R.id.technology);
        mentertainment=findViewById(R.id.entertainment);
      //  maboutmyapp=findViewById(R.id.about);
        mhealth=findViewById(R.id.health);
        ViewPager viewPager=findViewById(R.id.fragmentcontainer);
        tabLayout=findViewById(R.id.include);


        pagerAdapter =new PagerAdapter(getSupportFragmentManager(),6);
        viewPager.setAdapter(pagerAdapter);

        //if the user click of technology it should move on that fragment
      tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
          @Override
          public void onTabSelected(TabLayout.Tab tab) {
viewPager.setCurrentItem(tab.getPosition());
if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3|| tab.getPosition()==4||tab.getPosition()==5) {
    pagerAdapter.notifyDataSetChanged();
}

          }

          @Override
          public void onTabUnselected(TabLayout.Tab tab) {

          }

          @Override
          public void onTabReselected(TabLayout.Tab tab) {

          }
      });
//this is swipper
      //this might create problem i put extra stuff here (ViewPager.OnAdapterChangeListener);
viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}