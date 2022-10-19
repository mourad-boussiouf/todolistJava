package com.example.myapplication2.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.MainActivity;
import com.example.myapplication2.Model.ToDoModel;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder> {

    private List<ToDoModel> todoList;
    private MainActivity activity;

    public ToDoAdapter(MainActivity activity) {
        this.activity = activity;
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_layout, parent, false);
        return new ViewHolder(itemView);
    }

    public void onBindViewHolder(ViewHolder holder, int position){
        ToDoModel item = todoList.get(position);
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        CheckBox task;

        ViewHolder(View view){
            super(view);
            task =  view.findViewById(R.id.todoCheckBox);
        }
    }
}
