class Solution {
    public int lengthOfLastWord(String s) {
      int c=0;
     s= s.trim();
     if(!s.isEmpty()){
        String[] a=s.split("\\s+");
        String r=a[a.length-1];
        for(int i=0;i<r.length();i++){
            c=c+1;
        }
     }
        return c;
    }
}