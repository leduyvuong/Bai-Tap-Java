
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class DemKiTu {
    public static void xuat(String[] a)
    {
        for ( int i = 0; i < a.length; i++)
        {
            System.out.println(" " + a[i]);
        }
    }
    public static String format(String a)
    {
        String a3 = "";
        String[] a1 = a.toLowerCase().split("");
        a1[0] = a1[0].toUpperCase();
        for ( int i = 0; i < a1.length; i++)
        {
           a3 +=a1[i];
        }
        
        return a3;
    }
    public static void main(String[] args) {
        String a = "  trUoNg hoc  mMm oOo ";
        
//        System.out.println(" " +a.toLowerCase());
//        char[] b = a.toLowerCase().toCharArray();
//        xuat(b);
        int dem = 0;
        String a3 = "";
//        char b3 = b[0];
//        String b1 = Character.toString(b3);
//     
//        String b2 = b1.toUpperCase();
//        System.out.println("" + b2);
        String[] a1 = a.split(" ");
        xuat(a1);
        a3 = format(a1[0]);
        for ( int i = 1; i < a1.length; i++)
        {
            
            if(!"".equals(a1[i]))
            {
                a3 += " " + format(a1[i]);
            }
            
        }
        System.out.println(a3);
        
    }
}
