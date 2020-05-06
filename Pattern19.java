/*

Sample Input:
4

Sample Output:
1
1 2 3
1 2 3 4 5
1 2 3 4 5 6 7

*/
import java.io.*;
import java.util.*;

class Pattern19{
	public static void main(String args[]){
		int n,i,j,k=1,l=1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=1;i<=n;i++){
			k=1;
			for(j=1;j<=l;j++){
				System.out.print(k+" ");
				k++;
			}
			l+=2;
			System.out.println("");
		}
	}
}
