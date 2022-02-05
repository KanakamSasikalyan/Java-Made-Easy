import java.util.*;
import java.io.*;
import java.lang.*;

public class Reverse{
    public static void main (String[] args) {
        /* code */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<Character> set = new HashSet<Character>();
        String res ="";
        for(int i=0;i<str.length();i++){
            if(!set.contains(str.charAt(i))){
                res += String.valueOf(str.charAt(i));
                set.add(str.charAt(i));
            }
        }
        res = new StringBuilder(res).reverse().toString();
        System.out.println(res);
    }
}
