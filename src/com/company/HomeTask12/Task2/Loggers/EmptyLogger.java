package com.company.HomeTask12.Task2.Loggers;

import java.util.Date;


public class EmptyLogger implements Logger {
    public EmptyLogger(Date date) {
        this.date = date;
    }

    Date date;

    @Override
    public void info(String msg) {


    }

    @Override
    public void info(String msg, Object o) {

    }

    @Override
    public void error(String msg) {

    }

    @Override
    public void error(String msg, Object o) {

    }
}


