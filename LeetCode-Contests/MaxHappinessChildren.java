class Solution {
    public long maximumHappinessSum(int[] happiness, int k) 
    {
        Arrays.sort(happiness);
        int j=0;
        int[] temp = new int[happiness.length];
        for(int i=happiness.length-1; i>=0; i--)
        {
            temp[j++]=happiness[i];
        }
        long ans=0;
        for(int i=0; i<temp.length; i++)
        {
            long diff = temp[i]-i;
            if(diff>=0)
                ans+=diff;
            k--;
            if(k<=0)
                break;
        }
        return ans;
    }
}
