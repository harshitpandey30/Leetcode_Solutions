class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
        int r;
        while(x>0){
            r=x%10;
            sum=(sum*10)+r;
            x/=10;
        }
        if (sum!=temp){
            return false;
        }
        else{
            return true;
        }
    }
}