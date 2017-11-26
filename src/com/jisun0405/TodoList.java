package com.jisun0405;

import java.util.ArrayList;

public class TodoList {
    public String todoListName;
    ArrayList<ArrayList<String>> tasks = new ArrayList<>();

    public TodoList(String todoListName){
        this.todoListName = todoListName;

    }
}
