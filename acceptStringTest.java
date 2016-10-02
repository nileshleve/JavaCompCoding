import java.util.*;
import java.lang.*;
import java.io.*;

class acceptStringTest {
	public static void main (String[] args)throws IOException {
		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(dis.readLine());
		while(t-- > 0){
		    String str= dis.readLine().trim();
    		String x[] = str.split(" ");
    		for(int i =0; i<x.length;i++){
    		    System.out.print(x[i]);
    		}
    		System.out.println();
    
		    
		}
		
	}
}