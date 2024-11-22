public class ex3_4 {
  public static void main(String[] args) {
    int random = (int)(Math.random()*12.1);
    String mon = "";
    while (random == 0){
      random = (int)(Math.random()*12);
    }
    switch (random) {
      case 1:
        mon = "januari";
        break;
      case 2:
        mon = "feb";
        break;
        case 3:
        mon = "feb";
        break;
        case 4:
        mon = "feb";
        break;
        case 5:
        mon = "feb";
        break;
        case 6:
        mon = "feb";
        break;
        case 7:
        mon = "feb";
        break;
        case 8:
        mon = "feb";
        break;
        case 9:
        mon = "feb";
        break;
        case 10:
        mon = "feb";
        break;
        case 11:
        mon = "feb";
        break;
        case 12:
        mon = "feb";
        break;
    }
    System.out.println("month " + random + " is " + mon);
  } 
}
