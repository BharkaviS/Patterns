/*
Input: 5

Output:

5 4 3 2 1 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 1 2 3 4 5
1 1 1 1 1 1 1 1 1
5 4 3 2 1 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 1 2 3 4 5

*/

import java.io.*;
import java.util.*;

public class DCPat{
  public static void main(String args[]){
    int n,i,j,k,l=2;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    k=n;
    for(i=0;i<2*n-1;i++){
      k=n;
      if(i!=n-1){
      for(j=0;j<n;j++){
        System.out.print(k+" ");
        k--;
      }
      l=2;
      for(j=0;j<n-1;j++){
        System.out.print(l+" ");
        l++;
      }
      System.out.println(" ");
    }
  else{
    for(j=0;j<2*n-1;j++){
      System.out.print(1+" ");
    }
    System.out.println(" ");
  }
}
  }
}
