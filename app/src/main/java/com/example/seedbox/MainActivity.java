package com.example.seedbox;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;


import com.example.seedbox.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    private Toolbar toolbar;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //navigation drawer
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null){
        getSupportFragmentManager().beginTransaction().add(R.id.frag_home,
                new Home()).commit();
        navigationView.setCheckedItem(R.id.nav_home);
        }


    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        viewFlipper = findViewById(R.id.view_flipper);

        switch (menuItem.getItemId()){
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.frag_home,
                        new Home()).commit();
                break;
            case R.id.nav_seedboxplan:
                getSupportFragmentManager().beginTransaction().replace(R.id.frag_home,
                        new seedboxsection()).commit();
                break;
            case R.id.nav_bdt:
                viewFlipper.setDisplayedChild(1);
                break;
            case R.id.nav_btc:
                viewFlipper.setDisplayedChild(2);
                break;

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);

        }else if ((viewFlipper.getDisplayedChild() == 1) || (viewFlipper.getDisplayedChild() == 2) ) {
            viewFlipper.setDisplayedChild(0);
        }else if(getSupportFragmentManager().getBackStackEntryCount() > 0){
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }



}
