package basic;

public class NumericalConvertDemo {

  public static void main(String[] args) {
    System.out.println(3*4.0);

    float f1 = 1000L;// data type convert long auto
    long l1 = (long) 1000F; // data type convert long manually

    System.out.println((int)1.7);

    System.out.println((double)1/2);

    double d = 4.5;
    int i = (int) d;

    System.out.println("d=" + d);
    System.out.println("i=" + i);

    int i1 = 1;
    byte b = (byte) i1;

    byte b1 = 12;

    int x = (int)(5/2.0);



  }
}
