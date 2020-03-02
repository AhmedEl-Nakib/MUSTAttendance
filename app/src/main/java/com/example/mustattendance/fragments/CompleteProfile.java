package com.example.mustattendance.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mustattendance.R;
import com.example.mustattendance.databinding.FragmentCompleteProfileBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class CompleteProfile extends Fragment {

    FragmentCompleteProfileBinding binding;

    public CompleteProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCompleteProfileBinding.inflate(inflater);
        binding.setLifecycleOwner(this);
        binding.registerBtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_completeProfile_to_studentHome);
            }
        });
        return binding.getRoot();
    }
}
