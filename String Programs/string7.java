import java.io.*;
import java.lang.*;
import java.util.*;

public class sixth
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res="";
        for(char c : str.toCharArray()){
            if(Character.isAlphabetic(c))
                res += String.valueOf(c);
        }
        System.out.println(res);
    }
}
