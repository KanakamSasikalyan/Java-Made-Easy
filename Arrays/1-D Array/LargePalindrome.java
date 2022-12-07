import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
    static boolean isPalindrome(int num){
        String temp = new StringBuilder(String.valueOf(num)).reverse().toString();
        int val = Integer.parseInt(temp);
        return (val==num);
    }
    public static void main (String[] args) throws Exception{
        /* code */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] read = br.readLine().split("\\s");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<read.length;i++){
            list.add(Integer.parseInt(read[i]));
        }
        //System.out.println(list);
        
        Collections.sort(list,Collections.reverseOrder());
        int LP = 0;
        for(int i=0;i<list.size();i++){
            if(isPalindrome(list.get(i))){
                LP = list.get(i);
                break;
            }
        }
        System.out.println(LP);
    }
}
