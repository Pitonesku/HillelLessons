package com.company.HomeTask12.Task2.Menu.MenuItems.Logger;

import com.company.HomeTask12.Application;
import com.company.HomeTask12.Task2.Menu.MenuItem;

public class SimpleLoggerSelectionMenu implements MenuItem {
    @Override
    public String getName() {
        return "Simple logger";
    }

    @Override
    public void run() {
        Application.setLoggerInUse(Application.getSimpleLogger());




    }
}
