import java.io.*;
import java.util.*;

public class kuliza1{
	public static void main(String args[])throws IOException{
		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(dis.readLine());
		int x=0;
		int y=0;
		for(int i= 1;i<101;i++){
			if(i%3 == 0){
				x = 1;
			}
			if(i%5 == 0){
				y = 1;
			}
			if(x==1 && y==1){
				
				x=y=0;
				continue;
			}
			else if(x>0 || y>0){
				x=y=0;
				System.out.println(i+"\t");
			}
		}

	}
}