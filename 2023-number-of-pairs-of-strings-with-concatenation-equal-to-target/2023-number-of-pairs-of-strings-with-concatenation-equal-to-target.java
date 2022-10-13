class Solution {
    public int numOfPairs(String[] nums, String target) {
        int a=nums.length;
        int count1=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if((nums[i]+nums[j]).equals(target) && i!=j){
                    count1=count1+1;
                }
            }
        }
        return count1;
    }
}