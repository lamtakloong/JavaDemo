package section;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();
        if (radius<0){
            System.out.println("Enter wrong number, please retype again!");
        }else {
        double area = radius * radius * 3.14159;
        System.out.println("The area of circle of radius "+radius+" is "+area);
        }
    }
}
