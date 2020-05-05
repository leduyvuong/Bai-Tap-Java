
import sun.security.util.Length;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class hoanvi {
    public static int[] n = {1, 2, 3, 4, 5};
    public static int[] congChuoi(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = a.length; j < c.length; j++) {
            c[j] = b[j - a.length];
        }
        return c;
    }
    public static int[] hoanVi1(int[] n)
    {
        int[] result = new int[n.length - 1];
        int[] a = new int[n.length];
        int temp = 0;
    
        for(int i=0; i< n.length; i++)
       {
           a[0] = n[i]; // n1 = a[0]  
           //n[0] = 
           temp = n[0]; // n[0] = te
           //n[0] = 0
           a[i] = temp; // te = a[1]
           // a[]
           for(int j = 1; j < n.length; j++)
           {
               if(j == i)
               {
                   continue;
               }
               a[j] = n[j];
           }
       }
//        
//        for (int k = 0; k < result.length; k++) {
//            result[k] = a[k + 1];
//        }
        return a;
    }
    public static int[] hoanVi2(int[] n)
    {
        int[] result = new int[n.length];
        int temp = 0;
    
        for(int i=0; i< n.length; i++)
       {
           result[0] = n[i]; // n1 = a[0]  
           //n[0] = 
           temp = n[0]; // n[0] = te
           //n[0] = 0
           result[i] = temp; // te = a[1]
           // a[]
           for(int j = 1; j < n.length; j++)
           {
               if(j == i)
               {
                   continue;
               }
               result[j] = n[j];
           }
       }
        return result;
    }
    public static void in(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(" "+a[i]);
        }
    }
    

    public static void main(String[] args) {
       int[] a = new int[n.length ];
       int[] b = new int[n.length ];
       int[] c = new int[n.length ];
       int[] result = new int[n.length];
       int temp = 0;
       
        for (int m = 0; m < n.length; m++) {
            
            in(hoanVi1(n));
            System.out.println("");
//            if(m < n.length - 1) {
//                int[] a1 = hoanVi1(n);
//                
//            }
        }
       
       for(int i=0; i< n.length; i++)
       {
           a[0] = n[i]; // n1 = a[0]  
           //n[0] = 4
           temp = n[0]; // n[0] = te
           //n[0] = 0
           a[i] = temp; // te = a[1]
           // a[]
           for(int j = 1;j< a.length; j++)
           {
               if(j == i)
               {
                   continue;
               }
               a[j] = n[j];
           }
           // 2 3 4 5
           b[0]=a[0];
          
           for(int t = 1; t < a.length; t++ )
           {
               b[1]=a[t];
               temp = a[1];
               b[t] = temp;
               for(int h = 2; h < b.length; h++) 
               {
                   if(h == t)
                   {
                       continue;
                   }
                   b[h] = a[h];                   
               }
               c[0]=a[0];
               c[1]=b[1];
               for (int p = 2; p < b.length; p++ )
               {
                   c[2] = b[p];
                   temp = b[2];
                   c[p] = temp;
              
                   for(int q = 3; q < c.length; q++)
                    {
                        if(q == p)
                        {
                            continue;
                        }
                        c[q] = b[q];
                    }
                    in(c);
                    System.out.println("");

                    temp = c[c.length-1];
                    c[c.length-1] = c[c.length-2];
                    c[c.length-2] = temp;
                    in(c);
                    System.out.println("");
               }
                
           }
       }
      
   }
 
}
