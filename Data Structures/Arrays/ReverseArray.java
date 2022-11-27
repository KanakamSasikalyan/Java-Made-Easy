import java.util.*;
import java.lang.*;
import java.io.*;

public class Reverse{
    public static void main (String[] args) throws Exception{
        /* code */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] arr = new int[str.length];
        for(int i=0,j=str.length-1;i<str.length;i++,j--){
            arr[i] = Integer.parseInt(str[j]);
        }
        for(int i=0,j=str.length-1;i<str.length;i++,j--){
            System.out.println(arr[i]+" ");
        }
    }
}
