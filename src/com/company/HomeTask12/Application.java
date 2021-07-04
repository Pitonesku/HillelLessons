package com.company.HomeTask12;

import com.company.HomeTask12.Task2.Loggers.EmptyLogger;
import com.company.HomeTask12.Task2.Menu.*;
import com.company.HomeTask12.Task2.Menu.MenuItems.*;
import com.company.HomeTask12.Task2.Menu.MenuItems.Circle.CircleLength;
import com.company.HomeTask12.Task2.Menu.MenuItems.Circle.CircleSquare;
import com.company.HomeTask12.Task2.Menu.MenuItems.Logger.AdvanceLoggerSelectionMenu;
import com.company.HomeTask12.Task2.Menu.MenuItems.Logger.NoLogger;
import com.company.HomeTask12.Task2.Menu.MenuItems.Logger.SimpleLoggerSelectionMenu;
import com.company.HomeTask12.Task2.Menu.MenuItems.Rectangle.RectanglePerimeter;
import com.company.HomeTask12.Task2.Menu.MenuItems.Rectangle.RectangleSquare;
import com.company.HomeTask12.Task2.Loggers.AdvanceLogger;
import com.company.HomeTask12.Task2.Loggers.Logger;
import com.company.HomeTask12.Task2.Loggers.SimpleLogger;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {

    static Logger loggerInUse;

    public static Logger getAdvanceLogger() {
        return advanceLogger;
    }

    public static Logger getSimpleLogger() {
        return simpleLogger;
    }

    static Logger advanceLogger;
    static Logger simpleLogger;


    public static void setLoggerInUse(Logger logger){
        loggerInUse = logger;
    }


    public static void main(String[] args) {

        Date date = new Date();
        Scanner sc = new Scanner(System.in);

        //Creating exitMenu;
        MenuItem exitMenu = new ExitMenu();

        simpleLogger = new SimpleLogger(date);
        advanceLogger = new AdvanceLogger(date);
        loggerInUse = new EmptyLogger(date);


        //Creating logger selection menu.
       List<MenuItem> loggers = new ArrayList<>();
       loggers.add(new AdvanceLoggerSelectionMenu());
       loggers.add(new SimpleLoggerSelectionMenu());
       loggers.add(new NoLogger());
      // loggers.add(exitMenu);
       ShowOneTimeMenu loggerSelection = new ShowOneTimeMenu(loggers, "Logger selection menu", sc, loggerInUse);
       loggerSelection.run();


        //Creating menu for circle;
        List<MenuItem> circle = new ArrayList<MenuItem>();
        circle.add(new CircleSquare(sc));
        circle.add(new CircleLength(sc));
        circle.add(exitMenu);
        Menu circleMenu = new Menu(circle, "Circle calculation", sc, loggerInUse);

        //Creating menu for rectangle;
        List<MenuItem> rectangle = new ArrayList<>();
        rectangle.add(new RectangleSquare(sc));
        rectangle.add(new RectanglePerimeter(sc));
        rectangle.add(exitMenu);
        Menu rectangleMenu = new Menu(rectangle, "Rectangle calculation", sc, loggerInUse);


        // Creating main menu
        List<MenuItem> mainMenuList = new ArrayList<>();
        mainMenuList.add(circleMenu);
        mainMenuList.add(rectangleMenu);
        mainMenuList.add(exitMenu);
        Menu mainMenu = new Menu(mainMenuList, "Main menu", sc, loggerInUse);


        mainMenu.run();

    }
}
