import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = 0;
        for(char c : str.toCharArray()){
            len++;
        }
        System.out.println("String length : "+len);
    }
}
