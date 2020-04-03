/*
Input:5

Output:

1 1 1 1 1
2 2 2 2
3 3 3
4 4
5

*/

import java.io.*
import java.util.*;


public class Pattern1
{
	public static void main(String[] args) {
		int n,i,j,k=1;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++){
		    for(j=n;j>i;j--){
		        System.out.print(k+" ");
		    }
		    k++;
		    System.out.println(" ");
		}
	}
}
