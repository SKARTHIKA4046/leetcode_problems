class Solution {
    public int[] transformArray(int[] nums) {
        int dk[]=new int[nums.length];
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                dk[r]=1;
                r++;
            }
            else {
                dk[r]=0;
                r++;
            }
            
        }
        Arrays.sort(dk);
        return dk;
        
    }
}