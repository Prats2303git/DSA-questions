class Solution {
    public int[] resultArray(int[] nums) 
    {
        int n = nums.length;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] res = new int[n];
        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int i=2; i<n; i++)
        {
            if(list1.get(list1.size()-1)>list2.get(list2.size()-1))
                list1.add(nums[i]);
            else
                list2.add(nums[i]);
        }
        list.addAll(list1);
        list.addAll(list2);
        for(int i=0; i<list.size(); i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}
