package com.example.egovernment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.egovernment.databinding.ActivityMainBinding;
import com.example.egovernment.fragment.FireStationFragment;
import com.example.egovernment.fragment.HealthCenterFragment;
import com.example.egovernment.fragment.HomeFragment;
import com.example.egovernment.fragment.PoliceStationFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNV.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.policeStation:
                    replaceFragment(new PoliceStationFragment());
                    break;
                case R.id.healthCenter:
                    replaceFragment(new HealthCenterFragment());
                    break;
                case R.id.fireStation:
                    replaceFragment(new FireStationFragment());
                    break;
            }
            return true;
        });

    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}