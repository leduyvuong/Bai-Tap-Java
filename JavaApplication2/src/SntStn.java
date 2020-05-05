/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
import java.util.ArrayList;
public class SntStn {
    public static void xuat(ArrayList a)
    {
        for ( int i = 0; i < a.size(); i++)
        {
            System.out.println(" " +a.get(i));
        }
    }
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
    public static boolean soThuanNghich(int n, ArrayList a)
    {
        
        for ( int i = 0; i <= a.size()/2; i++)
        {
            if ( a.get(i) != a.get(a.size() -1 - i))
            {
                return false;
            }
            
        }
        return true;
    }
    public static ArrayList phanTich(int i, ArrayList a)
    {
        
        while( i > 0)
        {
            a.add(i % 10);
            i/=10;
            
        }
//        xuat(a);
//        System.out.println("");
        return a;
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList();
        
        for ( int i = 10000; i < 10000000; i++)
        {
            phanTich(i, a);
            if ( check(i) == true && soThuanNghich(i, a) == true)
            {
                System.out.println(" " + i);
                a.clear();
            }
            else
            {
                a.clear();
                
                
            }
            
        }
    }
}
