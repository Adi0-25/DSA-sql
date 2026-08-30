class Solution {
    public int maxRepeating(String sequence, String word) {
       int k =0;
       String rep = word;
       while(sequence.contains(rep)){
        k++;
        rep += word;
       }
       return k;
}
}