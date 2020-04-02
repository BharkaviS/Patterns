/*

Input :
4 D

Output:
/\/\/\/\
\/\/\/\/
/\/\/\/\
\/\/\/\/
/\/\/\/\
\/\/\/\/
/\/\/\/\
\/\/\/\/

Input:
2 X

Output:
\/\/
/\/\
\/\/
/\/\

Character can be only D or X.
*/

import java.io.*;
import java.util.*;

public class DiamondPattern {
  public static void main(String args[]){
    int n,i,j;
    char ch;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    ch=sc.next().charAt(0);
    for(i=0;i<2*n;i++){
      for(j=0;j<n;j++){
        if(ch=='D'){
          if(i%2==0)
            System.out.print("/\\");
          else
            System.out.print("\\/");
        }
        else{
          if(i%2==0)
            System.out.print("\\/");
          else
            System.out.print("/\\");
        }
      }
      System.out.println(" ");
    }
  }
}
