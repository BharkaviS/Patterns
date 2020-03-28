/*

Sample Input:
5

Sample Output:
5 5 5 5 5 
4 5 5 5 5 
3 4 5 5 5 
2 3 4 5 5 
1 2 3 4 5 

*/

#include<stdio.h>
int main(){
    int n,i,j,k,p;
    scanf("%d",&n);
    k=n;
    for(i=1;i<=n;i++){
        p=k;
        for(j=1;j<=n;j++){
            if(j<=i){
                if(j!=n)
                    printf("%d ",p);
                else
                    printf("%d",p);
            }
            else{
                if(j!=n)
                    printf("%d ",n);
                else
                    printf("%d",n);
            }
            p++;
        }
        k--;
        printf("\n");
    }
return 0;
}
