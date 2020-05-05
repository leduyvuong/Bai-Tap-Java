/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class SntTong {
    public static boolean check(int k)
    {
        if ( k < 2) return false;
        
        else
        {
            for( int i = 2; i <= Math.sqrt(k); i++)
            {
                if ( k % i == 0 ) return false;
            }
        }
        return true;
    }
    public static int tong(int n)
    {
       int tong = 0, temp =0; 
       int i = 10;
       while( n > 0)
       {
        temp = n % i;
        tong+=temp;
        n = n / i;
       }
       return tong;
    }
    public static void main(String[] args) {
        int k = 26227;
        int S = 19;
        if ( check(k) && tong(k) == S)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
             
    }
}
