package basic;

public class VariableDemo3 {

  public static void main(String[] args) {
    int a = 2;
    int b = 4;

    int sum = a + b;
    System.out.println("sum=" + sum);

    int dis = a - b;
    System.out.println("dis" + dis);

    int mul = a * b;
    System.out.println("mul=" + mul);

    System.out.println("div=" + (a / b));

    System.out.println(5 / 2);
    System.out.println((int) 5.0 / 2);//Varable style change
    System.out.println(5.0 / 2);

    float a1 = 1.0f;
    float a2 = 1.0f;

    System.out.println(a1 + a2);
    System.out.println(a1 - a2);
    System.out.println(a1 * a2);
    System.out.println(a1 / a2);

    //取餘數
    System.out.println(5 % 2);
    System.out.println(5.0 % 2);
  }
}
