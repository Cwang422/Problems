class Solution 
{
    public boolean checkStraightLine(int[][] coordinates)
    {
        
        int N = coordinates.length;
        //check the slope of the line
        //get initial slope
        double slope = getSlope(coordinates[0],coordinates[1]);
        for(int i = 0 ; i < N -1 ;i++)
        {
            if(getSlope(coordinates[i],coordinates[i+1])!=slope)
            {
                return false;
            }
        }
        return true;
        
    }
    public double getSlope(int[] point1,int[] point2)
    {
        double slope = 0.0;
        if(point1[0] == point2[0])
        {
             slope = 0.0;    
        }
        else if(point1[1] == point2[1])
        {
             slope = 1.0;    
        }
        else
        {
              slope = (point1[1] - point2[1])/(double)(point1[0]-point2[0]);
        }
        return slope;
    }
}
