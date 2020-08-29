import java.util.Scanner;

class MaximumPairwiseProduct {

  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    Integer sizeArray = inputUser.nextInt();
    long[] elements = new long[sizeArray];

    for (int i = 0; i < sizeArray; ++i) {
      elements[i] = inputUser.nextInt();
    }

    int positionMaximumValue = 0;
    int positionSecondMaximumValue = -1;

    for (int i = 0; i < sizeArray; ++i) {
      if (elements[i] > elements[positionMaximumValue]) {
        positionMaximumValue = i;
      }
    }

    for (int i = 0; i < sizeArray; ++i) {
      if ( i != positionMaximumValue) {
        if (positionSecondMaximumValue == -1 ||  elements[i] > elements[positionSecondMaximumValue]){
         positionSecondMaximumValue = i;
        
        }
      }
    }

    System.out.println(elements[positionMaximumValue] * elements[positionSecondMaximumValue]);
  }
}
