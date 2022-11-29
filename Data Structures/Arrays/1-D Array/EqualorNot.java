import java.util.*;

public class EqualorNot{
	public static boolean isEqual(int[] arr1, int[] arr2){
		if(arr1.length!=arr2.length){
			return false;
		}
		else{
			for(int i=0;i<arr1.length;i++){
				if(arr1[i]!=arr2[i]){
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];

		for(int i=0;i<n1;i++){
			arr1[i] = sc.nextInt();
		}
		for(int i=0;i<n2;i++){
                        arr2[i] = sc.nextInt();
                }
		
		String res = (isEqual(arr1,arr2))?"Equal":"No";
		System.out.println(res);
	}
}
