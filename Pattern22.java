/*
Sample Input:
5

Sample Output:
1
2 4
1 3 5
2 4 6 8
1 3 5 7 9
*/


import java.io.*;
import java.util.*;

class Pattern22{
	public static void main(String args[]){
		int n,i,j,k=1,l,x,y=1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print(k+" ");
				k+=2;
			}
			if(i%2!=0){
				k=1;
			}
			else{
				k=2;
			}
			
			
			System.out.println("");
		}
	}
}
