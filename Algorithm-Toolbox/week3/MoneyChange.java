import java.util.Scanner;

class MoneyChange {
  private static Integer greedyMoneyChange(Integer total) {

    Integer numberOfCoins = 0;
    while (total >= 10) {
      total -= 10;
      ++numberOfCoins;
    }

    while (total >= 5) {
      total -= 5;
      ++numberOfCoins;
    }
  
    while ( total >= 1) {
      total -= 1;
      ++numberOfCoins;
    }

    return numberOfCoins;
  }

  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    Integer n = inputUser.nextInt();

    System.out.println( greedyMoneyChange(n) );

  }
}
