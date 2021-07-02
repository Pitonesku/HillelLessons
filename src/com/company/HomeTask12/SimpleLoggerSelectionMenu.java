package com.company.HomeTask12;

public class SimpleLoggerSelectionMenu implements MenuItem{
    @Override
    public String getName() {
        return "Simple logger";
    }

    @Override
    public void run() {
        Application.loggerInUse = Application.simpleLogger;
        return;


    }
}
