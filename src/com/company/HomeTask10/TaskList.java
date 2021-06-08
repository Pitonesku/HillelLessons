package com.company.HomeTask10;

public class TaskList extends MenuItem {

    private static Task[] taskList = new Task[0];

    public static void setTaskList(Task[] taskList) {
        TaskList.taskList = taskList;
    }

    public static Task[] getTaskList() {
        return taskList;
    }

    public String getMenuItemName() {
        return "Task List";
    }

    /**
     * Выводит на экран список задач, используя метод showTaskList.
     * Устанавливает значение необходимости под меню.
     */
    @Override
    public void run() {
        if (taskList.length == 0) {
            System.out.println("You have No task");
            System.out.println("=================");
        } else {

            showTaskList();
            SubMenu.setIsSubMenuRequired(true);
           }
    }

    public static void showTaskList() {

        for (int i = 0; i < taskList.length; i++) {

            if(taskList.length == 0) System.out.println("You have the following tasks:");
            System.out.printf("%d. %s       Status: <%s>\n",i+1,taskList[i].getTaskName(), taskList[i].getTaskStatus());
        }
        System.out.println();
    }
}

