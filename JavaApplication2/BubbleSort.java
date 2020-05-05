/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class BubbleSort {
    
    public static int[] bubbleSort(int[] a)
    {
        for ( int i = 0; i < a.length - 2 ; i++)
        {
            for ( int j = a.length - 1; j > i  ; j--)
            {
               
                if ( a[j] < a[j-1])
                {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    
                }
            }
        }
        return a;
    }
    public static void in(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(" "+ a[i]);
        }
    }
    public static void main(String[] args) {
        int[] a = { 2, 2, 3, 0, 3, 1};
        int[] result = bubbleSort(a);
            
        in(result);
    }
}
