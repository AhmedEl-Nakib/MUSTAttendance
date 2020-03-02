package com.example.mustattendance.fragments.subjectSchedules;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mustattendance.R;

import java.util.List;

public class SchedulesRecyclerViewAdapter extends RecyclerView.Adapter<SchedulesRecyclerViewAdapter.schedulesRecyclerViewAdapter> {

    Context context;
    List<SchedulesModel> myList;


    public SchedulesRecyclerViewAdapter(Context context, List<SchedulesModel> myList) {
        this.context = context;
        this.myList = myList;
    }

    @NonNull
    @Override
    public SchedulesRecyclerViewAdapter.schedulesRecyclerViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.subject_schedules_row, null);
        return new schedulesRecyclerViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SchedulesRecyclerViewAdapter.schedulesRecyclerViewAdapter holder, int position) {
        final SchedulesModel myModel = myList.get(position);
        holder.roomNo.setText(myModel.getRoomNo());
        holder.lectureName.setText(myModel.getLectureName());
        holder.dateAndTime.setText(myModel.getDateAndTime());
        holder.instructor.setText(myModel.getInstructor());
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    public class schedulesRecyclerViewAdapter extends RecyclerView.ViewHolder {

        TextView roomNo,lectureName,dateAndTime,instructor;

        public schedulesRecyclerViewAdapter(@NonNull View itemView) {
            super(itemView);
            roomNo = itemView.findViewById(R.id.roomNoId);
            lectureName = itemView.findViewById(R.id.lectureNameId);
            dateAndTime = itemView.findViewById(R.id.dateAndTimeId);
            instructor = itemView.findViewById(R.id.instructorId);
        }
    }
}
