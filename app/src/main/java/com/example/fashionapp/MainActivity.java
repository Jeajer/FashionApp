package com.example.fashionapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav_view);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                switch (item.getItemId())
                {

                    case R.id.homeFragmentBtn:
                        fragmentTransaction.replace(R.id.fragmentContainerView, new HomeFragment(), null);
                        fragmentTransaction.commit();
                        break;
                    case R.id.shoppingFragmentBtn:

                        fragmentTransaction.replace(R.id.fragmentContainerView, new ShoppingFragment(), null);
                        fragmentTransaction.commit();
                        break;
                    case R.id.menuFragmentBtn:
                        fragmentTransaction.replace(R.id.fragmentContainerView, new MenuFragment(), null);
                        fragmentTransaction.commit();
                        break;
                    case R.id.userFragmentBtn:
                        fragmentTransaction.replace(R.id.fragmentContainerView, new UserFragment(), null);
                        fragmentTransaction.commit();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }
}