import java.util.Scanner;

class LastDigitFib {
  public static long fibonnaciReccursive(Integer n) {
    if ( n <= 1L) 
      return n;

    return fibonnaciReccursive(n-1) + fibonnaciReccursive(n-2);
  }


  public static Long fibbonacci(Integer n) {
    Long[] elements = new Long[n+1];
    elements[0] = 0L;
    elements[1] = 1L;

    for (int i=2; i< n+1; ++i) {
      elements[i] = (elements[i-1] + elements[i-2]) % 10;  
    }

    return elements[n];
  }
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    Integer n = inputUser.nextInt();

    System.out.println( fibbonacci(n) );
  }
}
