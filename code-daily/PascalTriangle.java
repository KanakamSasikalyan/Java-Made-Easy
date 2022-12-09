import java.util.*;

public class PascalTriangle{
	public static int fact(int n){
		if(n==0||n==1){
			return 1;
		}
		return n*fact(n-1);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			int space = n-i;
			int k = i+1;
			for(int j=0;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=0;j<k;j++){
				int temp = (fact(i))/((fact(i-j)*fact(j)));
				System.out.print(" "+temp+" ");
			}
			System.out.println();
		}
	}
}
