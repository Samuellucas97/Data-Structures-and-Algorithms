#include <iostream>

int main() {
    int firstElement;
    int secondElement;
    int sum;

    std::cin >> firstElement >> secondElement; 

    sum = firstElement + secondElement;

    std::cout << "" << firstElement 
                    << " + "
                    << secondElement
                    << " = "
                    << sum 
                    << std::endl;
    
    return 0;
}