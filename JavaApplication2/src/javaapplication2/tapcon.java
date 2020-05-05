
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Hi-XV
 */
public class tapcon {
    public static int nhap()
    {
        int n=0;
        Scanner input= new Scanner(System.in);
        boolean check = false;
        while(!check)
        {
            try{
                n=input.nextInt();
                check=true;
            }catch (Exception e)
            {
                System.out.println("Nhap lai n");
                input.nextInt();
            }
        }
        return n;
    }
    public static void reSult(int a[],int k)
    {
        System.out.println();
        for(int i =1; i<=k ;i++)
        {
            System.out.print(" "+a[i]);
           System.out.println("");
        }
    }
   
    public static void try_backTrack(int a[],int n, int k,int i)
    {
        // a[] rong array[] 1-n
        int j;
        for(j=a[i-1]+1; j<=(n-k+i); j++)
        {
            a[i]=j;
            if(i==k) reSult(a, k);
            else try_backTrack(a, n, k, i+1);
            
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhap n");
        int n = 3 ;
        int[] array = new int[n+1];
        int k = 2;
        System.out.println("Liet ke cac  tap con co k phan tu cua 1,2,.. "+n +"la" +"\n");
        int count=1;
        System.out.println("Tap con co 2 phan tu");
           // try_backTrack(array, n, 2, 1);
        for(int i = 1; i <= n - k + count; i++) // n =6 i <= 5 n-k+count + 1
        {
//                    System.out.println("i="+i);
//                    for(int v = 0; v < array.length; v++)
//                    {
//                        System.out.println(" "+array[v]);
//                    }
                   
            array[count]=i;
            
            if(count == k) reSult(array, k);
            else
            {
                for(int j = i+1; j <= n-k+count+1; j++ )
                {
//                    System.out.println("j=" +j);
//                    for(int m = 0; m < array.length; m++)
//                    {
//                        System.out.println(" "+array[m]);
//                    }
                    array[count+1]=j;
                    if(count +1 == k) reSult(array, k);
                    else 
                        for(int r = i+2; r <= n-k+count+1; r++)
                        {
                            array[count +2 ]=r;
                            if(count +2 == k) reSult(array, k);
                        }
                    
                      
                    
            }
        }
    }
    }
}