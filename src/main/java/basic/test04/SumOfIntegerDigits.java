package basic.test04;

import java.util.Scanner;

public class SumOfIntegerDigits {
    public static void main(String[] args) {
        //6 Sum of integer digits
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int a = input.nextInt();
        int x = a/100;
        int y = a%100/10;
        int z = a%10;
        int b = x+y+z;
        System.out.println("The sum of the digits"+x+", "+y+", "+z+" is "+b);

    }
}
