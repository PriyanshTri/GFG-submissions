//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int isPrime(int N){
        if(N==1) return 0;
        int counter = 0;
        for(int i=1;i<=Math.sqrt(N);i++) {
            if(N%i ==0 ){
                counter++;
                if((N%i) != i) {
                    counter++;
                }
            }
        }
        return counter==2 ? 1: 0;
    }
}