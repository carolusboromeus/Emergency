package com.example.egovernment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.egovernment.R;
import com.example.egovernment.model.EmergencyModel;

import java.util.ArrayList;

public class EmergencyAdapter extends RecyclerView.Adapter<EmergencyAdapter.MyViewHolder>{

    Context context;
    ArrayList<EmergencyModel> emergencyModelList;

    public EmergencyAdapter(Context context, ArrayList<EmergencyModel> newArrayList) {
        this.context = context;
        this.emergencyModelList = newArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_emergency,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        EmergencyModel emergencyModel = emergencyModelList.get(position);
        holder.image.setImageResource(emergencyModel.getImageEmergency());
        holder.title.setText(emergencyModel.getTitleEmergency());
        holder.sub.setText(emergencyModel.getSubEmergency());
    }

    @Override
    public int getItemCount() {
        return emergencyModelList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title, sub;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.emergencyIV);
            title = itemView.findViewById(R.id.titleEmergencyTV);
            sub = itemView.findViewById(R.id.addressEmergencyTV);
        }
    }
}
