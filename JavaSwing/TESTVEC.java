/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.util.ArrayList;

/**
 *
 * @author Hi-XV
 */
public class TESTVEC extends lopJava{
    static String name;
    public static void main(String[] args) {
        lopJava test = new lopJava();
        test.add();
        test.add("Lung Linh ", 5, "3412421124124");
        test.inDS();
        test.del("Lung Linh ");
        test.inDS();
        test.delSvCuoi(ds.size()-1);
        test.inDS();
        
        Student A = new Student();
        A.setName("A"); 
        A.point = 8;
        A.MSSV = "1a2b";
        
        ArrayList<Student> listStudent = new ArrayList<Student>();
        listStudent.add(A);
        
        Student B = listStudent.get(i);
       
        System.out.println(B.MSSV); // Kiểu lấy ra nhưng chưa biết rõ hân. đem so sánh á. à 1 for . 1 lần for là cứ Student B rứa á xong B. rk à
        if("A".equals(B.name))
    }
    
}

