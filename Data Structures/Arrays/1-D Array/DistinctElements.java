import java.util.*;
import java.io.*;
import java.lang.*;


public class Distint{
    public static void main (String[] args) throws Exception{
        /* code */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] read = br.readLine().split("\\s");
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<read.length;i++){
            set.add(Integer.parseInt(read[i]));
        }
        System.out.println(set.size());
    }
}
