#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    scanf("%d", &n);
    
    int *arr;
    arr = (int *) malloc(n * sizeof(int));
    for(int i=0; i<n; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    int sum = 0;
    for(int j=0; j<n; j++)
    {
        sum = sum + arr[j];
    }
    
    free(arr);
    
    printf("%d\n", sum);
    
    return 0;
}