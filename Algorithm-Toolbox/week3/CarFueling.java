import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class CarFueling {
  private static Integer greedyAlgorithm(ArrayList<Integer> stops, Integer numberOfStops, int MaxDistanceUsingGasCar) {

    Integer numberOfRefils = 0;
    Integer currentNumberOfRefils = 0;

    Integer lastRefil = 0;
    while( currentNumberOfRefils <= numberOfStops) {
      lastRefil = currentNumberOfRefils;

      while ( currentNumberOfRefils <= numberOfStops && (stops.get(currentNumberOfRefils+1) - stops.get(lastRefil))  <= MaxDistanceUsingGasCar) {
        currentNumberOfRefils += 1;
      }

      if ( currentNumberOfRefils == lastRefil)
        return -1;

      if ( currentNumberOfRefils <= numberOfStops)
        numberOfRefils += 1;
    }

    return numberOfRefils;
  }

  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    Integer totalDistance = inputUser.nextInt();
    Integer MaxDistanceUsingGasCar = inputUser.nextInt();
    Integer numberOfStops = inputUser.nextInt();

    ArrayList<Integer> stops = new ArrayList<Integer>();
    stops.add(0);

    for (int i=0; i< numberOfStops; ++i) {
      stops.add(inputUser.nextInt());
    }
    
    stops.add(totalDistance);
    
    System.out.println(greedyAlgorithm(stops, numberOfStops, MaxDistanceUsingGasCar));

  }
}
