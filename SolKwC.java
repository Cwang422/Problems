class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        
        int N = candies.length;
        int max = getMax(candies);
        //declare list of boolean
        List<Boolean> result = new ArrayList<Boolean>(N);
        //check the elements in candies
        for(int i = 0; i < N;i++)
        {
            if((candies[i] + extraCandies) >= max)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        
        return result;
    }
    // Method for getting the minimum value
  public static int getMax(int[] inputArray)
  { 
    int maxValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++)
    { 
      if(inputArray[i] > maxValue)
      { 
        maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  } 
}
