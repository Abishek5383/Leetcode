class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
       int t=k%n;
        int temp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[(t+i)%n]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
    }
}