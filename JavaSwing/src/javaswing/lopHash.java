/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Hi-XV
 */
public class lopHash {
    static String ten; int diem;
    
    static String MSSV, value;
    static Hashtable<String, Lop> ds = new Hashtable();
    public static void add(Lop sv) {
        MSSV = sv.MSSV;
        ds.put(MSSV, sv);
    }
    public static void print() {
        Enumeration eNum = ds.keys();
        while(eNum.hasMoreElements()) {
            MSSV = eNum.nextElement().toString();
            Lop sv = ds.get(MSSV);
            System.out.println(MSSV +" : " + sv.traVe());
            
        }
    }
    public static void del(String MSSV) {
        if ( ds.containsKey(MSSV)) {
            ds.remove(MSSV);
        }
        
        
        System.out.println("Da xoa !");
    }
}
