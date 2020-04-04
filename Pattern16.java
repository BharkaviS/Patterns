/*
Input:
CRY

Output:
**R
*RY
RYC

Input:
PROGRAM

Output:
******G
*****GR
****GRA
***GRAM
**GRAMP
*GRAMPR
GRAMPRO

*/

import java.io.*;
import java.util.*;

class Pattern16 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s;
    int n,mid,i,j,k,l;
    s = sc.nextLine();
    n=s.length();
    mid = n/2;
    String s1,s2;
    s1=s.substring(mid,n)+s.substring(0,mid);
    l=n;
    for(i=0;i<n;i++){
      k=0;
      for(j=1;j<l;j++){
        System.out.print("*");
      }
      l--;
      for(j=0;j<=i;j++){
        System.out.print(s1.charAt(k));
        k++;
      }
      System.out.println(" ");
    }
  }
}
