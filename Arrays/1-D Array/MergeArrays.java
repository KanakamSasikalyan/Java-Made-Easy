import java.util.*;

public class MergeArrays{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		for(int i=0;i<n1;i++){
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++){
			arr2[i]=sc.nextInt();
		}
		
		int[] res = new int[n1+n2];

		for(int i=0;i<res.length;i++){
			res[i] = (i<n1)?arr1[i]:arr2[i-n2+1];
		}

		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
}
