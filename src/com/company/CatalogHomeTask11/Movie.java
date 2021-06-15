package com.company.CatalogHomeTask11;

import java.util.Scanner;

public class Movie extends Products {

    public Movie (String name, String producer, int yearOfProduction, String genre, int ageRestriction, int price) {
        super.setType("Movie");
        super.setName(name);
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.genre = genre;
        this.ageRestriction = ageRestriction;
        super.setPrice(price);
    }


    public Movie(Scanner sc) {
        sc.nextLine();
        System.out.println("Please enter new movie details. Press 0 to cancel.");
        System.out.print("Movie name: ");
        String userInput = sc.nextLine();

        if (!userInput.equals("0")) {
            super.setType("Movie");
            super.setName(userInput);
            System.out.print("Enter the producer: ");
            producer = sc.nextLine();
            System.out.print("Year of production: ");
            yearOfProduction = sc.nextInt();
            sc.nextLine();
            System.out.print("Genre: ");
            genre = sc.nextLine();
            System.out.print("Age restriction: ");
            ageRestriction = sc.nextInt();
            System.out.print("Enter the price: ");
            super.setPrice(sc.nextInt());
        }
    }

    public Scanner sc;
    private String producer;
    private int yearOfProduction;
    private int ageRestriction;
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getProducer() {
        return producer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void showDetails() {
        System.out.printf("Movie name:         %s\n", getName());
        System.out.printf("Movie producer:     %s\n", getProducer());
        System.out.printf("Year of production: %s\n", getYearOfProduction());
        System.out.printf("Age restriction:    +%d\n", getAgeRestriction());
        System.out.printf("Movie price:        %d uah\n", getPrice());
    }
}


