package com.example.mustattendance.fragments.subjectSchedules;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mustattendance.R;
import com.example.mustattendance.databinding.FragmentSubjectSchedulesBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */

public class SubjectSchedules extends Fragment {

    FragmentSubjectSchedulesBinding binding;
    List<String> arrayList;
    List<SchedulesModel> schedulesModels;
    DaysRecyclerViewAdapter adapter ;
    SchedulesRecyclerViewAdapter schedulesRecyclerViewAdapter;
    LinearLayoutManager mLayoutManager;

    public SubjectSchedules() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSubjectSchedulesBinding.inflate(inflater);
        binding.setLifecycleOwner(this);

        binding.backBtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Objects.requireNonNull(getActivity()).onBackPressed();
            }
        });
        mLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);

        addData();

        return binding.getRoot();
    }

    private void addData()
    {
        arrayList = new ArrayList<>();
        arrayList.add("Saturday");
        arrayList.add("Sunday");
        arrayList.add("Monday");
        arrayList.add("Tuesday");
        arrayList.add("Wednesday");
        arrayList.add("Thursday");

        binding.daysRecyclerViewId.setLayoutManager(mLayoutManager);
        adapter = new DaysRecyclerViewAdapter(getActivity(),arrayList);
        binding.daysRecyclerViewId.setAdapter(adapter);



        schedulesModels = new ArrayList<>();
        schedulesModels.add(new SchedulesModel("523","Advanced Software Engineering","10:30 AM - 01:00 PM","Prof. Rania El-Gohary"));
        schedulesModels.add(new SchedulesModel("523","Advanced Software Engineering","10:30 AM - 01:00 PM","Prof. Rania El-Gohary"));
        schedulesModels.add(new SchedulesModel("523","Advanced Software Engineering","10:30 AM - 01:00 PM","Prof. Rania El-Gohary"));
        schedulesModels.add(new SchedulesModel("523","Advanced Software Engineering","10:30 AM - 01:00 PM","Prof. Rania El-Gohary"));
        schedulesModels.add(new SchedulesModel("523","Advanced Software Engineering","10:30 AM - 01:00 PM","Prof. Rania El-Gohary"));
        schedulesModels.add(new SchedulesModel("523","Advanced Software Engineering","10:30 AM - 01:00 PM","Prof. Rania El-Gohary"));
        schedulesRecyclerViewAdapter = new SchedulesRecyclerViewAdapter(getActivity(),schedulesModels);
        binding.scheduleRecyclerViewId.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.scheduleRecyclerViewId.setAdapter(schedulesRecyclerViewAdapter);
    }
}
