/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class SNT {
    public static boolean check(int n)
    {
        if ( n < 2) return false;
        else
        {
            for ( int i = 2; i < Math.sqrt(n); i++)
            {
                if ( n % i == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        for ( int i = 10000; i <= 99999; i++)
        {
            if( check(i) == true)
                System.out.println("" + i);
            else
                continue;
        }
    }
}
