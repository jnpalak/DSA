class Solution {
    public int[] sortArray(int[] nums)
     {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int index = 0;
        for (int num = min;num <= max;num++) 
        {
            while (map.getOrDefault(num,0)>0) 
            {
                nums[index++] = num;
                map.put(num, map.get(num) - 1);
            }
        }
        return nums;
    }
}
