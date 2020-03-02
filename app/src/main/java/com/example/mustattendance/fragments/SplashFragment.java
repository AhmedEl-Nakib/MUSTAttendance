package com.example.mustattendance.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mustattendance.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SplashFragment extends Fragment {

    private final int SPLASH_TIME = 3000;

    public SplashFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_splash, container, false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Navigation.findNavController(getView()).navigate(R.id.action_splashFragment_to_completeProfile);
            }
        },SPLASH_TIME);

        return view;
    }
}
