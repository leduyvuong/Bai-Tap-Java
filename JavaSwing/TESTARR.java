/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Hi-XV
 */
public class TESTARR extends lopArrList{
    static String name;
    public static void main(String[] args) {
        lopArrList test = new lopArrList();
        test.add("Le Duy Vuong", 10, "23211210077");
        test.add("Le Duy Linh", 5, "12315646468");
        test.add("Le Duy Linh1", 5, "12315646468");
        test.inDS();
        test.del("Le Duy Linh");
        test.inDS();
        test.delSvCuoi(ds.size()-1);
        test.inDS();
    }
}
