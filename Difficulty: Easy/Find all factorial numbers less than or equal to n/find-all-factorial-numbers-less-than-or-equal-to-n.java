//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        //never use static variables
        ArrayList<Long> output = new ArrayList<>(Arrays.asList(1L));
        // we can pass output array and update it according to our usecase
        getFacts(n, 1, output);
        return output;
    }

    static void getFacts(long n, long i, ArrayList<Long> output) {
        // base case needs to be specific and more accurate
        if (output.isEmpty() || output.get(output.size() - 1) > n) return;
        // if recieving end is larger variable type then addition or subtraction, then autobox will work
        long value = (i + 1) * output.get((int)(i-1));
        
        if (value <= n) {
            // add the value in output array(array recieved from outside)
            output.add(value);
            // recursive call to go to base case (to avoid TLE and give proper output)
            getFacts(n, i + 1, output);
        }
    }
}