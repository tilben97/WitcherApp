package com.example.swipe_test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.swipe_test.databinding.ActivityMainBinding;
import com.example.swipe_test.ui.main.SectionsPagerAdapter;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = binding.fab;
        FloatingActionButton fab2 = binding.fab2;



        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sectionsPagerAdapter.getMessage(tabs.getSelectedTabPosition());
                Snackbar.make(view, Global_Variables.weapon, Snackbar.LENGTH_LONG).show();
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sectionsPagerAdapter.getMessage(tabs.getSelectedTabPosition());
                Snackbar.make(view, Global_Variables.magic, Snackbar.LENGTH_LONG).show();
            }
        });


    }
}