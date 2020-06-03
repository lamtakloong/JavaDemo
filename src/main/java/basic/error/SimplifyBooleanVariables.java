package basic.error;

import java.util.Scanner;

public class SimplifyBooleanVariables {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a vale: ");
    int number = input.nextInt();
    boolean even;

    // 4 line code
    if (number % 2 == 0) {
      even = true;
    } else {
      even = false;
    }
    System.out.println(even);

    // 2 line code
    boolean even2 = number % 2 == 0;
    System.out.println(even2);
  }
}