import java.util.*;

public class ValidParantheses{
	public static boolean isValid(String str){
		Stack<Character> st = new Stack<Character>();
		char[] arr = str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(arr[i]=='('||arr[i]=='['||arr[i]=='{'){
				st.push(arr[i]);
			}
			else{
				if(st.isEmpty()){
					return false;
				}
				char c = st.peek();
				if((c=='('&&arr[i]==')')||(c=='['&&arr[i]==']')||(c=='{'&&arr[i]=='}')){
					st.pop();
				}
			}
		}
		return st.isEmpty();
	}
	public static void main(String[] args){
		System.out.println(isValid("{([])}"));
	}
}
