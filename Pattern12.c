/*
Sample Input:
5

Sample Output:
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/

#include<stdio.h>
int main(){
    int n,i,j,k;
    scanf("%d",&n);
    for(i=1;i<=n;++i){
        k=n;
        for(j=n;j>=i;--j){
            if(n!=1 && j!=i){
            printf("%d ",k);
            }
            else if(n!=1 && j==i){
                printf("%d",k);
                
            }
            else if(n==1 && i==j){
                printf("%d ",k);
            }
            
            k--;
        }
        printf("\n");
    }
return 0;
}
