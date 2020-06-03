package section;

import java.util.Scanner;

public class ComputeAndInterpretBMI {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //Prompt the user enter weight in pounds
    System.out.println("Enter weight in pounds: ");
    double weight = input.nextDouble();

    //Prompt the user to enter height in inches
    System.out.println("Enter height inches: ");
    double height = input.nextDouble();

    //Compute BMI
    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;

    double weightInKilograms = weight*KILOGRAMS_PER_POUND;
    double heightInMeters = height*METERS_PER_INCH;

    double bmi = weightInKilograms/(heightInMeters*heightInMeters);

    //Result
    System.out.println("BMI is "+bmi);
    if (bmi<25){
      System.out.println("Noraml");
    }else if (bmi<30){
      System.out.println("overweight");
    }else {
      System.out.println("Obese");
    }
  }

}
