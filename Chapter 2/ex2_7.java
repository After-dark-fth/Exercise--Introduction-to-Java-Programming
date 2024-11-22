public class ex2_7 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    long minute = in.nextLong();
    in.close();
    long day = minute/(60*24);
    long years = 0;
    if (day >= 365){
      years = day/365;
      day %= 365;
      System.out.println(years + " years, " + day + " days");
    }
    else 
      System.out.println(day + " days");
  }
}
