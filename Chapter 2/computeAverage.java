import java.util.Scanner;

public class computeAverage {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Enter  three Numbers: ");
    double num1 = in.nextDouble();
    double num2 = in.nextDouble();
    double num3 = in.nextDouble();
    in.close();
    double average = (num1 + num2 + num3) / 3;

    System.out.println("the average of " + num1 + " " + num2 + " " + num3 + " is " + average);
  }
}
