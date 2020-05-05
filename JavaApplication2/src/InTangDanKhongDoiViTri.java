/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class InTangDanKhongDoiViTri {
    public static int max(int[] a)
    {
        int max = a[0];
        for ( int i = 0; i < a.length; i++ )
        {
            if ( a[ i ] > max)
            {
                max = a[i];
            }
        }
        return max;
    }
    public static void xuat(int[] a)
    {
        for ( int i = 0; i < a.length; i++)
        {
            System.out.println(" " + a[i]);
        }
    }
    public static int min(int[] a)
    {
        int k = 0;
        int min = a[0];
        for ( int i = 0; i < a.length; i++)
        {
            if( a[i] < min)
            {
                min = a[i];
                k = i;
            }
        }
        return k;
    }
    public static void in(int[] a)
    {
       int k = min(a);
       int max = max(a);
       if(a[k] == max ) System.out.println(" " + a[k]);
       else
       {
       System.out.println(" " + a[k]);
       a[k] = max;
       in(a);
       }
    }
    public static void main(String[] args) {
        int[] a = { 1, 2, 8, 7, 9, 3}; 
        in(a);
    }
}
