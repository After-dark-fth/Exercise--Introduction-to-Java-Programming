import java.util.Scanner;
public class computeAreaWithConstant {
  public static void main(String[] args) {
    final double PI = 3.14159;
    Scanner in = new Scanner (System.in);
    System.out.println("Enter a number of radius");
    double radius = in.nextDouble();
    in.close();
    double area = radius * radius * PI;

    System.out.println("The area for the circle of radius " + radius + " is " + area);
  }
}
