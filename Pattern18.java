/*
Sample Input:
5

Sample Output:
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5

*/
import java.util.*;
public class Pattern18 {
	public static void main(String [] args){
        int n,i,j,k=1,l=1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=n;i>=0;i--){
			for(j=1;j<=i;j++){
				System.out.print(k+" ");
				k++;
			}
			System.out.println("");
			k=l+1;
			l++;
        }
}
