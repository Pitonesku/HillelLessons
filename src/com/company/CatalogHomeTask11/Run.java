package com.company.CatalogHomeTask11;

import com.company.CatalogHomeTask11.Menu.MainMenu;
import com.company.CatalogHomeTask11.Menu.ShowDetailInformation;

import java.util.Scanner;


public class Run {
    static public boolean doIt = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Catalog catalog = new Catalog();
        MainMenu mainMenu = new MainMenu(sc, catalog);


        while (doIt) {
            mainMenu.run();
        }
    }
}

