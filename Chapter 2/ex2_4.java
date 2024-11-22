public class ex2_4 {
 public static void main(String[] args) {
  java.util.Scanner in = new java.util.Scanner(System.in);
  System.out.print("masukkan pound yang ingin di konversikan : ");
  double pound = in.nextDouble();
  in.close();
  double kilo = pound*0.454;
  System.out.println("jadi : "+kilo);
 } 
}
