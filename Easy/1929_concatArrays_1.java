class Solution {
    public int[] getConcatenation(int[] nums) {

        int size= 2* nums.length;
        int[] ans= new int[size];
        int j=0;
        int y=0;
        for(int i=0; i< ans.length ; i++ ) {

            if(i< nums.length) {
                 ans[j]= nums[i];
            }
            if(j>=nums.length && y<nums.length) {
                ans[j]= nums[y]; 
                y++;
            }
            j++;
        }
        return ans;
    }
}
