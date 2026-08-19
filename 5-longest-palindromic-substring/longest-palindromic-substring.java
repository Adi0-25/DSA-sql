class Solution {
    public String longestPalindrome(String s) {
         if(s==null||s.length()<1) return "";
         int st =0;
         int en = 0;
         for(int i =0;i<s.length();i++){
            int len1 = exp(s,i,i);
            int len2 = exp(s,i,i+1);
            int max = Math.max(len1,len2);
            if(max>en-st){
                st = i-(max-1)/2;
                en = i+max/2;
            }
         }
            return s.substring(st,en+1);
        }
        private int exp(String s,int l,int r){
            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
                l--;
                r++;

            }
            return r-l-1;
        }
    }
