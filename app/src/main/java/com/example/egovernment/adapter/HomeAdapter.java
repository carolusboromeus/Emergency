package com.example.egovernment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.egovernment.model.HomeModel;
import com.example.egovernment.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    Context context;
    ArrayList<HomeModel> homeModelArrayList;

    public HomeAdapter(Context context, ArrayList<HomeModel> newArrayList) {
        this.context = context;
        this.homeModelArrayList = newArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.list_home,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HomeModel homeModel = homeModelArrayList.get(position);
        holder.icon.setImageResource(homeModel.image);
        holder.company.setText(homeModel.name);
        holder.phone.setText(homeModel.call);
    }

    @Override
    public int getItemCount() {
        return homeModelArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView icon;
        TextView company, phone;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.iconIV);
            company = itemView.findViewById(R.id.companyTV);
            phone = itemView.findViewById(R.id.phoneTV);
        }
    }
}
