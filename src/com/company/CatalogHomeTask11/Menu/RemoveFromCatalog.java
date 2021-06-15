package com.company.CatalogHomeTask11.Menu;

import com.company.CatalogHomeTask11.Catalog;

import java.util.Scanner;

public class RemoveFromCatalog implements MenuItem{

    public RemoveFromCatalog(Catalog catalog, Scanner sc) {
        this.catalog = catalog;
        this.sc = sc;
       }

    Scanner sc;
    Catalog catalog;

    public int checkInput() {
        while(true) {
            int userInput = sc.nextInt();
            if(userInput > catalog.getCatalogList().length || userInput < 1) {
                System.out.println("Incorrect input, try again");
                continue;
            }
            return userInput;
        }
    }

    @Override
    public String getName() {
        return "Remove from catalog";
    }

    @Override
    public void run() {
        System.out.println("What product do you want to delete:");
        catalog.showCatalog(catalog.getCatalogList());
        int userInput = checkInput();
        catalog.removeFromCatalog(catalog.getCatalogList(), userInput-1);
    }
}
