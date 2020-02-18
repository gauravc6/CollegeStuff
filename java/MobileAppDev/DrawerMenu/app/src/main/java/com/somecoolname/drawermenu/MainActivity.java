package com.somecoolname.drawermenu;

import android.os.Bundle;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;



public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        FragmentManager fragmentManager;
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        switch (menuItem.getItemId()) {

            case R.id.nav_gallery:
                GalleryFragment galleryFragment = new GalleryFragment();
                fragmentTransaction.replace(R.id.nav_host_fragment, galleryFragment, null);
                fragmentTransaction.commit();
                drawer.closeDrawer(GravityCompat.START);
                return true;

            case R.id.nav_home:
                HomeFragment homeFragment = new HomeFragment();
                fragmentTransaction.replace(R.id.nav_host_fragment, homeFragment, null);
                fragmentTransaction.commit();
                drawer.closeDrawer(GravityCompat.START);
                return true;

            case R.id.nav_share:
                ShareFragment shareFragment = new ShareFragment();
                fragmentTransaction.replace(R.id.nav_host_fragment, shareFragment, null);
                fragmentTransaction.commit();
                drawer.closeDrawer(GravityCompat.START);
                return true;

            case R.id.nav_send:
                SendFragment sendFragment = new SendFragment();
                fragmentTransaction.replace(R.id.nav_host_fragment, sendFragment, null);
                fragmentTransaction.commit();
                drawer.closeDrawer(GravityCompat.START);
                return true;

            case R.id.nav_tools:
                ToolsFragment toolsFragment = new ToolsFragment();
                fragmentTransaction.replace(R.id.nav_host_fragment, toolsFragment, null);
                fragmentTransaction.commit();
                drawer.closeDrawer(GravityCompat.START);
                return true;

            case R.id.nav_slideshow:
                SlideshowFragment slideshowFragment = new SlideshowFragment();
                fragmentTransaction.replace(R.id.nav_host_fragment, slideshowFragment, null);
                fragmentTransaction.commit();
                drawer.closeDrawer(GravityCompat.START);
                return true;
        }
        return false;
    }

    @Override
    public void onBackPressed () {
        DrawerLayout drawer  = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
}