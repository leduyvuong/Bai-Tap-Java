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
public class test3 {
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
  public static void horner(int a[], int n){
                int T=0,i,x;
 System.out.println("\n Nhap x= "); 
                x= nhap();
                T= a[n];
                for(i=n ; i>0 ; i--){ 
                    System.out.println("T : "+ T );
                    System.out.println("i: " + i);
                    System.out.println("a[i-1]:  " + a[i-1]);
                        T= T*x + a[i-1];
                    System.out.println("TS : "+ T);    
                }
                System.out.println("Gia tri cua da thuc tinh theo cong thuc Horner la: "+T);
       }
 public static void main(String[] args) { 
    int i;
 System.out.println("Nhap bac cua da thuc n= "); 
                int n= nhap();
 int[] array= new int[n+1]; 
                for(i=n ; i>=0 ; i--){
 System.out.print("Nhap he so cua x^"+i+" = "); 
                        array[i]= nhap();
                }
                horner(array,n);
    }
}
