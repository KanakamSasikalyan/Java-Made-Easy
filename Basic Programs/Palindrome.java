import java.util.*;

class Palindrome{
    public static void main (String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(char ch:input.toCharArray()){
            st.push(Character.getNumericValue(ch));
        }
        String op = "";
        while(!st.isEmpty()){
            op += String.valueOf(st.pop());
        }
        System.out.print(op);
    }
}
