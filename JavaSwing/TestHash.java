/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

/**
 *
 * @author Hi-XV
 */
public class TestHash {
    
    public static void main(String[] args) {
        lopHash test = new lopHash();
        
        Lop sv1, sv2, sv3;
        sv1 = new Lop("Le Duy Vuong", "2323232", 5);
        sv2 = new Lop("Le  Vuong1", "1111111111", 50);
        
        test.add(sv1);
        test.add(sv2);
        
        test.print();
        
        
    }
}
