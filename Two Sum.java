class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] x = new int[2];
        for(int i=0; i<nums.length-1; i++){
            for(int j=1; j<nums.length; j++){
                if(i==j){
                    continue;
                } else if(target == nums[i]+nums[j]){
                    x[0] = i;
                    x[1] = j;
                    break;
                }
            }
        }
        return x;
    }
}
