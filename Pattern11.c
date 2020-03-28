/*

Sample Input:
4

Sample Output:
1 2 3 4 5 6 7
1 2 3 4 5
1 2 3
1

*/

#include<stdio.h>
int main(){
    int n,i,j;
    scanf("%d",&n);
    for(i=n+(n-1);i>=0;i=i-2){
        for(j=1;j<=i;j++){
            printf("%d ",j);
        }
        printf("\n");
    }
    return 0;
}
