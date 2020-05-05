/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class MaTran1 {
    public static void xuat(int[][] a,int n, int m)
    {
        
        for ( int i = 0; i < n; i++)
        {
            for ( int j = 0; j < m; j++)
            {
                System.out.print( a[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static boolean check(int n)
    {
        if ( n < 2) return false;
        else
        {
            for ( int i = 2; i <= Math.sqrt(n); i++)
            {
                if ( n % i == 0) return false;
            }
        }
        return true;
    }
    public static void max(int n, int m)
    {
        int[][] a = new int[n][m];
        int h = 0, c = 0;
        int max = a[0][0];
        for ( int i = 0; i < n; i++)
        {
            for ( int j = 0; j < m; j++)
            {
                if ( max < a[i][j])
                {
                    max = a[i][j];
                    h = i;
                    c = j;
                }
            }
        }
        System.out.println("Max =" + max);
        System.out.println("Vi tri cua Max o hang " + h + " cot " + c );
    }
    public static void bubbleSort(int[][] a,int n, int m)
    {
        
        for ( int h = 0; h < m; h++)
        {
            for ( int i = 0; i < n - 2; i++)
            {
                for ( int j = n - 1; j > i; j-- )
                {
                    if ( a[j][h] < a[j-1][h])
                    {
                        int temp = a[j][h];
                        a[j][h] = a[j-1][h];
                        a[j-1][h] = temp;
                    }
                }
            }
        }
        xuat(a, n, m);
    }
    public static void checkSNT(int[][] a, int n, int m)
    {
        for ( int i = 0; i < n; i++)
        {
            for ( int j = 0; j < m; j++)
            {
                if ( check(a[i][j]) == false)
                {
                    a[i][j] = 0;
                }
            }
        }
        xuat(a, n, m);
    }
    public static void main(String[] args) {
        int[][] a = {{1, 3}, {7,2}, {4, 10}, {6, 9}};
        bubbleSort(a,4, 2);
        System.out.println("-----------------------");
        checkSNT(a, 4, 2);
    }
}
