package basic.test04;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        //8 Body Mass Index
        Scanner inputW=new Scanner(System.in);
        System.out.println("Please enger the weight in pounds: ");
        double weightKG = inputW.nextDouble()*0.45359237;
        Scanner inputH=new Scanner(System.in);
        System.out.println("Please enger the Height in inches: ");
        double heightM = inputH.nextDouble()*0.0254;
        double BMI = weightKG/heightM;
        System.out.println("The BMI is "+ BMI);

    }
}
