public class ex12 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in); 
    double mile, hour, min, sec;
    mile = in.nextDouble();
    hour = in.nextDouble();
    min  = in.nextDouble();
    sec  = in.nextDouble();
    in.close();
    
    double kilo = mile*1.6;
    hour *= 3600;
    min  *= 60;
    sec  += hour + min;
    double velo = kilo/sec*3600;
    System.out.printf("%.2fkm/h",velo); 
  }  
}
