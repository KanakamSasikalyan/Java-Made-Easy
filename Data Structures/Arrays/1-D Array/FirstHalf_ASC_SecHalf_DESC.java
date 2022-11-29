import java.util.*;
import java.lang.*;
import java.io.*;

public class Code{
    public static void main (String[] args) throws Exception{
        /* code */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<str.length;i++){
            list.add(Integer.parseInt(str[i]));
        }
        
        int mid = list.size()/2;
        System.out.println(mid);
        
        List<Integer> sub1 = list.subList(0,mid);
        List<Integer> sub2 = list.subList(mid,list.size());
        System.out.println(sub1);
        System.out.println(sub2);
        
        Collections.sort(sub1);
        Collections.sort(sub2,Collections.reverseOrder());
        sub1.addAll(sub2);
        System.out.println(sub1);
    }
}
