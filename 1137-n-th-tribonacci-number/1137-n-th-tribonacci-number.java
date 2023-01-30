class Solution {
    public int tribonacci(int n) {
        int[]F=new int[41];
        F[0]=0;F[1]=F[2]=1;
        int j=3;
        for(int i=0;i<=n;i++){
            F[j++]=F[i]+F[i+1]+F[i+2];
            
        }
        return F[n];
    }
}