public class ex2_6 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner (System.in);
    System.out.print("masukkan angka antara 0 dan 1000 : ");
    int num = in.nextInt();
    in.close();
    int total = 0;
    while( num > 0){
      total += num%10;
      num/=10;
    }
    System.out.println(total);
  }
}
