class Solution
{
    public int smallestRangeI(int[] A, int K) 
    {
        //max(A) - min(A) - 2k
        int min = A[0];
        int max = A[0];
        for(int a : A)
        {
            min = Math.min(a,min);
            max = Math.max(a,max);
        }
        return Math.max(max - min - 2*K,0);
    }
}
