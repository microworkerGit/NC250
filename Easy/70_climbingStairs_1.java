class Solution {
    public int climbStairs(int n) {

        int ans= recursion(n);
        return ans;

    }

    private int recursion(int n) {

            if(n>1) { 
                n = recursion(n-1)+recursion(n-2);             
            }
            else {
                n=1;
            }

            return n;
        }
}
