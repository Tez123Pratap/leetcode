class Solution {
    public String defangIPaddr(String address) {
        String str="";
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            if(ch=='.'){
                str=str+"["+ch+"]";
            }else{
                str=str+ch;
            }
        }
        return str;
    }
}