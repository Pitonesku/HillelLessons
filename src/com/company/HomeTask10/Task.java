package com.company.HomeTask10;

import java.util.Scanner;

public class Task {
  private Scanner sc;


    private String taskName;
    private String taskStatus = "in Progress";

    public void setTaskStatus(String taskStatus){
        this.taskStatus = taskStatus;
    }

    public String getTaskStatus(){
        return taskStatus;
    }

    public Task(Scanner sc){
        this.sc = sc;
        System.out.println("Enter new task");
        sc.nextLine();
        taskName = sc.nextLine();
              }

    public String getTaskName() {
        return taskName;
    }
}
