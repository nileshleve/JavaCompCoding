package amrita2016;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class ICPC16D {
    public static void main(String args[]) throws NumberFormatException, IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        
        while(T-->0)
        {
            int N=Integer.parseInt(br.readLine());
            String str[]=br.readLine().split(" ");
            int nos[]=new int[N+1];
            int max=-1;
            
            for(int i=0;i<N;i++)
            {
                nos[i]=Integer.parseInt(str[i]);
                if(nos[i]>max)
                    max=nos[i];
            }
            
            Arrays.sort(nos);
            int dp[]=new int[max+1];
            
            for(int j=0;j<max+1;j++)
                dp[j]=0;
            
            long count=0;
            
            for(int i=1;i<N+1;i++)
            {
                int ndp[]=new int[max+1];
                
                for(int j=0;j<max+1;j++)
                    ndp[j]=0;
                
                
                for(int j=1;j<max+1;j++)
                {
                    if(dp[j]>0 && nos[i]%j==0)
                    {
                        ndp[nos[i]]+=(dp[j]);
                        count+=(dp[j]); 
                    }
                }
                
                ndp[nos[i]]+=1;
                count+=1;
                
                for(int j=1;j<max+1;j++)
                    dp[j]+=ndp[j];
                
            }
            System.out.println((int)(count%(Math.pow(10,9)+7)));
        }
    }
    
    
}
