package com.example.mustattendance.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mustattendance.R;
import com.example.mustattendance.databinding.FragmentAboutBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class About extends Fragment {

    FragmentAboutBinding binding;

    public About() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAboutBinding.inflate(inflater);
        binding.setLifecycleOwner(this);

        binding.backBtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        return binding.getRoot();
    }
}
