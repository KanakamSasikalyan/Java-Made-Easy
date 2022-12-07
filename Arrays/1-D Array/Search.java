import java.util.*;


//Linear Search Approach

/*
public class Search{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		boolean found = false;
		for(int i=0;i<n;i++){
			if(arr[i]==key){
				found = true;
				break;
			}
		}
		
		if(found){
			System.out.println("Element found");
		}else{
			System.out.println("Element not found");
		}
	}
}
*/


//Binary Search Approach

public class Search{
	public static boolean binarySearch(int[] arr, int n, int k){
		Arrays.sort(arr);
		
		int mid = n/2;
		if(arr[mid]==k){
			return true;
		}
		else if(k>arr[mid]){
			for(int i=mid+1;i<n;i++){
				if(arr[i]==k){
					return true;
				}
			}
		}
		else if(k<arr[mid]){
                        for(int i=0;i<mid;i++){
                                if(arr[i]==k){
                                        return true;
                                }
                        }
		}
		return false;
	}
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                       arr[i] = sc.nextInt();
                }
                int key = sc.nextInt();

		boolean found = binarySearch(arr,n,key);
		String res = (found)?"Element found":"Not found";
		System.out.println(res);
	}

}
