/*
Sample Input 1:
4
Sample Output 1:
1
2 3 2
3 4 5 4 3
4 5 6 7 6 5 4

Sample Input 2:
7
Sample Output 2:
1
2 3 2
3 4 5 4 3
4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
6 7 8 9 0 1 0 9 8 7 6
7 8 9 0 1 2 3 2 1 0 9 8 7
*/

import java.io.*;
import java.util.*;

class EXPat{
	public static void main(String args[]){
		int n,i,j,k=0,l=0,x=0,y=1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<=l;j++){
				if(j>i){
					k--;
				}
				else{
					k++;
				}
				System.out.print(k%10+" ");
			}
			l+=2;
			System.out.println("");
		}
	}
}
