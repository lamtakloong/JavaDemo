package basic.error;

public class RepeatCode {

  public static void main(String[] args) {
    boolean inSate = true;
    int tuition;
//    example
    if (inSate) {
      tuition = 5000;
      System.out.println("The tuition is " + tuition);
    } else {
      tuition = 15000;
      System.out.println("The tuition is " + tuition);
    }
//    simple the example code
    if (inSate) {
      tuition = 5000;
    } else {
      tuition = 15000;
    }
    System.out.println("The tuition is " + tuition);
  }

}
