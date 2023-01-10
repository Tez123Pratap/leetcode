class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[]ans=new int[2*n];
        int j=0,k=n;
        for(int i=0;i<nums.length;i++){
            if(i%2==0 && k<2*n)
                ans[i]=nums[j++];
            else
                ans[i]=nums[k++];
        }
        return ans;
    }
}