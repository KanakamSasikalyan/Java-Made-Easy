/*
Check if there exist two elements in an array whose sum is equal to the sum of rest of the array.

Difficulty Level: Advance, Because You have try to solve in Time complexity : O(n).
And simple solution it can be of Time complexity :  O(n3).

Explanation

If We have an array of integers and we have to find two such elements in the array such that sum of these two elements is equal to the sum of rest of elements in array.

Examples:

Input  : arr[] = {2, 11, 5, 1, 4, 7}
Output : Elements are 4 and 11
Note that 4 + 11 = 2 + 5 + 1 + 7

Input  : arr[] = {2, 4, 2, 1, 11, 15}
Output : Elements do not exist

*/



import java.util.*;

public class SumTwo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		boolean found = false;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int sum = 0;
				if(i!=j){
					for(int k=0;k<n;k++){
						if(k!=i&&k!=j){
							sum+=arr[k];
						}
					}
				}
				if(sum==(arr[i]+arr[j])){
					System.out.println(arr[i]+" "+arr[j]);
					found = true;
					break;
				}
			}
			if(found){
				break;
			}
		}
	}
}
