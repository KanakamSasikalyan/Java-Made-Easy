import java.util.*;
import java.io.*;
import java.lang.*;

public class Check_isAlphabet{
    public static void main (String[] args) {
        /* code */
        Scanner sc= new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isLetter(ch))
            System.out.println("Yes");
        else
            System.out.println("N0");
        
    }
}
