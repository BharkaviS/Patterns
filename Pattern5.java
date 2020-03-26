/*
Input:5

Output:

5                                                                                                                                             
4 5                                                                                                                                           
3 4 5                                                                                                                                         
2 3 4 5                                                                                                                                       
1 2 3 4 5  

*/

import java.io.*;
import java.util.*;


public class Pattern5
{
	public static void main(String[] args) {
		int n,i,j,k;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		k=n;
		for(i=0;i<n;i++){
		    int x=k;
		    for(j=0;j<=i;j++){
		        System.out.print(x+" ");
		        x++;
		  }
		    k--;
		    System.out.println(" ");
		}
	}
}
