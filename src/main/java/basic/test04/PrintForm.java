package basic.test04;

public class PrintForm {
    public static void main(String[] args) {
        //10 Print Form
        System.out.println("a       b      pow(a,b)");
        int a = 1, b = 2;
        for (int i = 1; i < 6; i++) {
            System.out.println(a + "       " + b + "      " + (int)Math.pow(a, b));
            a++;
            b++;
        }
    }
}
