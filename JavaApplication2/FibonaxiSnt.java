/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class FibonaxiSnt {
    public static void xuat ( int[] a, int n)
    {
        for ( int i = 0; i < n; i++)
        {
            System.out.println(" " + a[i]);
        }
    }
    public static boolean check(int n)
    {
        if ( n < 2) return false;
        else
        {
            for ( int i = 2; i <= Math.sqrt(n); i++)
            {
                if ( n % i == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void fibonaci(int[] f,int n)
    {
        f[0] = 1;
        f[1] = 1;
        for ( int i = 2; i < n; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }
        xuat(f, n);
    }
    public static void main(String[] args) {
        int n = 5;
        int[] f = new int[n];
        if ( check(n) == true)
        {
            fibonaci(f, n);
        }
        else
        {
            System.out.println("n kp snt");
        }
    }
    
}
