/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class TongPhantichSnt {
    public static boolean check(int n)
    {
        if (  n < 2) return false;
        else
        {
            for ( int i = 2; i <= Math.sqrt(n); i ++)
            {
                if ( n % i == 0) return false;
            }
        }
        return true;
    }
    public static int tong(int n)
    {
        int tong = 0;
        int temp = 0;
        int i = 10;
        while( n > 0)
        {
            temp = n % 10;
            tong += temp;
            n = n/10;
        }
        return tong;
    }
    public static void phanTich(int n)
    {
        int i = 2;
        while ( n > 1)
        {
            
            if ( check(i) == true && n % i == 0)
            {
                System.out.print(i + "*");
                n = n / i;
                System.out.println("i =" + i + " n =" + n);
            }
            else 
            {
                i++;
            }
            
            
        }
    }
    public static void main(String[] args) {
        int n = 1443;
        if ( check(n) == true)
        {
            System.out.println("n la SNT");
        }
        System.out.println(" Tong =" +tong(n));
        phanTich(n);
        
    }
    
}
