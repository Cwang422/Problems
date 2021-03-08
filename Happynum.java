class Solution 
{
    public boolean isHappy(int n) 
    {
        boolean result = true;
        List<Integer> digits = new ArrayList<Integer>();
        if(n == 1)
        {
            result = true;
        }
        else
        {
            
        digits = convert(n);
        int counter = 1;
        while((process(digits) != 1)&&(counter<=100))
        {
            digits = convert(process(digits));
            counter++;
            if(counter == 90)
            {
                result = false;
                break;
            }
        }   
        }
        
        return result;
    }
    
    public int process(List<Integer> digits)
    {
        int sum = 0;
        for(int num : digits)
        {
            sum = sum + (int)Math.pow(num, 2);
        }
        return sum;
    }
    public List convert(int n)
    {
        List<Integer> digits = new ArrayList<Integer>();
        while (n > 0) 
        {
            digits.add(n % 10);
            n = n / 10;
        }
        return digits;
    }
}
