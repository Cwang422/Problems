/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookinterview;

/**
 *
 * @author 14379
 */

class FaceBookInterview
{
	static int[] preSum; 
	public FaceBookInterview(int[] arr)
        {
            preSum = new int[arr.length + 1];
            for(int i = 1 ; i < preSum.length ; i++)
            {
                if(arr[i-1] == 1)
                    preSum[i] = preSum[i-1] + 1;
                else
                    preSum[i] = preSum[i-1];
            }
	}

	/**
	* Returns number of 1's in the range [start, end].
	*/
	public int howManyOnesInRange(int start, int end)
        {
            
            return preSum[end + 1] - preSum[start];
	}

        public static void main(String[] args)
        {
        // TODO code application logic here
            FaceBookInterview FI = new FaceBookInterview(new int[]{0,1,1,1,0,0});
            System.out.println(FI.howManyOnesInRange(0, 2));
            
            
        }

    /**
     * @param args the command line arguments
     */
   
    
}
