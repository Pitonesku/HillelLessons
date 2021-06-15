package com.company.CatalogHomeTask11;

import java.util.Scanner;

public class Song extends Products {

    public Song (String name, String singer, int yearOfProduction, int bitrate, int price) {
        super.setType("Song");
        super.setName(name);
        this.singer = singer;
        this.yearOfProduction = yearOfProduction;
        this.bitrate = bitrate;
        super.setPrice(price);
    }

    public Song(Scanner sc) {
       // Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.println("Please enter new song details. Press 0 to cancel.");
        System.out.print("Song name: ");
        userInput = sc.nextLine();

        if (!userInput.equals("0")) {
            super.setType("Song");
            super.setName(userInput);
            System.out.print("Enter the singer: ");
            singer = sc.nextLine();
            System.out.print("Year of production: ");
            yearOfProduction = sc.nextInt();
            System.out.print("Bitrate: ");
            bitrate = sc.nextInt();
            System.out.print("Enter the price: ");
            super.setPrice(sc.nextInt());
        }
    }

    public Scanner sc;
    private String singer;
    private int yearOfProduction;
    private int bitrate;

    public String getSinger() {
        return singer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void showDetails() {
        System.out.printf("Song name: %s\n", getName());
        System.out.printf("Song singer: %s\n", getSinger());
        System.out.printf("Year of production: %s\n", getYearOfProduction());
        System.out.printf("Song bitrate: %d\n", getBitrate());
        System.out.printf("Song price: %d\n", getPrice());
    }
}


