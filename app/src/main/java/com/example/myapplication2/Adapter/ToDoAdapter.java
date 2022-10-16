package com.example.myapplication2.Adapter;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.MainActivity;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder> {

    private List<ToDoModel> todoList;
    private MainActivity activity;

    public ToDoAdapter(MainActivity activity) {
        this.activity = activity;
    }
}
