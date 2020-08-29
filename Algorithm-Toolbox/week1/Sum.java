import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    Integer firstElement = inputUser.nextInt();
    Integer secondElement = inputUser.nextInt();

    Integer sum = firstElement + secondElement;

    System.out.println("" + firstElement + " + " + secondElement + " = " + sum);
  }
}