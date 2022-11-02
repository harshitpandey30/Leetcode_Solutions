class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
       /* int count=1;
        for(int i=1;i<=n;i++){
            count=count*i;
            
        }
         count=count;
        return count;*/
        int a =0;
        int b=1;
        int sum =0;
        for(int i=0;i<n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}