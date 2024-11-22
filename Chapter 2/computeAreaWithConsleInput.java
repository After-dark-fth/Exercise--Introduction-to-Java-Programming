import java.util.Scanner;
public class computeAreaWithConsleInput {

  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter a number for radius : ");
    double radius = in.nextDouble();
    in.close();
    double area;
    area = radius * radius * 3.14159;
    System.out.println("the area for the circle of radius " + radius + " is " + area);
  }
}