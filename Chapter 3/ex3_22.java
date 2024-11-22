public class ex3_22 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    int x1 = in.nextInt();
    int y1 = in.nextInt();
    int x2 = in.nextInt();
    int y2 = in.nextInt();
    in.close();
    int jauh = (int)Math.pow((int)Math.pow(x2-x1,2)+(int)Math.pow(y2-y1,2), 0.5);
    if(jauh < 10){
      System.out.println("di dalam");
    }
    else if (jauh == 10){
      System.out.println("di garis");
    }
    else
      System.out.println("di luar");
  }
}
