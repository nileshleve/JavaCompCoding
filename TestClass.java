/* IMPORTANT: Multiple classes and nested static classes are supported */

// * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.*;
//import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;


class TestClass {
 	static HashMap<Integer, Integer> hm = new HashMap<>();
    public static void main(String args[] ) throws Exception {
        
        BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
       //String line = dis.readLine();
        int N = Integer.parseInt(dis.readLine());
		
		String str[]=dis.readLine().split(" ");
		int nos[]=new int[N];
		for(int i=0;i<N;i++)
		nos[i]=Integer.parseInt(str[i]);
		
    
       int max = 0;
       int a[] = new int[N];
       
       for (int i = 0; i < N; i++) {
            a[i] = nos[i];
            if(max < a[i])
            	max = a[i];
       }
        int dist = 1000000;
		sieveOfEratosthenes(max);

		for(int i = 0; i < N; i++){
			if(hm.containsKey(a[i])){
				System.out.print(a[i] + " ");
				dist = 0;
			}
            else if(dist == 0){
                System.out.print(a[i-1] + " ");
                dist++;
            }
			else{
				for(int j = 1; j < dist && (i+j) < N-1; j++){
					if(hm.containsKey(a[i+j])){
						System.out.print(a[i+j] + " ");
                        //dist++;
                        break;
					}
				}
				System.out.print(a[i - dist] + " ");
                dist++;
			}
		}
		
		
        
    }
    
    
    public static void sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        int temp = 2; 
        // Print all prime numbers
        for(int i = 3; i <= n; i++)
        {
            if(prime[i] == true){
            	hm.put(temp, i);
            	temp = i;
            }
        }
    }
    
    
}


