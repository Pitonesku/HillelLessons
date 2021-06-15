package com.company.CatalogHomeTask11.Menu;

import com.company.CatalogHomeTask11.*;

import java.util.Scanner;

public class ShowAllCatalog implements MenuItem {

    public ShowAllCatalog(Catalog catalog, Scanner sc) {
        this.sc = sc;
        this.catalog = catalog;
    }

    Scanner sc;
    Catalog catalog;
    SubMenu subMenu;


    @Override
    public String getName() {
        return "Show Catalog";
    }

    @Override
    public void run() {
        catalog.selectedProductsList("ALL");
        catalog.showCatalog(catalog.getCatalogList());
        subMenu = new SubMenu(catalog, sc);
        subMenu.run();


    }

}