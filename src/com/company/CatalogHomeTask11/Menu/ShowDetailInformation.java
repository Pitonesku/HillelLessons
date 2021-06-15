package com.company.CatalogHomeTask11.Menu;

import com.company.CatalogHomeTask11.Catalog;

import java.util.Scanner;

public class ShowDetailInformation implements MenuItem {

    Catalog catalog;
    Scanner sc;


    public int checkInput() {
        while (true) {
            int userInput = sc.nextInt();
            if (userInput > catalog.getCatalogList().length || userInput < 1) {
                System.out.println("Incorrect input. Try again");
                continue;

            }
            return userInput;
        }
    }


    @Override
    public String getName() {
        return "Detail information";
    }

    @Override
    public void run() {
        System.out.println("To see more details please choose the item: ");
        catalog.showCatalog(catalog.getCatalogList());
        int userInput = checkInput();
        catalog.getCatalogList()[userInput - 1].showDetails();
    }
}
