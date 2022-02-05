import java.util.*;
import java.io.*;
import java.lang.*;


public class infitq3{
    public static void main (String[] args) throws Exception{
        /* code */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int half = str.length()/2;
        for(int i=half;i>=0;i--){
            String prefix = str.substring(0,i);
            String suffix = str.substring(i,str.length());
            if(prefix.equals(suffix)){
                System.out.println(suffix);
                break;
            }
            if(prefix.equals("")||suffix.equals("")){
                System.out.println("NO");
                break;
            }
        }
        
    }
}
