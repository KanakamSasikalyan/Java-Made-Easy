import java.util.*;
import java.io.*;
import java.lang.*;

public class Sum{
    public static void main (String[] args) throws Exception{
        /* code */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] arr = new int[str.length];
        int sum = 0;
        for(int i=0;i<str.length;i++){
            arr[i] = Integer.parseInt(str[i]);
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
