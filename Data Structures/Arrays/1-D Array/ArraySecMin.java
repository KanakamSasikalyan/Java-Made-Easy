import java.util.*;
import java.io.*;
import java.lang.*;

public class Second{
    public static void main (String[] args) throws Exception{
        /* code */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] arr = new int[str.length];
        for(int i=0;i<str.length;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        //Find Smallest Number
        int min=arr[0], secmin=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min > arr[i]){
                secmin = min;
                min = arr[i];
            }
        }
        System.out.println(secmin+" "+min);
    }
}
