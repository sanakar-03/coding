#include <stdio.h>

int main() {

    char letter, string[100], sentence[100];

    scanf("%c", &letter);
    scanf("%s", string);
    scanf("\n");
    scanf("%[^\n]*%c", sentence);
    printf("%c\n", letter);
    printf("%s\n", string);
    printf("%s\n", sentence);

    return 0;
}