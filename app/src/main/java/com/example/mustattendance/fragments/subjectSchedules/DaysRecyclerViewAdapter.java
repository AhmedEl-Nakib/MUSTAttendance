package com.example.mustattendance.fragments.subjectSchedules;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mustattendance.R;

import java.util.List;

public class DaysRecyclerViewAdapter extends RecyclerView.Adapter<DaysRecyclerViewAdapter.daysRecyclerViewAdapter> {

    Context context;
    List<String> myList;

    public DaysRecyclerViewAdapter(Context context, List<String> myList) {
        this.context = context;
        this.myList = myList;
    }

    @NonNull
    @Override
    public daysRecyclerViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.subject_schedules_day_row, null);
        return new daysRecyclerViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull daysRecyclerViewAdapter holder, int position) {
        final String day = myList.get(position);
        holder.day.setText(day);
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    static class daysRecyclerViewAdapter extends RecyclerView.ViewHolder {

        TextView day;

        daysRecyclerViewAdapter(@NonNull View itemView) {
            super(itemView);
            day = itemView.findViewById(R.id.dayTxtViewId);
        }
    }
}
