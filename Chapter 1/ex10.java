public class ex10 {
  public static void main(String[] args) {
    double kilo = 14;
    double menit = 45;
    double detik = 30;
    double mile = kilo/1.6;
    menit += detik/60;
    double jam = menit/60;
    double kecepatan = mile / jam;
    System.out.printf("kecepatan : %.2f Miles/h",kecepatan);
  }
}
