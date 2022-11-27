/*
	   * 
         * * 
       * * * 
     * * * * 
   * * * * * 
 
*/

import java.util.*;

public class LeftTriangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			int spaces = n-i;
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();		
		}

	}
}
