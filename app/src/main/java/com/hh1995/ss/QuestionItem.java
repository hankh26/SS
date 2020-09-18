package com.hh1995.ss;

import androidx.recyclerview.widget.RecyclerView;

public class QuestionItem {

    String title;
    String Nick;
    String date;
    RecyclerView queRecyclerView;

    public QuestionItem() {
    }

    public QuestionItem(String title, String nick, String date, RecyclerView queRecyclerView) {
        this.title = title;
        Nick = nick;
        this.date = date;
        this.queRecyclerView = queRecyclerView;
    }
}
