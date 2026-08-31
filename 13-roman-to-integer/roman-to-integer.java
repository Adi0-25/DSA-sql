class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> values = new HashMap<>();
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);
     int t=0;
     for(int i =0;i<s.length();i++){
        int curr = values.get(s.charAt(i));
        if(i+1<s.length()){
           int n = values.get(s.charAt(i+1));
           if(curr<n)
           {
            t-=curr;
           }else{
            t += curr;
           }
        }else {
            t+=curr;
        }
     }
  return t;
    }
}