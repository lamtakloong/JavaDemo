package basic.error;

public class IfError {

  public static void main(String[] args) {

//  01 Forget the bracket
    double radius = 100;
    if (radius >= 0) {
      double area = radius * radius * (double) (Math.PI);
      System.out.println("The area " + " is " + area);
    }

//    if (radius >= 0)
//      double area = radius * radius * (double) (Math.PI);
//      System.out.println("The area " + " is " + area);

//  02 Add the semicolon
//    if (radius >= 0);
//    {
//      double area = radius * radius * (double) (Math.PI);
//      System.out.println("The area " + " is " + area);
//  }

//  03 Redundancy testing for Boolean values
    Boolean even = true;
    if (even) {
      System.out.println("It is even.");
    }
//    if (even == true) {
//      System.out.println("It is even.");
//    }

//  04 Else
    int i = 1, j = 2, k = 3;
    if (i > j) {
      if (i > k) {
        System.out.println("A");
      } else {
        System.out.println("B");
      }
    }
//    int i = 1, j = 2, k = 3;
//    if (i > j) {
//      if (i > k) {
//        System.out.println("A");
//  } else {
//        System.out.println("B");
//      }
//    }

    double x = 1.0-0.1-0.1-0.1-0.1-0.1;
    System.out.println(x);
    System.out.println(x==0.5);

    //epsilon

    final double EPSILON=1E-14; //10 x -(14) pow
    if (Math.abs(x-0.5)<EPSILON);
    System.out.println("true");
  }

}

