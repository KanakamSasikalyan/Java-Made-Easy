import java.util.*;

public class RemoveDup{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		
		int[] arr = new int[n];
		int[] temp = new int[n];
		int k=0;
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			int count=1;
			if(arr[i]!=-1){
			for(int j=0;j<n;j++){
				if(i!=j){
					if(arr[i]==arr[j]){arr[j]=-1;count++;}
				}
			}
			
			temp[k++] = arr[i];
			}
		}

		//Resultant array is
		for(int i=0;i<k;i++){
			System.out.print(temp[i]+" ");
		}
	}
}
