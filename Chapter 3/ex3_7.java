public class ex3_7 {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner (System.in);
    System.out.print("enter today's index : ");
    int today = in.nextInt();
    System.out.print("Enter the number of days elapsed since today: ");
    int tambah = in.nextInt();
    in.close();
    System.out.print("Today is ");
    switch (today) {
      case 0:
        System.out.print("Sunday");
        break;
      case 1:
        System.out.print("Monday");
        break;
      case 2:
        System.out.print("Tuesday");
        break;
      case 3:
        System.out.print("Wednesday");
        break;
      case 4:
        System.out.print("Thursday");
        break;
      case 5:
        System.out.print("Friday");
        break;
      case 6:
        System.out.print("Saturday");
        break;
    }
    System.out.print(" and the future day is ");
    today += tambah;
    switch (today%7) {
      case 0:
        System.out.print("Sunday");
        break;
      case 1:
        System.out.print("Monday");
        break;
      case 2:
        System.out.print("Tuesday");
        break;
      case 3:
        System.out.print("Wednesday");
        break;
      case 4:
        System.out.print("Thursday");
        break;
      case 5:
        System.out.print("Friday");
        break;
      case 6:
        System.out.print("Saturday");
        break;
    }
  }
}
