package com.company.CatalogHomeTask11.Menu;

import com.company.CatalogHomeTask11.Run;

public class Exit implements MenuItem {
    @Override
    public String getName() {
        return "Exit";
    }

    @Override
    public void run() {
    Run.doIt = false;
    }
}
