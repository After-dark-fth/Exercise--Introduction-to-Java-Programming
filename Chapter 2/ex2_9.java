public class ex2_9 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    double v0, v1, t;
    v0 = in.nextDouble();
    v1 = in.nextDouble();
    t = in.nextDouble();
    in.close();
    double a = (v1-v0)/t;
    System.out.printf("average acceleration is : %.4f", a);
  }
}
