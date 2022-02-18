import java.io.*;
import java.lang.*;
import java.util.*;

public class fourth
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = new StringBuilder(str).reverse().toString();
        String res = (str.equalsIgnoreCase(temp))?"Palindrome":"Not Palindrome";
        System.out.println(res);
    }
}
