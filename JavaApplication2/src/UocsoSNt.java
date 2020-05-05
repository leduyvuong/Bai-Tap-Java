/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class UocsoSNt {
    public static void xuat( int[] a, int n)
    {
        for( int i =0; i < n; i++)
        {
            System.out.println("" +a[i]);
        }
    }
    public static boolean check(int n)
    {
        if ( n < 2 ) return false;
        else
        {
            for ( int i = 2; i <= Math.sqrt(n); i++)
            {
                if ( n % i == 0) return false;
            }
        }
        return true;
    }
    public static void uocN(int n)
    {
        int dem = 0;
        
        for ( int i = 1; i <= n; i++)
        {
            if ( n % i == 0 )
            {
                if(check(i) == true)
                {
                    System.out.println(" " + i);
                }
                dem++;
            }
        }
        System.out.println(" co "  + dem + " uoc ");
        
    }
    public static void main(String[] args) {
        int n = 173;
        uocN(n);
        
    }
}
