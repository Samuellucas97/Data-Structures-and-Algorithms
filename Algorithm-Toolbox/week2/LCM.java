import java.util.Scanner;

class LCM {
  public static Long euclidesAlgorithm(Long a, Long b) {
    if (b == 0)
      return a;

    return euclidesAlgorithm(b, a%b);
  }

  public static Long leastCommmomMultiplyAlgorithm(Long a, Long b) {
    return (a*b)/euclidesAlgorithm(a, b);
  }

  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    Long a = inputUser.nextLong();
    Long b = inputUser.nextLong();

    System.out.println( leastCommmomMultiplyAlgorithm(a, b) );
  }
}
