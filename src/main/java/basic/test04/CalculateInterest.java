package basic.test04;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        //12 Calculate interest
        //Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
        //The interest is 2.91667
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate(e.g., 3 for 3%): ");
        double b = input.nextDouble();// balance
        double r = input.nextDouble();//rate
        float i = (float) (b*(r/1200));//interest
        System.out.println("The interest is "+i);
    }
}
