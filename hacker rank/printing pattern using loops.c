#include <stdio.h>

int min(int a, int b) {
    if (a > b) {
        return b;
    }
    return a;
}

int main() {
    int num, size, top, bot, left, right, minimum;

    scanf("%d", &num);

    size = num * 2 - 1;

    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            top = i;
            bot = size - 1 - i;
            left = j;
            right = size - 1 - j;
            minimum = min(top, min(bot, min(left, right)));
            printf("%d ", num - minimum);
        }
        printf("\n");
    }

    return 0;
}