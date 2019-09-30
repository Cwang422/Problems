/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymergesort;

/**
 *
 * @author Cong Wang
 */
public class MyMergeSort
{

    public static void MergeSort(int[] array, int n)
    {
        if (n < 2)
        {
            return;
        }
        //initialization
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        
        //fill left array
        for(int i = 0; i < mid; i++)
        {
            left[i] = array[i];
        }
        
        //fill the right array
        for(int i = mid; i < n; i++)
        {
            right[i - mid] = array[i];
        }
        //split the left array
        MergeSort(left,mid);
        MergeSort(right,n - mid);
        Merge(array,left,right,mid,n-mid);    
    }
    
    public static void Merge(int[] array, int[] Left, int[] right, int l, int r)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        
        while((i < l) &&(j < r))
        {
            if(Left[i]<right[j])
            {
                array[k++] = Left[i++];
            }
            else
            {
                array[k++] = right[j++];
            }
        }
                
        while(i < l)
        {
            array[k++] = Left[i++];
        }
        while(j < r)
        {
            array[k++] = right[j++];
        }

        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
         int[] actual = { 5, 1, 6, 2, 3, 4 };
         int[] expected = { 1, 2, 3, 4, 5, 6 };
         MergeSort(actual, actual.length);
         for (int i : actual)
         {
             System.out.println(i);
         }
    }
    
}
