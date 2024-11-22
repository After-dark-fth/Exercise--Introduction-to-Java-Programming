public class ex3_19 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner (System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    in.close();
    if(a+b > c && a+c > b && b + c > a){
      System.out.println(a+b+c);
    }
    else{
      System.out.println("the input is invalid");
    }
  }
}
