public class ex3_2 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    int nom1 = (int)(System.currentTimeMillis()%100);
    int nom2 = (int)(System.currentTimeMillis()/7%100);
    int nom3 = (int)(System.currentTimeMillis()/13%100);
    System.out.println("What is " + nom1 + " + " + nom2 + " + " + nom3 + " ?");
    System.out.print( "is : ");
    int jawab = in.nextInt(); in.close();
    System.out.println(nom1 +nom2 +nom3 == jawab);
  }
}
