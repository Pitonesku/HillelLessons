package com.company.HomeTask10;

import java.util.Scanner;

public class AddTaskStatus extends MenuItem {


    public AddTaskStatus(Scanner sc) {
        this.sc = sc;
    }
    private Scanner sc;
    @Override
    public String getMenuItemName(){
      return "Edit task status";
    }

    @Override
    public void run() {
        System.out.println("Choose task to edit:");
        TaskList.showTaskList();
        int userInput = sc.nextInt();
       Task[] taskList = TaskList.getTaskList();
        System.out.printf("Enter new status\n");
        sc.nextLine();
        taskList[userInput-1].setTaskStatus(sc.nextLine());
    }
}
