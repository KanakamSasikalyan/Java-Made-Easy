import java.util.*;
import java.io.*;
import java.lang.*;


public class infitq2{
    public static void main (String[] args) throws Exception{
        /* code */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashSet<Integer> set = new HashSet<Integer>();
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                set.add(Character.getNumericValue(ch));
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list,Collections.reverseOrder());
        if(list.get(list.size()-1)%2!=0){
            for(int i=list.size()-2;i>=0;i--){
                if(list.get(i)%2==0){
                    Collections.swap(list,i,list.size()-1);
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
