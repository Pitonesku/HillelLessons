package com.company.HomeTask12.Task2.Loggers;

import java.util.Date;

public interface Logger {
    void info(String msg);

    void info(String msg, Object o);

    void error(String msg);

    void error(String msg, Object o);
}
