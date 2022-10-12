//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    boolean fascinating(long n) {
        // code here
         String s1=""+n;
        String s2=""+n*2;
        String s3=""+n*3;
        String sample="123456789";
        String temp=s1+s2+s3;
        char[] charA=temp.toCharArray();
        Arrays.sort(charA);;
        String string = new String(charA);
        if(string.equals(sample))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}