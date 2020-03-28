/*

Sample Input:
5

Sample Output:
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 

*/

#include<stdio.h>
int main(){
    int n,i,j,k;
    scanf("%d",&n);
    k=n;
    for(i=n;i>=0;i--){
        for(j=1;j<=i;j++){
            if(i==j)
                printf("%d",k);
            else
                printf("%d ",k);
        }
        k--;
        printf("\n");
    }
return 0;
}
