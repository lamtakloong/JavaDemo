package section;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        int num = input.nextInt();
        if (num % 5 == 0) {
            System.out.println("HiFive");
        } else {
            System.out.println("NoHiFive");
        }
        if (num % 2 == 0) {
            System.out.println("HiEven");
        } else {
            System.out.println("NoHiEven");
        }
    }
}
