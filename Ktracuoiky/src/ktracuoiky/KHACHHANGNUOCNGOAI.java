/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktracuoiky;

/**
 *
 * @author Hi-XV
 */
public class KHACHHANGNUOCNGOAI extends KHACHHANG{
    String quocTich; 
    public KHACHHANGNUOCNGOAI(String maKhachHang, String hoTen, String ngayRaHD, int soLuong, int donGia, String quocTich) {
        super(maKhachHang, hoTen, ngayRaHD, soLuong, donGia);
        this.quocTich = quocTich;
    }
    
    @Override
    public int tinhThanhTien() {
        return super.soLuong*super.donGia;
    }
    
}
