/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtralan2;


import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hi-XV
 */
public class VCKHOILUONG extends VANCHUYENHANG{
    double khoiLuongHang, haoHut;
    public VCKHOILUONG() {
    }

    public VCKHOILUONG(double khoiLuongHang, double haoHut, String masXe, double trongTai, double dungTich) {
        super(masXe, trongTai, dungTich);
        this.khoiLuongHang = khoiLuongHang;
        this.haoHut = haoHut;
    }
    public String toString() {
        return super.toString() + "Khoi luong : " + khoiLuongHang + "Hao hut : " + haoHut;
    }
    @Override
    public Double tinhDonGiaVC() {
        if(khoiLuongHang < super.trongTai) {
            return (super.giaChuyenXe/khoiLuongHang)*(1+haoHut*(60/100)) ;
        }
        else {
            return 0.00d;
        }
    }
    
}
