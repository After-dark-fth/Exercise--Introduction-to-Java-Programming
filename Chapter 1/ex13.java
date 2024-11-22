public class ex13 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    double a, b, c, d, e, f;
    System.out.println("untuk ax + by = e, masukkan a b e");
    a = in.nextDouble();
    b = in.nextDouble();
    e = in.nextDouble();
    System.out.println("untuk cx + dy = f, masukkan c d f");
    c = in.nextDouble();
    d = in.nextDouble();
    f = in.nextDouble();
    in.close();
    System.out.println("x = " + (e*d - f*b)/(a*d - c*b));
    System.out.println("y = " + (f*a - e*c)/(d*a - b*c));
  }

}
