package basic.test04;

import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        //9 Hexagon Area
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double side = input.nextDouble();
        double area = 3 * Math.sqrt(3)/2 * Math.pow(side,2);
        System.out.println("The Hexagon area is: "+area);

    }
}
