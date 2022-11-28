import java.util.*;

public class Pattern7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int r = n;
		for(int i=1;i<=2*n-1;i++){
			if(i>n){
				r--;
			}
			int spaces = (i<=n)?i:r;
			int j = (i<n)?n-i+1:i-n+1;
			for(int k=1;k<=spaces;k++){
				System.out.print(" ");
			}
			for(int p=1;p<=j;p++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
