import java.util.*;
import java.io.*;
import java.lang.*;


public class infitq1{
    public static void main (String[] args) throws Exception{
        /* code */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(",");
        ArrayList<Integer> list = new ArrayList<>();
        for(String i : arr){
            list.add(Integer.parseInt(i));
        }
        int ind1 = list.indexOf(4);
        int ind2 = list.indexOf(7);
        int res1 = 0;String res2="";
        for(int i=0;i<list.size();i++){
            if(i<ind1||i>ind2){
                res1 += list.get(i);
            }
            else{
                res2 += String.valueOf(list.get(i));
            }
        }
        System.out.println(res2+" "+res1);
    }
}
