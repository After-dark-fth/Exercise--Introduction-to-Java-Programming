public class ex3_9 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    int baris = in.nextInt();
    in.close();
    int num = baris;
    int cek = (num % 10)*9;
    num /= 10;
    cek += (num % 10)*8;
    num /= 10;
    cek += (num % 10)*7;
    num /= 10;
    cek += (num % 10)*6;
    num /= 10;
    cek += (num % 10)*5;
    num /= 10;
    cek += (num % 10)*4;
    num /= 10;
    cek += (num % 10)*3;
    num /= 10;
    cek += (num % 10)*2;
    num /= 10;
    cek += num;
    System.out.print("the 10 dig num of isbn is : ");
    System.out.print(baris);
    if (cek % 11 == 10){
      System.out.print("X");
    }
    else
      System.out.println(cek % 11);
  }
}
