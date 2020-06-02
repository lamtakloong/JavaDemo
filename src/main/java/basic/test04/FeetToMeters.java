package basic.test04;

import java.util.Scanner;

public class FeetToMeters {
    public static void main(String[] args) {
        //3 Feet to meters
        Scanner inputFeet=new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double feet = inputFeet.nextDouble();
        double meter = feet*0.305;

        System.out.println(feet+" feet is "+meter+" meters");
    }
}
