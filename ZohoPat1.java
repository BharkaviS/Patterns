/*

Input:
program                                                                                                                                         

Output:

p            m                                                                                                                                  
  r        a                                                                                                                                    
    o    r                                                                                                                                      
       g                                                                                                                                        
    o   r                                                                                                                                       
  r       a                                                                                                                                     
p           m                                                                                                                                   

*/

import java.util.*;

public class ZohoPat1
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
    String str;
    int n,i,j,start,end;
    str=sc.nextLine();
    n=str.length();
    start = 0;
    end= n-1;
    for (i=0;i<n;i++){
      for(j=0;j<n;j++){
        if(j==start && start!=end){
          System.out.print(str.charAt(start));
        }
        if(j==end && start!=end){
          System.out.print(str.charAt(end));
        }
        
        else{
          System.out.print(" ");
        }
        if(start==end && i==j){
            System.out.print(str.charAt(start));
        }
        else{
            System.out.print(" ");
        }
       
      }
      System.out.println(" ");
       start++;
        end--;
    }
  }
}
