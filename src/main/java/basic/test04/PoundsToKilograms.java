package basic.test04;

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
        //4 Pounds to kilograms
        Scanner inputPound = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");

        double pound=inputPound.nextDouble();
        double kilogram=pound*0.454;
        System.out.println(pound+" pounds is "+kilogram+" kilograms");

    }
}
