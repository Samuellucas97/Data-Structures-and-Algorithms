import java.util.ArrayList;
import java.util.Scanner;

class MaximumValueLoot {
  private static Double greedyAlgorithm(Integer[] weights, Integer[] values, Integer maxWeight) {

    Integer[] chosenElements = new Integer[weights.length];
    Double averageValue = 0.0;

    for (int k=0; k< weights.length; ++k) {
      chosenElements[k] = 0;
    }

    Integer actualPosition = -1;
    Integer a = -1;
    for (int n=0; n < weights.length; ++n) {

      if (maxWeight == 0)
        return averageValue;
    
      for (int i=0;i < weights.length; ++i) {
        if (i == 0 && weights[i] > 0)
          actualPosition = i; 


        if  (  weights[i] > 0  &&  
              ((double)values[i]/ weights[i]) > ((double) values[actualPosition]/ weights[actualPosition]) 
            )  {
          actualPosition = i; 
        }
      }

      a = Math.min(weights[actualPosition], maxWeight);
      averageValue += (a * ((double) values[actualPosition]/weights[actualPosition]));

      weights[actualPosition] -= a;
      chosenElements[actualPosition] += a;

      maxWeight -= a;      
    }

    return averageValue;
  }


  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    Integer n = inputUser.nextInt();
    Integer maxWeight = inputUser.nextInt();

    Integer[] elementsWeights = new Integer[n];
    Integer[] elementsValues = new Integer[n];

    for (int i=0; i< n; ++i) {
      elementsValues[i] = inputUser.nextInt();
      elementsWeights[i] = inputUser.nextInt();
    }

    System.out.println(String.format("%.4f", greedyAlgorithm(elementsWeights,elementsValues, maxWeight)));
  }
}
