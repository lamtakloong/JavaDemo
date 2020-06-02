package basic.test04;

import java.util.Scanner;

public class CalculateTip {
    public static void main(String[] args) {
        //5 Calculate tip
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal: ");
        double subtotal = input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a gratuity rate: ");
        double gratuityRate = input2.nextDouble();

        System.out.println("The gratuity is $"+gratuityRate/10+" and total is $"+(subtotal+gratuityRate/10));

    }
}
