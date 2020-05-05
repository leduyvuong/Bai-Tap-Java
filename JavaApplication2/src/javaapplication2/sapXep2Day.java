/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Hi-XV
 */
public class sapXep2Day {
    public static int nhap(){
        Scanner input= new Scanner(System.in); 
        boolean check= false; 
        int n=0; 
        while(!check){
            System.out.print(" "); 
            try{
                n= input.nextInt(); 
                check= true;
            }catch(Exception e){
                    System.out.println("Ban phai nhap so! hay nhap lai..."); 
                    input.nextLine();
                       }
                }
                return (n);
    }
    public static int[] sapXep(int[] a, int[] b, int[] c)
    {
        int dem = 0;
        int count = 0;
        if(a[0] < b[0])
        {
            c[0] = a[0];
        }
        else
        {
            c[0] = b[0];
        }
        for(int i = 0; i < a.length; i++)
         {
             for(int j = 0; j < b.length; j++)
             {
                 if(a[i] < b[j])
                 {
                     c[dem] = a[i];
                     dem++;
                     break;
                 }
                 else
                 {
                     c[dem] = b[j];
                     dem++;
                 }
//                 if(a[i] < b[j] && a[i] > b[j-1])
//                 {
//                     c[dem] = a[i];
//                 }
//                 else if(a[i] < b[j-1])
//                 {
//                     
//                 }
//                     c[count + i] = 9;
                 
             }
//             c[dem] = a[i];
//             dem++;
         }
        return c;
    }
    public static void reSult(int a[])
    {
        System.out.println();
        for(int i =0; i < a.length ;i++)
        {
            System.out.print(" "+a[i]);
           System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[] a = new int[4];
        int[] b = new int[4];
        int[] c = new int[6];
        int[] m = {1, 3, 5};
        int[] n = {2, 4, 6}; 
        sapXep(m, n, c);
        reSult(c);
    }
}
