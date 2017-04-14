import java.io.*;
import java.util.*;

class generate0To2ToPowerN{
    public static void main(String args[])throws IOException{
        BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
        String str = dis.readLine();
        int n = str.length();
        subsequences(str, n);
    }

    public static void subsequences(String str, int n){
       /* Number of subsequences is (2**n -1)*/
        int opsize = (int)Math.pow(2, n);
     
        /* Run from counter 000..1 to 111..1*/
        for (int counter = 1; counter < opsize; counter++)
        {
            for (int j = 0; j < n; j++)
            {
                /* Check if jth bit in the counter is set
                    If set then print jth element from arr[] */
                if ((counter & (1<<j)) > 0)
                    System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        } 
    }

}
/*
void printSubsequences(int arr[], int n)
{
    /* Number of subsequences is (2**n -1)
    unsigned int opsize = pow(2, n);
 
    /* Run from counter 000..1 to 111..1
    for (int counter = 1; counter < opsize; counter++)
    {
        for (int j = 0; j < n; j++)
        {
            /* Check if jth bit in the counter is set
                If set then print jth element from arr[] 
            if (counter & (1<<j))
                cout << arr[j] << " ";
        }
        cout << endl;
    }
}
 
// Driver program
int main()
{
    int arr[] = {1, 2, 3, 4};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << "All Non-empty Subsequences\n";
    printSubsequences(arr, n);
    return 0;
}

*/