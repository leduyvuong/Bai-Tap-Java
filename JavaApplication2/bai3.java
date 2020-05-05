
import static java.lang.Math.sqrt;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class bai3 {
    public static boolean check(int n){
        if( n < 2) return false;
        else if(n%2 == 0){
            return false;
        }else
        {
            for(int i = 3; i < sqrt(n);i++)
            {
                if(n%i == 0) return false;
            }
        }
        return true;
    }
    public  static int nhap(){
        Scanner input = new Scanner(System.in);
        int n=0;
        boolean check= false;
        while(!check){
            try{
            n= input.nextInt();
            check=true;
            }catch (Exception e){
                System.out.println("Nhap so lai");
                input.nextInt();
            }
            
        }
        return n;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap n");
        n=nhap();
        for(int i = 0 ; i < n; i++)
        {
            if(check(i) == true )
                System.out.println("So " + i);
        }
    }
}
