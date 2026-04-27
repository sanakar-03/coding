#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n,q;
    scanf("%d %d",&n,&q);
    std::vector<std::vector<int>> combinedVector;
    for(int ii = 0;ii<n;ii++)
    {
        int tempArrLen;
        scanf("%d",&tempArrLen);
        std::vector<int> arrTemp;
        int tempVal;
        for(int jj=0;jj<tempArrLen;jj++)
        {
            scanf("%d",&tempVal);
            arrTemp.push_back(tempVal);
        }
        combinedVector.push_back(arrTemp);
    }
    for(int xx=0;xx<q;xx++)
    {
        int arrNum, arrIdx;
        scanf("%d %d",&arrNum,&arrIdx);
        std::vector<int> arrTemp1;
        arrTemp1 = combinedVector.at(arrNum);
        cout << arrTemp1[arrIdx] << std::endl;
    }
    return 0;
}
