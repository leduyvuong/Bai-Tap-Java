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
public class fibonasi {
    public static int nhap()
    {
        int n=0;
        boolean check=false;
        Scanner input= new Scanner(System.in);
        while(!check)
        {
            System.out.println(" ");
            try{
                n=input.nextInt();
                
                check =true;
            }catch(Exception e){
                System.out.println("Nhap lai n");
                input.nextInt();
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("nhap n");
        n=nhap();
        int [] f= new int[n+1];
        f[0]=1;f[1]=1;
            for(int i = 2; i <= n; i++)
            {
                f[i]=f[i-1]+f[i-2];
            }
        System.out.println("Fibonaxi thu n " + f[n]);
    }
    
}
