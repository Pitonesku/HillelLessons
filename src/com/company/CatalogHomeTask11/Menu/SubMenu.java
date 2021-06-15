package com.company.CatalogHomeTask11.Menu;

import com.company.CatalogHomeTask11.Catalog;
import com.company.CatalogHomeTask11.Menu.MenuItem;
import com.company.CatalogHomeTask11.Menu.ReturnToPreviousMenu;
import com.company.CatalogHomeTask11.Menu.ShowDetailInformation;

import java.util.Scanner;

public class SubMenu  implements MenuItem {


    Scanner sc;

    public SubMenu(Scanner sc) {
        this.sc = sc;
        subMenu = new MenuItem[]  {new ShowDetailInformation(), new ReturnToPreviousMenu()};
    }

    MenuItem[] subMenu;



    public int checkInput() {
        while (true) {
            int userInput = sc.nextInt();
            if (userInput > subMenu.length || userInput < 1) {
                System.out.println("Incorrect input. Try again");
                continue;
            }
            return userInput;
        }
    }


    @Override
    public String getName() {
        return "\n+++ Sub mainMenu +++\n";
    }

    @Override
    public void run() {
        System.out.println(getName());
        for (int i = 0; i < subMenu.length; i++) {
            System.out.printf("%d - %s\n", i+1,subMenu[i].getName());
        }
        System.out.println("Please choose:");
        int userInput = checkInput();
        subMenu[userInput-1].run();
    }



}
