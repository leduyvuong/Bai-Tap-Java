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
public class hoanvi {
    public static int nhap()
    {
        int n=0;
        boolean check = false;
        Scanner input=new Scanner(System.in);
        try{
            n=input.nextInt();
            check=true;
            
        }catch (Exception e)
        {
            System.out.println("Nhap lai so");
            input.nextInt();
        }
        return n;
    }
    
         
}
