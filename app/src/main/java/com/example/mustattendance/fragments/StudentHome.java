package com.example.mustattendance.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.mustattendance.R;
import com.example.mustattendance.databinding.FragmentStudentHomeBinding;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class StudentHome extends Fragment {

    FragmentStudentHomeBinding binding;

    public StudentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentStudentHomeBinding.inflate(inflater);
        binding.setLifecycleOwner(this);
        binding.aboutBtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_studentHome_to_about);
            }
        });
        binding.schedulesBtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_studentHome_to_subjectSchedules);
            }
        });




        Glide.with(getActivity()).load("https://avatars0.githubusercontent.com/u/33866122?s=400&u=958a1cb82426b24f47dc872cdf096ac58f3e56fe&v=4").into(binding.studentImgId);
        return binding.getRoot();

    }
}
