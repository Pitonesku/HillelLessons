package com.company.CatalogHomeTask11;

import java.util.Arrays;

public class Catalog extends Products {

    public String[] getTypesList() {
        return typesList;
    }

    private String[] typesList = {"Book", "Song", "Movie"};


    public Products[] getCatalogList() {
        return catalogList;
    }

    Products[] catalogList = {
            new Book("White fang", "Jack London", 1906, 232123, 123),
            new Song("Wind of change", "Scorpions", 1990, 128, 444),
            new Movie("Alien", "R. Scott", 1979, "Horor", 18, 232),
            new Book("1984", "G. Orwell", 1949, 32323, 323),
            new Book("Old man and the Sea", "E. Hemingway", 1951, 12112, 1212),
            new Song("Money", "Abba", 1976, 128, 490)
    };

    private Products[] selectedProductsList = new Products[0];

    public Products[] getSelectedProductsList() {
        return selectedProductsList;
    }


    public void addToCatalog(Products item) {
        catalogList = Arrays.copyOf(catalogList, catalogList.length + 1);
        catalogList[catalogList.length - 1] = item;
    }

    public void removeFromCatalog(Products[] catalog, int index) {
        Products[] newCatalog = new Products[catalog.length - 1];
        int j = 0;
        for (int i = 0; i < catalog.length; i++) {
            if (i != index) {
                newCatalog[j] = catalog[i];
                j++;
            }
        }
        catalogList = newCatalog;
    }

    public void showTypesList() {
        for (int i = 0; i < typesList.length; i++) {
            System.out.printf("%d. %s\n", i + 1, typesList[i]);
        }
    }

    public void showCatalog(Products[] catalogList) {
        if (catalogList.length == 0) {
            System.out.println("Catalog is empty");
            return;
        }
        for (int i = 0; i < catalogList.length; i++) {
            Products item = catalogList[i];
            System.out.printf("%3d - %3s     %25s      %4d uah\n", i + 1, item.getType(),
                    item.getName(), item.getPrice());
        }
    }

    public void selectedProductsList(String type) {
        if (type.equals("ALL")) {
            selectedProductsList = catalogList;
        } else {
            selectedProductsList = new Products[0];
            for (Products product :
                    catalogList) {
                if (type.equals(product.getType())) {
                    selectedProductsList = Arrays.copyOf(selectedProductsList, selectedProductsList.length + 1);
                    selectedProductsList[selectedProductsList.length - 1] = product;
                }
            }
        }
    }

    @Override
    public void showDetails() {

    }
}
