package basic.test04;

import java.util.Scanner;

public class TriangleArea {
    //11 Triangle Area
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter there points for a triange: ");
        double a1 = input.nextDouble();
        double a2 = input.nextDouble();
        double b1 = input.nextDouble();
        double b2 = input.nextDouble();
        double c1 = input.nextDouble();
        double c2 = input.nextDouble();

        double a = Math.sqrt(Math.pow(a1-b1,2) + Math.pow(a2-b2,2));
        double b = Math.sqrt(Math.pow(b1-c1,2) + Math.pow(b2-c2,2));
        double c = Math.sqrt(Math.pow(c1-a1,2) + Math.pow(c2-a2,2));
        //Triangle half circumference
        double s = (a+b+c)/2;
        double triArea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of triage: "+ triArea);
        // output 0.0000000000
    }
}
