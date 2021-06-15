package com.company.HomeTask10;

import java.util.Scanner;

public class DeleteTask extends MenuItem {

    private Scanner sc;

    public DeleteTask(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public String getMenuItemName() {
        return "Delete task";
    }

    /**
     * Удаляет задачу из списка.
     */
    public void run() {
        Task[] taskList = TaskList.getTaskList();
        System.out.printf("What task would you like to delete? Please choose below. Press 0 to cancel.\n");
        TaskList.showTaskList();
        int userInput = sc.nextInt();
        if (userInput == 0) return;
        if (userInput < 0 || userInput > taskList.length) {
            System.out.printf("Incorrect input. Try again \n");
        } else {
            TaskList.setTaskList(deleteTask(taskList, userInput - 1));
            System.out.printf("Task have been deleted. \n");
        }

    }

    /**
     * Удаляет выбранную пользователем задачу из списка задач и возвращает новый список задач;
     *
     * @param taskList список задач в виде массива;
     * @param Index    - индекс задачи которую необходимо удалить в массиве;
     * @return новый массив задач
     */

    public Task[] deleteTask(Task[] taskList, int Index) {
        taskList[Index] = null;
        Task[] newTaskList = new Task[taskList.length - 1];
        int j = 0;
        for (int i = 0; i < taskList.length; i++) {
            if (taskList[i] == null) {
                i++;
                continue;
            }
            newTaskList[j] = taskList[i];
            i++;
            j++;
        }
        return newTaskList;
    }
}


