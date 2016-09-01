import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class factorial{
	
	
	
	public static void main(String[] args)throws IOException {
		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(dis.readLine());
		
		//int max = 0;
		while(t-- > 0){
			int n = Integer.parseInt(dis.readLine());
			printFact(n);
			
		}		
	}

	public static void printFact(int n){
		BigInteger fact[] = new BigInteger[10000];
		fact[0] = BigInteger.ONE;
		BigInteger ans = new BigInteger("0");
		int i;
		
		for(i = 1; i <= n; i++)
			fact[i] = fact[i-1].multiply(BigInteger.valueOf(i));
		ans = fact[--i];
		
		System.out.println(ans);
		
	}


}