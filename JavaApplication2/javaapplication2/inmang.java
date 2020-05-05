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
public class inmang {
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
          check=true;
          }catch (Exception e){
              System.out.println("Nhap lai N");
              input.nextInt();
          }
      }
      return n;
  }
  public static void inmangf(int[] f)
  {
      for(int i = 0; i < f.length; i++)
      {
          System.out.println(f[i]+",");
      }
  }
  
    public static void main(String[] args) {
       int j=0,n;
       
        int[] f = new int[6];
        n=nhap();
       while(n>0)
       {
           int i;
           i = 10;
           f[j]=n%i;
           n=n/i;
           i*=10;
           j++;
       }
        
    }
}
