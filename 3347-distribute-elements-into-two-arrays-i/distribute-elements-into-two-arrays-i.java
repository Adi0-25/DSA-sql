class Solution {
    public int[] resultArray(int[] nums) {
     List<Integer> n = new ArrayList<>();
     List<Integer> s = new ArrayList<>();
     n.add(nums[0]);
     s.add(nums[1]);
     for(int i = 2;i<nums.length;i++){
        int l1 = n.get(n.size()-1);
        int l2 = s.get(s.size()-1);
        if(l1>l2){
            n.add(nums[i]);
        }else{
            s.add(nums[i]);
        }
     }
     int[] r = new int[nums.length];
     int id = 0;
     for(int val:n){
        r[id++]=val;
     }
     for(int val:s){
        r[id++] = val;
     }
     return r;
    }
}