class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int i=0,j=0,countlen=0,zeroes=0;
        while(i<nums.length)
        {
            if(nums[i]==0)
            zeroes++;

            while(zeroes>k)
            {
                if(nums[j]==0)
                zeroes--;
                j++;
            }
            countlen = Math.max(countlen,i-j+1);
            i++;
        }
        return countlen;
    }
}
