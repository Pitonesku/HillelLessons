package com.company.CatalogHomeTask11.Menu;

import com.company.CatalogHomeTask11.*;

import java.util.Scanner;

public class ShowSelectedProducts implements MenuItem {

    public ShowSelectedProducts(Catalog catalog, Scanner sc) {
        this.catalog = catalog;
        this.sc = sc;
    }

    Scanner sc;
    SubMenu submenu;
    Catalog catalog;



    @Override
    public String getName() {
        return "Show Selected Products";
    }


    public int checkInput() {
        while (true) {
            int userInput = sc.nextInt();
            if (userInput > catalog.getTypesList().length || userInput < 1) {
                System.out.println("Incorrect input. Try again");
                continue;
            }
            return userInput;
        }
    }

    @Override
    public void run() {
        System.out.println("What type of products would you like to see?");
        catalog.showTypesList();
        int userInput = checkInput();
        String type = catalog.getTypesList()[userInput-1];
        catalog.selectedProductsList(type);
        catalog.showCatalog(catalog.getSelectedProductsList());
        submenu = new SubMenu(sc);
        submenu.run();
    }
}

