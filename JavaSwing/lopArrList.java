/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.util.ArrayList;
import java.util.Scanner;
import static javaswing.lopJava.ds;

/**
 *
 * @author Hi-XV
 */
public class lopArrList {
    
    static ArrayList ds = new ArrayList();
    String ten, diem, MSSV;

    public void add(String name, int diem, String MSSV) {
        ds.add(name);
        ds.add(diem);
        ds.add(MSSV);
    }

    public static void inDS() {
        int i = 0;
        while (i < ds.size()) {
            System.out.println("Ten : " + ds.get(i));
            System.out.println("Diem : " + ds.get(i + 1));
            System.out.println("MSSV : " + ds.get(i + 2));
            System.out.println("-----------------------");
            i += 3;
        }
    }

    public static void del(String name) {

        for (int i = 0; i < ds.size(); i++) {
            if (name.equals(ds.get(i))) {
                ds.remove(i);
                ds.remove(i);
                ds.remove(i);
            }
        }
        System.out.println("Da Xoa !");
    }

    public static void delSvCuoi(int index) {

        ds.remove(index);
        ds.remove(index - 1);
        ds.remove(index - 2);
        System.out.println("Da xoa !");
    }
}
