package basic.test04;

import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        //7 Acceleration
        Scanner inputV0 = new Scanner(System.in);
        System.out.println("Enger v0: ");
        double v0 = inputV0.nextDouble();
        Scanner inputV1 = new Scanner(System.in);
        System.out.println("Enger v0: ");
        double v1 = inputV1.nextDouble();
        Scanner inputT = new Scanner(System.in);
        System.out.println("Enger v0: ");
        double t = inputT.nextDouble();

        double acceleration = (v1-v0)/t;

        System.out.println("The average acceleration is "+acceleration);
    }
}
