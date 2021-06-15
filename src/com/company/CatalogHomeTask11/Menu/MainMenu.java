package com.company.CatalogHomeTask11.Menu;

import com.company.CatalogHomeTask11.*;

import java.util.Scanner;

public class MainMenu implements MenuItem {
    Scanner sc;
    Catalog catalog;
    MenuItem[] mainMenu;

    public MainMenu(){
    }

    public MainMenu(Scanner sc, Catalog catalog) {
        this.sc = sc;
        this.catalog = catalog;
        mainMenu = new MenuItem[]{
                new AddToCatalog(this.catalog, this.sc),
                new RemoveFromCatalog(this.catalog, this.sc),
                new ShowAllCatalog(this.catalog, this.sc),
                new ShowSelectedProducts(this.catalog, this.sc),
                new Exit()
        };
    }


    @Override
    public String getName() {
        return "===Main mainMenu===";
    }

    @Override
    public void run() {
        System.out.println("\n===Main mainMenu===\n");
        for (int i = 0; i < mainMenu.length; i++) {
            System.out.printf("%d. %s\n", i + 1, mainMenu[i].getName());
        }
        System.out.println("Please choose");
        int userInput = checkInput();
        mainMenu[userInput - 1].run();

    }


    public int checkInput() {
        while (true) {
            int userInput = sc.nextInt();
            if (userInput > mainMenu.length || userInput < 1) {
                System.out.println("Incorrect input. Try again");
                continue;
            }
            return userInput;
        }
    }
}

