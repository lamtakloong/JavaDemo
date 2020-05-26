package basic;

import java.util.Scanner;

public class CommonErrorsAndPitfalls {

  public static void main(String[] args) {

    // 1 Undeclared/Uninitialized Variable and Unused Variables
    double inte = 0.05;

    // 2 Integer Overflow
    int maxValue= 2147483647 +1;
    int minValue= -2147483648 -1;

    System.out.println(maxValue);
    System.out.println(minValue);

    // 3 Round-off Errors
    System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);

    // 4 Unintended integer Division
    int number1 = 1;
    int number2 = 2;
    double averageA = (number1+number2)/2;
    System.out.println(averageA);

    double averageB = (number1+number2)/2.0;
    System.out.println(averageB);

    // 5 Redundant Input Objects
    Scanner input = new Scanner(System.in);//###
    System.out.println("Enter an integer: ");
    int v1= input.nextInt();

    Scanner input1 = new Scanner(System.in);//###
    System.out.println("Enter an double value: ");
    double v2 = input1.nextDouble();


  }

}
