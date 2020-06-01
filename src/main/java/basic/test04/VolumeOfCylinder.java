package basic.test04;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        //2 Volume of cylinder
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a area in circe: ");
        double raduis = input2.nextDouble();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter a area in height: ");
        double height = input3.nextDouble();

        double area = raduis*raduis *Math.PI;
        double volume = area*height;
        System.out.println("Area: "+area);
        System.out.println("Volume: "+volume);
    }
}
