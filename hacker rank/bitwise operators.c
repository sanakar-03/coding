#include <stdio.h>

void calculateTheMaximum(int number, int threshold) {

    int and_max = 0, or_max = 0, xor_max = 0, value = 0;
    
    for (int i = 1; i <= number; i++) {
        for (int j = i + 1; j <= number; j++) {

            value = i & j;
            if (value > and_max && value < threshold) {
                and_max = value;
            }

            value = i | j;
            if (value > or_max && value < threshold) {
                or_max = value;
            }

            value = i ^ j;
            if (value > xor_max && value < threshold) {
                xor_max = value;
            }
        }
    }

    printf("%d\n", and_max);
    printf("%d\n", or_max);
    printf("%d\n", xor_max);

}



int main() {

    int a, b;

    scanf("%d %d", &a, &b);

    calculateTheMaximum(a, b);

    return 0;
}