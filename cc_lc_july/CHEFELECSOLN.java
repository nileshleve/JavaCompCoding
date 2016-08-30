import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
 
/**
 * Created by Hp on 7/1/2016.
 */
public class Main {
    public static void main(String [] ar)throws IOException{
 
        s = new FastScanner(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
 
        int t=s.nextInt() ;
        while(t-->0){
            int n=s.nextInt();
            String st=s.nextToken();
            long a[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]=s.nextLong();
            }
            long sum=0,max=0;
            boolean flag=false;
 
 
            for(int i=0;i<n-1;i++){
                long p=a[i+1]-a[i];
                char ci=st.charAt(i);
                char cii=st.charAt(i+1);
                if(ci=='0'&&cii=='0'){
                    sum+=p;
                    if(max<p&&flag==true)
                        max=p;
                }
                else if(ci=='0'&&cii=='1'){
                    sum+=p;
                    if(max<p&&flag==true)
                        max=p;
                    if(flag==true){
                        sum=sum-max;
                        flag=false;
                        max=0;
                    }
                }
                else if(ci=='1'&&cii=='0'){
                    sum+=p;
                    if(max<p)
                        max=p;
                    flag=true;
                }
                else{
                    flag=false;
                    max=0;
                }
            }
            System.out.println(sum);
        }
    }
 
    static FastScanner s;
    static PrintWriter out;
 
    static class FastScanner {
        BufferedReader in;
        StringTokenizer st;
 
        public FastScanner(BufferedReader in) {
            this.in = in;
        }
 
        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(nextToken());
        }
 
        public long nextLong() {
            return Long.parseLong(nextToken());
        }
 
        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}
