class Solution {
    public int maxSubArray(int[] nums) {
    int n = nums.length;
     int r = 0;
     int sum =0;
     int Maxs =Integer.MIN_VALUE;
    while(r<n){
        sum = sum + nums[r];
        r++;
        Maxs=Math.max(sum,Maxs);
        if(sum<0){
            sum =0;
        }
    }
       return Maxs;  
    }
    }