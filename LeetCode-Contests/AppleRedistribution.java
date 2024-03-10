class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) 
    {
        Arrays.sort(capacity);
        int sum=0,check=0,count=0;
        for(int i=0; i<apple.length; i++)
        {
            sum+=apple[i];
        }
        for(int i=capacity.length-1; i>=0; i--)
        {
            check+=capacity[i];
            count++;
            if(check>=sum)
                break;
        }
        return count;
    }
}
