/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktracuoiky;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hi-XV
 */
public class DSKHACHHANG {
    ArrayList<KHACHHANG> list;

    public DSKHACHHANG() {
        super();
        list = new ArrayList<KHACHHANG>();
    }
    
    void add(KHACHHANG e) {
        for ( int i = 0; i < list.size(); i++) {
            if ( list.get(i).maKhachHang.equalsIgnoreCase(e.maKhachHang) ){
                
                return;
            }
        }
        list.add(e);
    }
    void del(String maKhachHang) {
        for ( int i = 0; i < list.size(); i++) {
            if (list.get(i).maKhachHang.equals(maKhachHang)) {
                list.remove(i);
            }
        }
    }
    Object search(String maKhachHang) {
        for ( int i = 0; i < list.size(); i++) {
            if ( list.get(i).maKhachHang.equals(maKhachHang)) {
                return list.get(i);
            }
        }
        return -1;
    }
    String sumKH() {
        int vn = 0;
        int nn = 0;
        for ( int i = 0; i < list.size(); i++) {
            String a[] = list.get(i).maKhachHang.split("");
            if(a[0].equals("V") && a[1].equals("N")) {
                vn += 1;
            } else {
                nn += 1;
            }
        }
        return "So khach Viet Nam la " + vn + "nguoi. So khac nuoc ngoai la "+ nn +"nguoi.";
    }
}
