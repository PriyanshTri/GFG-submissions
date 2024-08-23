//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] lcmAndGcdArr= new Long[2];
        lcmAndGcdArr[1] = gcdMeth(A, B);
        lcmAndGcdArr[0] = (A*B)/lcmAndGcdArr[1];
        return lcmAndGcdArr;
    }
    static long gcdMeth (long a, long b) {
        if(a%b==0)
        return b;
        return gcdMeth(b,a%b);
    }
};