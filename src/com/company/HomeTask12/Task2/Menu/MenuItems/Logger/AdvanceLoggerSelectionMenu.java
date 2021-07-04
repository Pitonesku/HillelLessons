package com.company.HomeTask12.Task2.Menu.MenuItems.Logger;

import com.company.HomeTask12.Application;
import com.company.HomeTask12.Task2.Menu.MenuItem;


public class AdvanceLoggerSelectionMenu implements MenuItem {
    @Override
    public String getName() {
        return "Advance logger";
    }

    @Override
    public void run() {
        Application.setLoggerInUse(Application.getAdvanceLogger());
    }
}
