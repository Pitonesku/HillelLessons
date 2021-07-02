package com.company.HomeTask12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {

    static Logger loggerInUse;
    static  Logger advanceLogger;
    static Logger simpleLogger;



    public static void main(String[] args) {

        Date date = new Date();
        advanceLogger = new AdvanceLogger(date);
        simpleLogger = new SimpleLogger(date);





        Scanner sc = new Scanner(System.in);
        //Creating exitMenu;
        MenuItem exitMenu = new ExitMenu();


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

        //Creating logger selection menu.

        List<MenuItem> loggers = new ArrayList<>();
        loggers.add(new AdvanceLoggerSelectionMenu());
        loggers.add(new SimpleLoggerSelectionMenu());
        loggers.add(new NoLogger());
        loggers.add(exitMenu);
        Menu loggerSelection = new Menu(loggers, "Logger selection menu", sc, loggerInUse);

        // Creating main menu
        List<MenuItem> mainMenuList = new ArrayList<>();
        mainMenuList.add(circleMenu);
        mainMenuList.add(rectangleMenu);
        mainMenuList.add(exitMenu);
        Menu mainMenu = new Menu(mainMenuList, "Main menu", sc, loggerInUse);


        loggerSelection.run();
        mainMenu.run();


    }
}
