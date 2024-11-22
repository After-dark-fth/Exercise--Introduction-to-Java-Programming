public class ex2_8 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    System.out.println("Enter the time offset: ");
    int zone = in.nextInt();
    in.close();
    long totalMilliSecond = System.currentTimeMillis();
    long totalSecond = totalMilliSecond / 1000;
    long currentSecond = totalSecond % 60;
    long totalMinute = totalSecond / 60;
    long currentMinute = totalMinute % 60;
    long totalHour = totalMinute / 60;
    long currentHour = totalHour % 24;
    System.out.println("Current time is " + (currentHour + zone) + ":" + currentMinute + ":" + currentSecond + " GMT");
  }
}
