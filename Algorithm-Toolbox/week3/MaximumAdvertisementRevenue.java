import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class MaximumAdvertisementRevenue {
  private static Integer greedyAlgorithm(ArrayList<Integer> profitsPerClick, ArrayList<Integer> averagesNumberOfClicksPerDay, int n) {

    Integer average = 0;

    for(int i= 0; i<n; ++i) {
      average += (profitsPerClick.get(i)* averagesNumberOfClicksPerDay.get(i));
    }

    return average;
  }

  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    Integer n = inputUser.nextInt();

    ArrayList<Integer> profitsPerClick = new ArrayList<Integer>();
    ArrayList<Integer> averagesNumberOfClicksPerDay = new ArrayList<Integer>();

    for (int i=0; i< n; ++i) {
      profitsPerClick.add(inputUser.nextInt());
    }

    Collections.sort(profitsPerClick, Collections.reverseOrder());

    for (int i=0; i< n; ++i) {
      averagesNumberOfClicksPerDay.add(inputUser.nextInt());
    }
   
    Collections.sort(averagesNumberOfClicksPerDay,Collections.reverseOrder());
    
    System.out.println(greedyAlgorithm(profitsPerClick,averagesNumberOfClicksPerDay, n));

  }
}
