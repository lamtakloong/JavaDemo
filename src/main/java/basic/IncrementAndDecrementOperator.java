package basic;

public class IncrementAndDecrementOperator {

  public static void main(String[] args) {
    int i = 10, j=10;
    int newNum = 10 * i++;
    System.out.println("newNum:"+ newNum);
    System.out.println("i:"+i);
    int newNum1 = 10 * ++j;
    System.out.println("numNum1:"+newNum1);
    System.out.println("j:"+j);

    double x=1.0;
    double y=5.0;
    double z=x-- +(++y); //x=0.0,y=6.0,z=7.0
    System.out.println("x="+x);
    System.out.println("y="+y);
    System.out.println("z="+z);

  }

}
