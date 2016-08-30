import java.io.*;
import java.util.*;

public class amazon1{
	public static void main(String args[])throws IOException{
		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
		String str = dis.readLine();
		//StringTokenizer tstr =new StringTokenizer(str);
		String a[] = str.split(" ");
		for(int i = a.length - 1 ;i >= 0; i--){
			System.out.println(a[i]+"\t");
		}
	}
}