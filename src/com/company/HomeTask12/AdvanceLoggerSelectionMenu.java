package com.company.HomeTask12;

public class AdvanceLoggerSelectionMenu implements MenuItem{
    @Override
    public String getName() {
        return "Advance logger";
    }

    @Override
    public void run() {
        Application.loggerInUse = Application.advanceLogger;
        return;

    }
}
