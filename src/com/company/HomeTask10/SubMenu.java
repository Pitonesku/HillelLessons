package com.company.HomeTask10;

import java.util.Scanner;

public class SubMenu  extends MenuItem {


    private static boolean isSubMenuRequired =false;

    public static void setIsSubMenuRequired(boolean isSubMenuRequired) {
        SubMenu.isSubMenuRequired = isSubMenuRequired;
    }

    public static boolean isSubMenuRequired() {
        return isSubMenuRequired;
    }
    Scanner sc = new Scanner(System.in);

    MenuItem[] subMenu = {
            new AddTaskStatus(sc),
            new DeleteTask(sc),
            new AddNewTask(sc),
            new ReturnToMainMenu(),
    };

    void showSubMenu(){
        System.out.println("-----------");
        System.out.println("What to do next");

        for (int i = 0; i<subMenu.length ; i++) {
            System.out.printf("%d. %s\n", i+1, subMenu[i].getMenuItemName());
        }
    }

    @Override
    public void run() {
        while(true) {
            isSubMenuRequired = false;
            showSubMenu();
            int userInput = sc.nextInt();
            if (userInput == subMenu.length) break;
            if(userInput < 0 || userInput>subMenu.length) {
                System.out.print("Incorrect input. Try again \n");
            } else {
                subMenu[userInput-1].run();
            }
        }
    }
}
