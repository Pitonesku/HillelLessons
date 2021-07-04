package com.company.HomeTask12.Task2.Loggers;

import java.util.Date;


public class SimpleLogger implements Logger {

    public SimpleLogger(Date date) {

        this.date = date;
    }

    Date date;

    @Override
    public void info(String msg) {
        System.out.printf("[%s]", msg);
    }

    @Override
    public void info(String msg, Object o) {
        System.out.printf("[%s]", msg);
        System.out.println(o.toString());
    }

    @Override
    public void error(String msg) {
        System.out.printf("ERROR [%s]", msg);

    }

    @Override
    public void error(String msg, Object o) {
        System.out.printf("ERROR [%s]", msg);
        System.out.println(o.toString());
    }
}


