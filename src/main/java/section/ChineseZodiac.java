package section;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year =input.nextInt();
        String result = "";

        switch (year%12){
            case 0: result="monkey";break;
            case 1: result="rooster";break;
            case 2: result="dog";break;
            case 3: result="pig";break;
            case 4: result="rat";break;
            case 5: result="ox";break;
            case 6: result="tiger";break;
            case 7: result="rabbit";break;
            case 8: result="dragon";break;
            case 9: result="snake";break;
            case 10: result="horse";break;
            case 11: result="sheep";break;
        }
        System.out.println((String) result);
    }
}
