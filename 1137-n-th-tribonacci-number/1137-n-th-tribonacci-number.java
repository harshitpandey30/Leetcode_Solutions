class Solution {
    public int tribonacci(int n) {
        if (n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return (1);
        }
        int a = 0, b = 1, c = 1;  
        int d = a + b + c;  
        for(int i=4; i<=n; i++){    
            a=b;  
            b=c;  
            c=d;  
            d=a+b+c;  
        }  
        return d;  
        }
    }
