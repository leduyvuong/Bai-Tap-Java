/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.util.Vector;

/**
 *
 * @author Hi-XV
 */
public class Lop {

    static String ten, MSSV;
    static int diem;

    public Lop(String ten, String MSSV, int diem) {
        this.ten = ten;
        this.MSSV = MSSV;
        this.diem = diem;
    }
    public static String traVe() {
        return  ten +" : " + MSSV + " : " + Integer.toString(diem);
    }
    
    
}
