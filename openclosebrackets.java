import java.util.Scanner;

public class openclosebrackets{

private static void parComb(int n, int m , String par){

if(n==0 && m==0){
System.out.println(par);
}

if(n>0){
parComb(n-1,m+1,par+"(");
}

if(m>0){
parComb(n,m-1,par+")");
}

}

public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the parenthesis");
String par="";
int n = in.nextInt();
parComb(n,0,"");
}
}