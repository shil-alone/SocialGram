package com.codershil.socialgram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.codershil.socialgram.databinding.ActivityMainBinding;
import com.codershil.socialgram.fragments.AddPostFragment;
import com.codershil.socialgram.fragments.HomeFragment;
import com.codershil.socialgram.fragments.NotificationFragment;
import com.codershil.socialgram.fragments.ProfileFragment;
import com.codershil.socialgram.fragments.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();

        binding.mainBottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                int id = item.getItemId();
                switch (id) {
                    case R.id.home:
                        transaction.replace(R.id.fragment_container,new HomeFragment()).commit();
                        break;
                    case R.id.notification:
                        transaction.replace(R.id.fragment_container,new NotificationFragment()).commit();
                        break;
                    case R.id.addPost:
                        transaction.replace(R.id.fragment_container,new AddPostFragment()).commit();
                        break;
                    case R.id.search:
                        transaction.replace(R.id.fragment_container,new SearchFragment()).commit();
                        break;
                    case R.id.profile:
                        transaction.replace(R.id.fragment_container,new ProfileFragment()).commit();
                        break;
                }

                return true;
            }
        });
    }
}