package basic;

public class ShowCurrentTime {

  public static void main(String[] args) {
    long totalMilliseconds = System.currentTimeMillis();
    long totalSeconds = totalMilliseconds/1000;
    long totalMinutes = totalSeconds/60;

    long currentMinute = totalMinutes % 60;

    System.out.println(("tolalMilliseconds: "+ totalMilliseconds));
    System.out.println(("tolalseconds: "+ totalSeconds));
    System.out.println(("tolalMinutes: "+ totalMinutes));
    System.out.println(("currentMinute: "+ currentMinute));
  }

}
