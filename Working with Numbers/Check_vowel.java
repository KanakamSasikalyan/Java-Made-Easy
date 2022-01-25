import java.util.*;
import java.io.*;
import java.lang.*;

public class Check_vowel{
    public static void main (String[] args) {
        /* code */
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<Character>(Arrays.asList('a','e','i','o','u'));
        //System.out.println(set);
        char ch = sc.next().charAt(0);
        if(set.contains(Character.toLowerCase(ch)))
            System.out.println("vowel");
        else
            System.out.println("Consonant");
    }
}
