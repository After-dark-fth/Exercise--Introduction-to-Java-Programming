public class ex2_3 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner (System.in);
    System.out.print("Masukkan panjang dalam kaki : ");
    double kaki = in.nextDouble();
    in.close();
    double meter = kaki*0.305;
    System.out.println(meter);
  }
}
