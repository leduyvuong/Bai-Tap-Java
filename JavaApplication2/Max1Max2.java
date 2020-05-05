
import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class Max1Max2 {
    public static void xuat(ArrayList a)
    {
        for( int i = 0; i < a.size(); i++)
        {
            System.out.print( a.get(i) + " ");
        }
        System.out.println("");
    }
    public static void max(int[] a, int h)
    {
        int max = a[0];
        int k = 0;
        for ( int i = 0; i < a.length; i++)
        {
            if ( max < a[i])
            {
                max = a[i];
                k = i;
            }
        }
        System.out.println(" Lon thu" + h + " la " +max);
        System.out.println(" Vi tri la" + k);
        a[k] = min(a);
        
    }
    public static int min(int[] a)
    {
        int min = a[0];
        for ( int i = 0; i < a.length; i++)
        {
            if ( min > a[i])
            {
                min = a[i];
            }
        }
        return min;
    }
    public static void them(int x, ArrayList<Integer> b, ArrayList<Integer> c)
    {
        int h = 0;
        if ( x > b.get(0))
        {
            c.add(x);
            for (int i = 0; i < b.size(); i++)
            {
                c.add(b.get(i));
            }
        }
        else if ( x < b.get(b.size()-1))
        {
            for (int i = 0; i < b.size(); i++)
            {
                c.add(b.get(i));
            }
            c.add(x);
        }
        else
        {
            for ( int i = 0 ; i < b.size()  ; i++)
            {
                
                if ( b.get(i) < x && h == 0)
                {
                    h++;
                    System.out.println("h " + h);
                    c.add(x);
                    c.add(b.get(i));
                    System.out.println("I" + i+ " C" + c.get(i));
                }
                else
                {
                    c.add(b.get(i));
                    System.out.println("I" + i + " C[i] = "+ c.get(i));
                }
            
            }
        }    
        xuat(c);
    }
    public static void bubleSort(ArrayList<Integer> a)
    {
        for( int i = 0; i < a.size() - 2; i++)
        {
            for(int j = a.size() - 1; j > i; j--)
            {
               if ( a.get(j) > a.get(j-1))
               {
                   int temp = a.get(j);
                   a.set(j, a.get(j-1));
                   a.set(j-1, temp);
               }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {5, 2, 1, 9};
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for( int i = 0; i < a.length; i++)
        {
            b.add(a[i]);
        }
        max(a, 1);
        max(a, 2);
        bubleSort(b);
        xuat(b);
        them(10, b, c);
    }
}
