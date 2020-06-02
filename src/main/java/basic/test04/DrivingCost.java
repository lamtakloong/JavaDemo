package basic.test04;

import java.util.Scanner;

public class DrivingCost {
    public static void main(String[] args) {
        //13 Driving Cost
//        Enter the driving distance: 900.5
//        Enter miles per gallon: 25.5
//        Enter price per gallon: 3.55
//        The cost of driving is $125.36
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        Double a = input.nextDouble();
        System.out.println("Enter miles per gallon: ");
        Double b = input.nextDouble();
        System.out.println("Enter price per gallon: ");
        Double c = input.nextDouble();
        float d = (float) (a/b*c);
        System.out.println("The cost of driving is $"+d);
    }
}
