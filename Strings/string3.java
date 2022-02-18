import java.io.*;
import java.lang.*;
import java.util.*;

public class second
{
    public static void main(String[] args) {
        HashSet<Character> vow = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(char c : str.toCharArray()){
            //You can add Case-Sensitive case here by using isUpperCase() or isLowerCase() methods
            if(vow.contains(c)){
                count++;
            }
        }
        System.out.println("Number of vowels : "+count);
    }
}
