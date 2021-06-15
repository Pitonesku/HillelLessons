package com.company.CatalogHomeTask11;

import java.util.Scanner;

public class AddToCatalog implements MenuItem {
    Catalog catalog;
    Scanner sc;
    public AddToCatalog (Scanner sc, Catalog catalog) {
        this.sc = sc;
        this.catalog = catalog;
    }



    @Override
    public String getName() {
        return "Add to Catalog";
    }

    @Override
    public void run() {
        System.out.printf("What do you want to add \n");
        catalog.showTypesList();
        int userInput = sc.nextInt();

    }
}
