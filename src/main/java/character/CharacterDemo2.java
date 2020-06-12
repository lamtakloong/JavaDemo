package character;

public class CharacterDemo2 {
    public static void main(String[] args) {
        char ch = (char) 0XAB0041;
        System.out.println(ch);

        char ch1 = (char) 65.25;
        System.out.println(ch1);

        int i = (int) 'A';
        System.out.println(i); //i = 65

        int a = 'A';
        System.out.println(a); //a = 65

        byte b = (byte) '\uFFF4';
        System.out.println(b); //b = -12
        long c = '\uFFF4';
        System.out.println(c); //c = 65524

        int a1 = '2' + '3'; // 50 + 51
        System.out.println(a1);

        int a2 = 2 + 'a'; // a=97
        System.out.println("a2 = " + a2);

        System.out.println("Chapter" + '2'); //str + str

        System.out.println('a' < 'b');
        System.out.println('a' < 'A');

        System.out.println("isDigit('a') is " + Character.isDigit('a'));
        System.out.println("isLetter('a') is "+ Character.isLetter('a'));
        System.out.println("isLowerCase('a') is "+ Character.isLowerCase('a'));
        System.out.println("isUpperCase('a') is "+ Character.isUpperCase('a'));
        System.out.println("toLowerCase('T') is "+ Character.toLowerCase('T'));
        System.out.println("toUpperCase('q') is "+ Character.toUpperCase('q'));
    }
}
