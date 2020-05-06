/*
Sample Input:
5

Sample Output:
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/


import java.io.*;
import java.util.*;

class EXPat{
	public static void main(String args[]){
		int n,i,j,k=1,l,x,y=1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		l = n-1;
		x = l;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(k+" ");
				k+=l;
				l--;
			}
			l = x;
			y++;
			k = y;
			
			System.out.println("");
		}
	}
}
