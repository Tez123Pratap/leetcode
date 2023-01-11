class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        if(sentences.length==0)
            return max;
        for(int i=0;i<sentences.length;i++){
            int count=1;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' ')
                    count++;
            }
            if(max<count)
                max=count;
        }
        return max;
    }
}