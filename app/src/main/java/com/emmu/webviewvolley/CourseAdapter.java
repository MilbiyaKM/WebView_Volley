package com.emmu.webviewvolley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.ViewHolder> {

    private ArrayList<CourseModalNew>courseModalNewArrayList;
    private Context context;
    public CourseAdapter(ArrayList<CourseModalNew> courseModalNewArrayList, Context context) {
        this.courseModalNewArrayList=courseModalNewArrayList;
        this.context=context;
    }

    @NonNull
    @Override
    public CourseAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.course_rv_itemnew,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.ViewHolder holder, int position) {
        CourseModalNew modal=courseModalNewArrayList.get(position);
        holder.courseNameTV.setText(modal.getCourseName());
        holder.courseTracksTV.setText(modal.getCourseTracks());
        holder.courseModeTV.setText(modal.getCourseMode());
        Picasso.get().load(modal.getCourseimg()).into(holder.courseIV);


    }

    @Override
    public int getItemCount() {
        return courseModalNewArrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

private TextView courseNameTV,courseModeTV,courseTracksTV;
private ImageView courseIV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            courseNameTV=itemView.findViewById(R.id.idTVcourseNameNew);
            courseModeTV=itemView.findViewById(R.id.idTVBatch);
            courseTracksTV=itemView.findViewById(R.id.idTVTracks);
            courseIV=itemView.findViewById(R.id.idIVcourse);
        }
    }
}
