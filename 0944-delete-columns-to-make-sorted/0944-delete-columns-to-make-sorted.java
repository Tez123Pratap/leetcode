class Solution {
    public int minDeletionSize(String[] strs) {
        int deleteCol=0;
        int n=strs[0].length();
        
        for(int col=0;col<n;col++){
            for(int row=1;row<strs.length;row++){
                if(strs[row].charAt(col)<strs[row-1].charAt(col)){
                    deleteCol++;
                    break;
                }
            }
        }
        return deleteCol;
    }
}