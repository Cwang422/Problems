class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        int N = nums.length;
        int [] result = new int[N];
        result[0] = nums[0];
        
        for(int i = 1 ;i < N;i++)
        {
            int runningSum = 0;
            for(int j = i ; j >= 0;j--)
            {
                runningSum = runningSum + nums[j];  
            }
            result[i] = runningSum;    
        }
        return result;
    }
}
