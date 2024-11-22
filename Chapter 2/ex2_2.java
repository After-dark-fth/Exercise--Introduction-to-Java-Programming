public class ex2_2 {

  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    System.out.print("masukkan jari dan panjang tabung :");
    double rad = in.nextDouble();
    double len = in.nextDouble();
    in.close();
    double area = rad * rad * 3.14159;
    double vol = area*len;
    System.out.printf("the area   : %4.f",area);
    System.out.printf("the volume : %1.f",vol);

  }
}