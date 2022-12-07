import java.util.*;


public class ReverseString{
	public static String reverseString(String str){
		Stack<Character> st = new Stack<Character>();
		String res = "";
		char[] arr = str.toCharArray();
		for(int i=0;i<str.length();i++){
			st.push(arr[i]);
		}
		while(!st.isEmpty()){
			res+=String.valueOf(st.pop());
		}
		return res;
	}
	public static void main(String[] args){
		System.out.println("The reversed String is: "+reverseString("Hello"));
	}
}
