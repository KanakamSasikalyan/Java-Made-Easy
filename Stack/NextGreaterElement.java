import java.util.*;

public class NextGreaterElement{
	
	public static int[] nextGreater(int[] arr){
		int[] next = new int[arr.length];
		Arrays.fill(next, -1);
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]>arr[i]){
					next[i] = arr[j];
					break;
				}
			}
		}
		return next;
	}
	public static void main(String[] args){
		int[] res = nextGreater(new int[]{1,0,5,7,10,3});
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
}
