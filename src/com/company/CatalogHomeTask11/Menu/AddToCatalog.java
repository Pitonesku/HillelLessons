package com.company.CatalogHomeTask11.Menu;

import com.company.CatalogHomeTask11.Book;
import com.company.CatalogHomeTask11.Catalog;
import com.company.CatalogHomeTask11.Movie;
import com.company.CatalogHomeTask11.Song;

import java.util.Scanner;

public class AddToCatalog implements MenuItem {


    public AddToCatalog(Catalog catalog, Scanner sc) {
        this.catalog = catalog;
        this.sc = sc;
    }

    Catalog catalog;
    Scanner sc;


    @Override
    public String getName() {
        return "Add to Catalog";
    }

    @Override
    public void run() {
        System.out.printf("What do you want to add \n");
        catalog.showTypesList();
        int userInput = sc.nextInt();
        switch (userInput) {
            case (1):
                catalog.addToCatalog(new Book(sc));
                return;
            case (2):
                catalog.addToCatalog(new Song(sc));
                return;
            case (3):
                catalog.addToCatalog(new Movie(sc));
                return;
        }
    }
}
