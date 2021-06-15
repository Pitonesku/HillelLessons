package com.company.CatalogHomeTask11;

import java.util.Scanner;

public class Book extends Products {

    public Book (String name, String author, int yearOfPublication, int circulation, int price) {
        super.setType("Book");
        super.setName(name);
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.circulation = circulation;
        super.setPrice(price);
    }

    public  Book (Scanner sc) {
        sc.nextLine();
        System.out.println("Please enter new book details. Press 0 to cancel.");
        System.out.print("Book name: ");

        String userInput = sc.nextLine();

        if (!userInput.equals("0")) {
            super.setType("Book");
            super.setName(userInput);
            System.out.print("Enter the author: ");
            author = sc.nextLine();
            System.out.print("Year of publication: ");
            yearOfPublication = sc.nextInt();
            System.out.print("Number of book circulation: ");
            circulation = sc.nextInt();
            System.out.print("Enter the price: ");
            super.setPrice(sc.nextInt());
        }
    }


    public Scanner sc;
    private String author;
    private int yearOfPublication;
    private int circulation;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getCirculation() {
        return circulation;
    }

    public void showDetails() {
        System.out.printf("Book name:            %s\n", getName());
        System.out.printf("Book author:          %s\n", getAuthor());
        System.out.printf("Year of publication:  %s\n", getYearOfPublication());
        System.out.printf("Book circulation:     %d\n", getCirculation());
        System.out.printf("Book price:           %d uah\n", getPrice());
    }
}

