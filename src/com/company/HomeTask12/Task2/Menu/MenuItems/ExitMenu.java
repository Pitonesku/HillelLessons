package com.company.HomeTask12.Task2.Menu.MenuItems;


import com.company.HomeTask12.Task2.Menu.MenuItem;



public class ExitMenu implements MenuItem {

    @Override
    public String getName() {
        return "Exit";

    }

    @Override
    public void run() {
        System.out.println("Bye-Bye");

    }
}
