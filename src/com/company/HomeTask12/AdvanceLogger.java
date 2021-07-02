package com.company.HomeTask12;

import java.util.Date;


class AdvanceLogger implements Logger {
    public AdvanceLogger(Date date) {
        this.date = date;
    }

    Date date;

    @Override
    public void info(String msg) {
        System.out.printf("[%s] %td:%tm:%ty %tT", msg, date, date, date, date);
    }

    @Override
    public void info(String msg, Object o) {
        System.out.printf("[%s] %td:%tm:%ty %tT", msg, date, date, date, date);
        System.out.println(o.toString());
    }

    @Override
    public void error(String msg) {
        System.out.printf("ERROR [%s] %td:%tm:%ty %tT", msg, date, date, date, date);
    }

    @Override
    public void error(String msg, Object o) {
        System.out.printf("ERROR [%s] %td:%tm:%ty %tT", msg, date, date, date, date);
        System.out.println(o.toString());
    }
}


