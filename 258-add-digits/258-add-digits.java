class Solution {
    public int addDigits(int num) {
        int sum=num;
        while(sum>9){
            int n=sum;
            sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
        }
        return sum;
    }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     System.out.println(addDigits(num);
    // }
}