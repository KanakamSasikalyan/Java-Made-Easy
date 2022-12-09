
import java.util.*;
public class GenerateBinary{
	public static void generate(int n){
		Queue<String> q = new LinkedList<String>();
		q.offer("1");
		for(int i=1;i<=n;i++){
			String p = q.poll();
			System.out.print(p+" ");
			q.add(p+"0");
			q.add(p+"1");
		}
	}
	public static void main(String[] args){
		generate(10);
	}
}
