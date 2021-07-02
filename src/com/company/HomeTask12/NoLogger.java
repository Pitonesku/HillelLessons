package com.company.HomeTask12;

public class NoLogger implements MenuItem{
    @Override
    public String getName() {
        return "No logger for application";
    }

    @Override
    public void run() {
        Application.loggerInUse = null;

    }
}
