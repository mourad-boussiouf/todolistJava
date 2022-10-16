package com.example.myapplication2.Adapter;

import android.view.LayoutInflater;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.MainActivity;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder> {

    private List<ToDoModel> todoList;
    private MainActivity activity;

    public ToDoAdapter(MainActivity activity) {
        this.activity = activity;
    }
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_layout, parent, false);
        return new RecyclerView.ViewHolder(itemView);
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        g
    }
}
