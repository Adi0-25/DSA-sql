class Solution {
    public long countSubstrings(String s, char c) {
        int n = s.length();
        long max =0;
        long cc = 0;
        for(int i =0;i<n;i++){
            if(s.charAt(i)==c){
               cc++;
               max = max + cc ;
           }
        }
        return max;
    }
}