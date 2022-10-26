class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n=coordinates.length;
        int a=(coordinates[1][0] - coordinates[0][0]);
        int b=(coordinates[1][1] - coordinates[0][1]);
        for(int i=2;i<n;i++){
            int c=(coordinates[i][0]-coordinates[i-1][0]);
            int d=(coordinates[i][1]-coordinates[i-1][1]);
            if(b*c!=a*d){
            return false ;
            }
        } 
        return true;
    }
}