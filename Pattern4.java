/*
Input:5

Output:

1                                                                                                                                             
2 2                                                                                                                                           
3 3 3                                                                                                                                         
4 4 4 4                                                                                                                                       
5 5 5 5 5 

*/

import java.io.*;
import java.util.*;


public class Pattern4
{
	public static void main(String[] args) {
		int n,i,j,k;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		k=1;
		for(i=0;i<n;i++){
		    for(j=0;j<=i;j++){
		        System.out.print(k+" ");
		  }
		    k++;
		    System.out.println(" ");
		}
	}
}
