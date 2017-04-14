// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;

// public class MAKETRI 
// {

// 	static Long[] len;
// 	static HashMap<Long,Long> pairs;

// 	public static void main(String args[]) throws IOException
// 	{
// 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
// 		String str[]=br.readLine().split(" ");

// 		int n=Integer.parseInt(str[0]);
// 		long l=Long.parseLong(str[1]);
// 		long r=Long.parseLong(str[2]);
		
// 		pairs=new HashMap<>();
// 		long ans=0;
// 		len=new Long[n];
		
// 		str=br.readLine().split(" ");

// 		for(int i=0;i<n;i++)
// 			len[i]=Long.parseLong(str[i]);

// 		Arrays.sort(len);

// 		long pmax=0;

// 		// for(int i=0;i<n-1;i++)
// 		// {
// 		// 	long mx=nos[i+1]+nos[i]-1;//-1 avoids degenerate case
// 		// 	long mn=nos[i+1]-nos[i]+1;//+1 avoids degenerate case

// 		// 	if(pairs.get(mn)!=null)
// 		// 	{
// 		// 		if(pairs.get(mn)<mx)
// 		// 			pairs.put(mn, mx);
				
// 		// 	}
// 		// 	else
// 		// 	{
// 		// 		pairs.put(mn,mx);
// 		// 	}

// 		// }

// 		long mx, mn;
// 		for(int i=0;i<n-1;i++){
//             mn=len[i+1]-len[i]+1;
//             mx=len[i]+len[i+1]-1;
//             if(pairs.containsKey(mn))
//             {
//                 if(pairs.get(mn)<mx)
//                 pairs.put(mn,mx);
//             }
//             else
//             pairs.put(mn,mx);
//         }

// 	// 	for(Map.Entry m:map.entrySet())
// 	// 	{
// 	// 		long mx=convertToLong(m.getValue());
// 	// 		long mn=convertToLong(m.getKey());

// 	// 		if(mn<pmax+1)
// 	// 			mn=pmax+1;

// 	// 		if(mn<=mx)
// 	// 		{
// 	// 			if(mn>R)
// 	// 			{
// 	// 				break;
// 	// 			}
// 	// 			else if(mn<=L && mx>=R)
// 	// 			{
// 	// 				ans+=R-L+1;
// 	// 				break;
// 	// 			}
// 	// 			else if(mn>=L && mx>=R)
// 	// 			{
// 	// 				ans+=R-mn+1;
// 	// 				break;

// 	// 			}
// 	// 			else if(mn<=L && mx<=R)
// 	// 			{
// 	// 				ans+=mx-L+1;
// 	// 				L=mx+1;
// 	// 				pmax=mx;
// 	// 			}
// 	// 			else
// 	// 			{
// 	// 				ans+=mx-mn+1;
// 	// 				L=mx+1;
// 	// 				pmax=mx;
// 	// 			}
// 	// 		}
// 	// 	}
// 	// 	System.out.println(ans);
// 	// }


// 	for(Map.Entry m:pairs.entrySet()){  
//             mn=(convertToLong(m.getKey())<pmax+1)?pmax+1:convertToLong(m.getKey());
//             mx=convertToLong(m.getValue());
            
//             if(mx>=mn){
               
//                // out.println(mn+" "+mx);
//             if(mn>r)
//             {break;}
//             /*if(mn>l)
//             l=mn;*/
//             if(mn>=l&&mx>=r)
//             {ans+=r-mn+1;break;
//                 //out.println("A"+ans+" "+mn);
//             }
            
//             else if(mn<=l&&mx>=r)
//             {ans+=r-l+1;break;
//                 //out.println("B"+ans);
//             }
            
//             else if(mn<=l&&mx<=r)
//             {ans+=mx-l+1;l=mx+1; pmax=mx;
//                 //out.println("C"+ans);
//             }
//             else if(mn>=l&&mx<=r)
//             {ans+=mx-mn+1;l=mx+1; pmax=mx;
//                 //out.println("D"+ans+" "+min);
//             }
//             }
//         }
// 	 	System.out.println(ans);
//     }

	
// 	public static long convertToLong(Object o)
// 	{
// 		String str=String.valueOf(o);
// 		return Long.parseLong(str);
// 	}
// }





import java.io.*;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.*;
// import java.util.HashMap;
import java.util.*;
class MAKETRI 
{

	static Long[] nos;
	static Map<Long,Long> map;

	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str[]=br.readLine().split(" ");

		int N=Integer.parseInt(str[0]);
		long L=Long.parseLong(str[1]);
		long R=Long.parseLong(str[2]);
		
		map=new TreeMap<Long, Long>();
		long count=0;
		nos=new Long[N];
		
		str=br.readLine().split(" ");

		for(int i=0;i<N;i++)
			nos[i]=Long.parseLong(str[i]);

		Arrays.sort(nos);

		long mark=0;

		for(int i=0;i<N-1;i++)
		{
			long max=nos[i+1]+nos[i]-1;//-1 avoids degenerate case
			long min=nos[i+1]-nos[i]+1;//+1 avoids degenerate case

			if(map.get(min)==null)
				map.put(min,max);
			else
			{
				if(map.get(min)<max)
					map.put(min, max);
			}

		}

		for(Map.Entry m:map.entrySet())
		{
			long max=convertToLong(m.getValue());
			long min=convertToLong(m.getKey());

			if(min<mark+1)
				min=mark+1;

			if(min<=max)
			{
				if(min>R)
				{
					break;
				}
				else if(min<=L && max>=R)
				{
					count+=R-L+1;
					break;
				}
				else if(min>=L && max>=R)
				{
					count+=R-min+1;
					break;

				}
				else if(min<=L && max<=R)
				{
					count+=max-L+1;
					L=max+1;
					mark=max;
				}
				else
				{
					count+=max-min+1;
					L=max+1;
					mark=max;
				}
			}
		}
		System.out.println(count);
	}

	
	public static long convertToLong(Object o)
	{
		String str=String.valueOf(o);
		return Long.parseLong(str);
	}
}