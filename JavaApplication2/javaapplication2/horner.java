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
public class horner {
    public static void main(String[] args) {
        System.out.println("" + horner(1, 4));
    }
    
    public static int horner(int x, int n) {
        int P = 0;
        if( n == 0) return 0;
        else
        {
            for (int i = n; i > 0; i--) {
                P=P*x + i-1;
            }
        }
        
        return P;
    }
}
