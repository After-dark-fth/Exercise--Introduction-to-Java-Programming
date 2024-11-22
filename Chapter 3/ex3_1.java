public class ex3_1 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    double a,b,c,r1,r2;
    a = in.nextDouble();
    b = in.nextDouble();
    c = in.nextDouble();
    in.close();
    r1 = (b*-1 + (Math.pow (Math.pow(b, 2) - (4*a*c),0.5)))/2*a;
    r2 = (b*-1 - (Math.pow (Math.pow(b, 2) - (4*a*c),0.5)))/2*a;

    if((Math.pow(b, 2) - (4*a*c)) < 0){
      System.out.println("Gak ada");
    }
    else if(r1 == r2){
      System.out.println("cuma satu " + r1);
    }
    else if (r1 != r2 && r1%1 ==0 && r2%1==0){
      System.out.println(r1);
      System.out.println(r2);
    }
  }
}
