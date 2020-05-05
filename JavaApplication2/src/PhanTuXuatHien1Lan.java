/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class PhanTuXuatHien1Lan {
    public static void check(int[] a)
    {
        int dem = 0;
        for ( int i = 0; i < a.length; i++)
        {
            for ( int j = 0; j < a.length; j++)
            {
                if( a[i] == a[j])
                {
                    dem++;
                }
            }
            if(dem == 1)
            {
                System.out.print(a[i] + " ");
            }
            dem = 0;
        }
    }
    public static void main(String[] args) {
        int[] a = { 2, 2, 5, 4, 5, 6};
        check(a);
        System.out.println("");
    }
}
