/*
Input:5

Output:

5                                                                                                                                             
4 4                                                                                                                                           
3 3 3                                                                                                                                         
2 2 2 2                                                                                                                                       
1 1 1 1 1

*/

import java.io.*;
import java.util.*;


public class Pattern3
{
	public static void main(String[] args) {
		int n,i,j,k;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		k=n;
		for(i=0;i<n;i++){
		    for(j=0;j<=i;j++){
		        System.out.print(k+" ");
		  }
		    k--;
		    System.out.println(" ");
		}
	}
}
