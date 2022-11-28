import java.io.*;
import java.lang.*;
import java.util.*;

public class third
{
    public static void main(String[] args) {
        HashSet<Character> vow = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        for(char c : str.toCharArray()){
            //You can add Case-Sensitive case here by using isUpperCase() or isLowerCase() methods
            if(!vow.contains(c)){
                 res += String.valueOf(c);   
            }
        }
        System.out.println("Resultant String : "+res);
    }
}
