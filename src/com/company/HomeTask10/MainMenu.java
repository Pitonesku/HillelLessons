package com.company.HomeTask10;

import java.util.Scanner;

public class MainMenu extends MenuItem {

    private Scanner sc = new Scanner(System.in);

    private MenuItem[] mainMenu = {new AddNewTask(sc),
            new TaskList()};

    void showMenu() {
        System.out.printf("=== MAIN MENU ===\n");
        for (int i = 0; i < mainMenu.length; i++) {
            System.out.printf("%d. %s \n", i + 1, mainMenu[i].getMenuItemName());
        }
        System.out.printf("%d. Exit \n", mainMenu.length + 1);
    }

    @Override
    public void run() {
        while (true) {
            showMenu();
            System.out.printf("Please choose: \n");

            int userInput = sc.nextInt();
            if (userInput == mainMenu.length + 1) {
                break;
            }
            if (userInput <= 0 || userInput > mainMenu.length) {
                System.out.printf("Incorrect input. Try again.\n");
                continue;
            }
            mainMenu[userInput - 1].run();
            boolean isReq = SubMenu.isSubMenuRequired();
            if (!isReq) continue;

                SubMenu subMenu = new SubMenu();
                subMenu.run();

            }


        }


    }

