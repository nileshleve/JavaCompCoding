import java.io.*;
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

class EGRANDR{
	public static void main(String args[]) throws Exception{

		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
		//Scanner in = new Scanner(System.in);

		int t = Integer.parseInt(dis.readLine());
		//int t = in.nextInt();

		StringTokenizer st;
		PrintWriter pw = new PrintWriter(System.out,true);


		while(t-->0){
			int i = 0;
			//int flag3 = 0;
			//try{
			int nsub = Integer.parseInt(dis.readLine());
			//int nsub = in.nextInt();
			 		
			// }
			// catch(NumberFormatException e){
			// 	System.out.println("No");
			// 	continue;
			// }

			// if(nsub == 0){
			// 	// System.out.println("No");
			// 	// break;
			// 	flag3 =1;
			// }
			int grades[] = new int[nsub];
			int flag1 = 0;
			int flag2 = 0;
			float sum = 0;
			//float avg = 0f;

			st = new StringTokenizer(dis.readLine()," ");					//Using StringTokenizer improved pperformance a lot
			
			for(i = 0;i < nsub;i++){

				//grades[i] = Integer.parseInt(dis.readLine());
				
				grades[i] = Integer.parseInt(st.nextToken());

				//grades[i] = in.nextInt();
				sum = sum + grades[i];
				if(grades[i] <= 2){
					flag1 = 1;
					//break;
				}
				if(grades[i] == 5 && flag2 == 0){
					flag2 = 1;
				}
			}
			if(nsub != 0){
				sum = sum/nsub;
			}
			//grades[] = 0;
			if(sum >= 4 && flag1 ==0 && flag2 == 1){
				System.out.println("Yes");

			}
			else{
				System.out.println("No");
	
			}
			
		}

	}

}

