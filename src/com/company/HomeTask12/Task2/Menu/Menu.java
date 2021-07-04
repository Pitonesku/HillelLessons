package com.company.HomeTask12.Task2.Menu;

import com.company.HomeTask12.Task2.Loggers.Logger;

import java.util.List;
import java.util.Scanner;

public class Menu implements MenuItem {
    public Menu(List<MenuItem> menu, String menuName, Scanner sc, Logger logger) {
        this.menu = menu;
        this.menuName = menuName;
        this.sc = sc;
        this.logger = logger;
    }


    List<MenuItem> menu;
    String menuName;
    Scanner sc;
    Logger logger;


    @Override
    public String getName() {
        return menuName;
    }

    @Override
    public void run() {
        while (true) {
            showMenu();
            logger.info("Menu created");
            int userInput = getUserInput();
            logger.info("User input received", this.menu);
            if (userInput == menu.size()) break;
            menu.get(userInput - 1).run();
        }
    }

    public void showMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.printf("%d - %s. \n", i + 1, menu.get(i).getName());
        }
    }

    public int getUserInput() {
        while (true) {
            int userInput = sc.nextInt();
            if (0 > userInput || userInput > menu.size()) {
                System.out.println("Incorrect input. Try again");
                logger.error("User input received", this.menu);
                continue;
            }
            return userInput;
        }
    }
}
