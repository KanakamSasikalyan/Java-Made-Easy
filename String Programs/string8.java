import java.io.*;
import java.lang.*;
import java.util.*;

public class seven
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\\s","");
        System.out.println(str);
    }
}
