package com.company.HomeTask12;

import java.util.Date;

interface Logger {
    void info(String msg);

    void info(String msg, Object o);

    void error(String msg);

    void error(String msg, Object o);
}
/*
public class Logger {

    public static void main(String[] args) {

        Date date = new Date();

        Log simpleLogger = new Log() {
            @Override
            public void info(String msg) {
                System.out.println(msg);
            }

            @Override
            public void info(String msg, Object o) {
                System.out.println(msg);
                System.out.println(o.toString());

            }

            @Override
            public void error(String msg) {
                System.out.println(msg);

            }

            @Override
            public void error(String msg, Object o) {
                System.out.println(msg);
                System.out.println(o.toString());

            }
        };

        Log advanceLogger = new Log() {
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
        };
        advanceLogger.info("llalal");
    }
}

 */