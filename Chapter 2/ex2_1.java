public class ex2_1 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    System.out.print("Enter a degree in celsius: ");
    int celsius = in.nextInt();
    in.close();
    double fahren  = (9.0/5)*celsius + 32;
    System.out.println(celsius + " Celsius is " + fahren + " Fahrenheit");
  }
}
