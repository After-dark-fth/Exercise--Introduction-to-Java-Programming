public class ex2_5 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    System.out.print("Masukkan biaya dan bunga : ");
    double biaya = in.nextDouble();
    double persen= in.nextDouble();
    in.close();
    persen = persen/100.0*biaya;
    biaya += persen;
    System.out.println("the gratuity is $" + persen + " and total is $" + biaya);
    
  }
}
