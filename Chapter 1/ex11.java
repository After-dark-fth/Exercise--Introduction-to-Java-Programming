public class ex11 {
  public static void main(String[] args) {
    long population = 312032486;
    double birth = 365.0*24*3600/7;
    double death = 365.0*24*3600/13;
    birth-=death;
    double newMember = 365.0*24*3600/45;
    population += (int)(birth + newMember);
    System.out.println(population);
  }
}
