class Solution 
{
    public int maximumWealth(int[][] accounts) 
    {
        //sort the account
        int N = accounts.length;
        int[] sum = new int[N];
        //add the coordinates
         for (int i = 0; i < N; ++i)
         sum[i] = sumCoord(accounts[i]);
         Arrays.sort(sum);
         return sum[N-1];
        
    }
    public int sumCoord(int[] accounts) 
    {
        int runningSum = 0;
            for(int i = 0; i < accounts.length;i++)
            {
                runningSum = runningSum + accounts[i];
            }
        return runningSum;
    }
}
