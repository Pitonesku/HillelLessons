package com.company.CatalogHomeTask11;

import java.util.Scanner;



public class Main {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
       Catalog catalog = new Catalog();
        catalog.showTypesList();
        MainMenu mainMenu = new MainMenu(sc, catalog);
        mainMenu.run();



      // Book book = new Book();

    }
}

