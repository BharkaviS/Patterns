/*

Sample Input:
5

Sample Output:
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1

*/

#include<stdio.h>
int main(){
    int n,i,j,k;
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        k=1;
        for(j=1;j<=i;j++){
            if(j%2!=0)
                k=1;
            else
                k=0;
            if(i==j)
                printf("%d",k);
            else
                printf("%d ",k);
        }
        printf("\n");
    }
return 0;
}
