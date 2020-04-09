/*

Input:
4

Output:
a                                                                                                                                             
B c                                                                                                                                           
D e F                                                                                                                                         
g H i J 

Input:
9

Output:
a                                                                                                                                             
B c                                                                                                                                           
D e F                                                                                                                                         
g H i J                                                                                                                                       
k L m N o                                                                                                                                     
P q R s T u                                                                                                                                   
V w X y Z a B                                                                                                                                 
c D e F g H i J                                                                                                                               
k L m N o P q R s 

*/












#include<stdio.h>
#include<string.h>

int main()
{
    int n,i,j,c=1;
    char a='a';
    scanf("%d",&n);
    for(i=0;i<n;i++){
        for(j=0;j<=i;j++){
            if(c==27){
                c=1;
                a='a';
            }
            if(c%2!=0){
                printf("%c ",a);
            }
            else{
                printf("%c ",toupper(a));
            }
            c++;
            a++;
        }
        printf("\n");
    }

    return 0;
}
