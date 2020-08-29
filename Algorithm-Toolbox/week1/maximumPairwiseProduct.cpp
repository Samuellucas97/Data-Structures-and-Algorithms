#include <iostream>

int main() {
    int sizeArray;
    std::cin >> sizeArray;    
    long long elements[sizeArray];
    long long maxPairwise = 0;
    long long productActual = 0;

    for(int i=0; i< sizeArray; ++i) {
        std::cin >> elements[i];
    }
    
    for(int i=0; i< sizeArray; ++i) {
        for(int j=0; j< sizeArray; ++j) {
            productActual = elements[i]*elements[j];
            if ( productActual > maxPairwise && i != j)
                maxPairwise = productActual;
        }
    }

    std::cout << maxPairwise;

    return 0;
}