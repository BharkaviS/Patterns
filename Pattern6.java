Input:4

Output:

1                                                                                                                                             
2 3                                                                                                                                           
4 5 6                                                                                                                                         
7 8 9 10  
*/

import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) {
		int n,i,j,k;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		k=1;
		for(i=0;i<n;i++){
		    for(j=0;j<=i;j++){
		        System.out.print(k+" ");
		        k++;
		  }
		    System.out.println(" ");
		}
	}
}
