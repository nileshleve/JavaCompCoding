

//Store two array of difference between two elements, one  from left and the other from right



import java.io.*;




//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

class CHEFELEC{

	public static void main(String args[]) throws Exception{

		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
		//Scanner in = new Scanner(System.in);

		int t = Integer.parseInt(dis.readLine());
		//int t = in.nextInt();

		StringTokenizer st;
		PrintWriter pw = new PrintWriter(System.out,true);


		while(t-->0){
			int i = 0;
			int sum = 0;
			int nvillage = Integer.parseInt(dis.readLine());
			int evillage[] = new int[nvillage];
			int cvillage[] = new int[nvillage];
			int ret = 0;
			int number = 0;

			// st = new StringTokenizer(dis.readLine()," ");
			// for(i=0;i<nvillage;i++){
			// 	evillage[i] = Integer.parseInt(st.nextToken());

			// }

			i = nvillage;
			number = Integer.parseInt(dis.readLine());
			while (number > 0 && i-- > 0) {
    			evillage[i] = number % 10;
    			number = number / 10;
			}



			st = new StringTokenizer(dis.readLine()," ");
			for(i=0;i<nvillage;i++){
				cvillage[i] = Integer.parseInt(st.nextToken());

			}

			for(i=0;i<nvillage;i++){
				if(evillage[i]==0){
					ret = findclosest(i,nvillage,evillage,cvillage);
					//System.out.println("ret"+ret);
					sum = sum + ret;
					evillage[i] = 1;
				}

			}

			

			System.out.println(sum);

		}
	}
	public static int findclosest(int x,int nvillage,int evillage[],int cvillage[]){
		int foundleft = 0;
		int foundright = 0;
		int i = 0;
		for(i=x-1;i>=0;i--){
			if(evillage[i]==1){
				foundleft=cvillage[x]-cvillage[i];
				//System.out.println("foundleft"+foundleft);
				break;
			}
		}
		for(i=x+1;i<nvillage;i++){
			if(evillage[i]==1){
				foundright=cvillage[i]-cvillage[x];
				//System.out.println("foundright"+foundright);
				break;
			}
		}

		if(foundleft == 0){
			for(i = x+1;i<nvillage;i++){
				evillage[i] = 1;
			}
			return foundright;
		}

		if(foundright == 0){
			for(i=x-1;i>=0;i--){
				evillage[i] = 1;
			}
			return foundleft;
		}

		if(foundleft<foundright){
			for(i=x-1;i>=0;i--){
				evillage[i] = 1;
			}
			return foundleft;
		}
		else{
			for(i = x+1;i<nvillage;i++){
				evillage[i] = 1;
			}
			return foundright;
		}

	}
}
