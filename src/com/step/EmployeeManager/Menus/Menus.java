package com.step.EmployeeManager.Menus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menus {

    Scanner in = new Scanner(System.in);

    public String mainMenu()throws InputMismatchException {
        boolean selectInTheMenu = true;
        String returnValue = null;

        while (selectInTheMenu){
            int menuNumber;

            System.out.println("\t MENU \t");
            System.out.println(" 1. Employ. ");
            System.out.println(" 2. Dismissal. ");
            System.out.println(" 3. Exit. ");
            System.out.print(" Enter the desired option: ");

            selectInTheMenu = false;
            menuNumber = in.nextInt();

            if (menuNumber == 1){
                System.out.println(" you choose Employ.");
                returnValue = "Employ";
            }else if(menuNumber == 2) {
                System.out.println(" you choose Dismissal.");
                returnValue = "Dismissal";
            }else if(menuNumber == 3){
                System.out.println(" Good by ");
                returnValue = "Exit";
            }else{
                System.out.println(" Please, select a number in the list.");
                selectInTheMenu = true;
            }
        }
        return returnValue;
    }


    public void dismissalMenu(){

    }
}
