class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        int k=0;
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[k++];
            if(k>n-1) k=0;
        }
        return ans;
    }
}