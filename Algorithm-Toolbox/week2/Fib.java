import java.util.Scanner;

class Fib {
  public static long fibonnaciReccursive(Integer n) {
    if ( n <= 1L) 
      return n;

    return fibonnaciReccursive(n-1) + fibonnaciReccursive(n-2);
  }


  public static Integer fibbonacci(Integer n) {
    
    if ( n == 0 || n == 1)
      return n;
    else {
      Integer[] elements = new Integer[n+1];
      elements[0] = 0;
      elements[1] = 1;

      for (int i=2; i< n+1; ++i) {
        elements[i] = (elements[i-1] + elements[i-2]);  
      }

      return elements[n];
    }
  }
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    Integer n = inputUser.nextInt();

    System.out.println( fibbonacci(n) );
  }
}
