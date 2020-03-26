/*
Input:5

Output:

1 2 3 4 5                                                                                                                                     
1 2 3 4                                                                                                                                       
1 2 3                                                                                                                                         
1 2                                                                                                                                           
1   

*/

import java.io.*;
import java.util.*;


public class Pattern2
{
	public static void main(String[] args) {
		int n,i,j,k=1;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++){
		    k=1;
		    for(j=n;j>i;j--){
		        System.out.print(k+" ");
		        k++;
		    }
		    System.out.println(" ");
		}
	}
}
