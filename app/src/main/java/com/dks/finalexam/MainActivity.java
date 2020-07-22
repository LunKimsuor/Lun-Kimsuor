package com.dks.finalexam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.dks.finalexam.fragments.AccountFragment;
import com.dks.finalexam.fragments.CategoryFragment;
import com.dks.finalexam.fragments.HomeFragment;
import com.dks.finalexam.fragments.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        listener();
    }

    public void init() {
        bottomNavigationView = findViewById(R.id.main_nav);

        showFragment(new HomeFragment());
    }

    public void listener() {
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(true);

                switch (item.getItemId()) {
                    case R.id.nav_home:
                        showFragment(new HomeFragment());
                        break;
                    case R.id.nav_category:
                        showFragment(new CategoryFragment());
                        break;
                    case R.id.nav_search:
                        showFragment(new SearchFragment());
                        break;
                    case R.id.nav_account:
                        showFragment(new AccountFragment());
                        break;
                }
                return false;
            }
        });
    }

    public void showFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_body, fragment).commit();
    }
}
