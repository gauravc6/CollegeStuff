package com.somecoolname.bottomnavigation;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.somecoolname.bottomnavigation.ui.notifications.NotificationsFragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(navListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            switch(item.getItemId()) {
                case R.id.navigation_home:
                    HomeFragment homeFragment = new HomeFragment();
                    fragmentTransaction.replace(R.id.nav_host_fragment, homeFragment, null);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_dashboard:
                    DashboardFragment dashboardFragment = new DashboardFragment();
                    fragmentTransaction.replace(R.id.nav_host_fragment, dashboardFragment, null);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_notifications:
                    NotificationsFragment notificationsFragment = new NotificationsFragment();
                    fragmentTransaction.replace(R.id.nav_host_fragment, notificationsFragment, null);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_history:
                    HistoryFragment historyFragment = new HistoryFragment();
                    fragmentTransaction.replace(R.id.nav_host_fragment, historyFragment, null);
                    fragmentTransaction.commit();
                    return true;
            }
            return false;
        }
    };
}
