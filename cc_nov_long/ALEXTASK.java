import java.io.*;
import java.util.*;

public class ALEXTASK {
	public static void main(String args[])throws IOException
	{
		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(dis.readLine());
		while(t-- > 0)
		{
			int n=Integer.parseInt(dis.readLine());
			long a[] = new long[n];			
			String str[]=dis.readLine().split(" ");
			
			for(int j=0;j<n;j++)
				a[j] = Long.parseLong(str[j]);
			
			long min = Long.MAX_VALUE;
			long tempMin;
			
			Arrays.sort(a);
		    
		    for(int i=0;i<n;i++)
		    {
		    	// if(i<n-1 && min<a[i+1])
		    	// 	break;
		    	
		    	for(int j=i+1;j<n;j++)
		    	{
		    		tempMin=findLCM(a[i], a[j]);
		    		if(min>tempMin)
		    			min=tempMin;
		    		
		    	}
		    }
		    
		    System.out.println(min);
			
		}
	}
	
	public static long  findLCM(long  a, long  b)
	{
	  return (a*b)/gcd(a,b);
	}
	
	public static long  gcd(long  a, long  b)
	{
	  if (b == 0)
	    return a;
	  else
	    return gcd(b, a%b);
	}	

}