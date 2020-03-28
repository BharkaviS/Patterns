#include<stdio.h>
int main(){
    int n,i,j,k=1;
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        if(i%2!=0)
            k=1;
        else
            k=0;
        for(j=1;j<=i;j++){
            if(i==j)
                printf("%d",k);
            else
                printf("%d ",k);
            if(k==1)
                k--;
            else
                k++;
        }
        printf("\n");
    }
return 0;
}
