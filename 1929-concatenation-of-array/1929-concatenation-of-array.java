class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        int k=0;
        for(int i=0;i<ans.length;i++){
            if(k<n){
                ans[i]=nums[k];
                ++k;
            }else{
                k=0;
                ans[i]=nums[k++];
            }
        }
        return ans;
    }
}