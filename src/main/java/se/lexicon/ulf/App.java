package se.lexicon.ulf;

import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String someText = scanner.nextLine();

        System.out.println("Text enterd was: " + someText);

        double number1 = readDouble();

        System.out.println("number was: " + number1);



        scanner.close();// last thing the program dose
    }//end main

    static double readDouble()
    {
        String textNumber = scanner.nextLine();

        if (textNumber.contains(","))
        {
            textNumber = textNumber.replace(',', '.');
        }

        double number = Double.parseDouble(textNumber);

        return number;
    }

}//end app
