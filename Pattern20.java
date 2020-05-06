/*
Sample Input:
5

Sample Output:
1 3 5 7 9
3 5 7 9
5 7 9
7 9
9

*/

import java.io.*;
import java.util.*;

class Pattern20{
	public static void main(String args[]){
		int n,i,j,k=1,l=1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=n;i>=0;i--){
			for(j=1;j<=i;j++){
				System.out.print(k+" ");
				k+=2;
			}
			l+=2;
			k = l;
			
			System.out.println("");
		}
	}
}
