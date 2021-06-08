package com.company.HomeTask10;

import java.util.Scanner;


public class AddNewTask extends MenuItem {
    private Scanner sc;

    public AddNewTask(Scanner sc) {

        this.sc = sc;
    }

    @Override
    public String getMenuItemName() {
        return "Add new task";
    }

    @Override
    public void run() {
        Task[] newTaskList = new Task[TaskList.getTaskList().length+1];
        for (int i = 0; i < TaskList.getTaskList().length; i++) {
            newTaskList[i] = TaskList.getTaskList()[i];
        }
        newTaskList[newTaskList.length-1] = new Task(sc);
        TaskList.setTaskList(newTaskList);
        System.out.printf("Task successfully added\n\n");

    }
}
