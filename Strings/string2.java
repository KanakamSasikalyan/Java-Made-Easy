import java.io.*;
import java.lang.*;
import java.util.*;

public class first
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                res += Character.toLowerCase(c);
            }
            else{
                res += Character.toUpperCase(c);
            }
        }
        System.out.println("Toogled String is :"+res);
    }
}
