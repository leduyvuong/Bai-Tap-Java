/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;
/*import java.lang.ArrayIndexOutOfBoundsException;*/
/**
 *
 * @author Hi-XV
 */
public class thuannghic {
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
  public static boolean check(int n)
  {
      
      int j=0;
      int[] f = new int[6];
      
      while(n > 0)
      {
          int i;
          i = 10;
          f[j]=n%i;
          n=n/i;
          i*=10;
          j++;
      }
      
      for(int p=0; p<f.length/2 ; p++)
      {
              if(f[p]!=f[f.length-p-1])
              {
                  return false;
              }
              
          }
      return true;
  }
  
    public static void main(String[] args) {
       for(int i=100000;i<=999999;i++)
       {
           if(check(i)== true)
           {
               System.out.println(i+ " ");
           }
       }
//    int n;
//    n=nhap();
//    if(check(n)== true)
//            System.out.println("co");
//    else
//            System.out.println("không");
    }
}
