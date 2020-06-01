package basic.test04;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        //1 Celsius to Fahrenheit
        double fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        fahrenheit = (9.0/5.0) *celsius+32;
        System.out.println(celsius+" Celsius is "+ fahrenheit+" Fahrenheit");
    }
}
