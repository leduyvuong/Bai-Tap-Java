package javaswing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class SinhVien {
    String MSSV, ten;
    float diem;

    public SinhVien(String MSSV, String ten, float diem) {
        this.MSSV = MSSV;
        this.ten = ten;
        this.diem = diem;
    }
    public String getMSSV(){
        return MSSV;
    }
    public void setMSSV() {
        this.MSSV = MSSV; 
    }
    public String getTen(){
        return ten;
    }
    public void setTen() {
        this.ten = ten; 
    }
    public float getDiem(){
        return diem;
    }
    public void setdiem() {
        this.diem = diem; 
    }
    public String toString() {
        return "Sinh vien [mssv = " +MSSV +",Ten la = " + ten +", diem " + diem;
    }
}
