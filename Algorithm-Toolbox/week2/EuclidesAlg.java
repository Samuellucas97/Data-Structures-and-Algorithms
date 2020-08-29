import java.util.Scanner;

class EuclidesAlg {
  public static Integer euclidesAlgorithm(Integer a, Integer b) {
    if (b == 0)
      return a;

    return euclidesAlgorithm(b, a%b);
  }
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    Integer a = inputUser.nextInt();
    Integer b = inputUser.nextInt();

    System.out.println( euclidesAlgorithm(a, b) );
  }
}
