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
abstract class KHACHHANG implements ITIENDIEN{
    String loaiKhachHang, maKhachHang, hoTen, ngayRaHD;
    int soLuong, donGia, dinhMuc;

    public KHACHHANG(String maKhachHang, String hoTen, String ngayRaHD, int soLuong, int donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHD = ngayRaHD;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    public String toString() {
        return "Ma khach hang : " + maKhachHang + " Ho ten la : " + hoTen + " ngay ra hoa don : " + ngayRaHD + " so luong : " + soLuong + " don gia :" +donGia;
    }
 
    public abstract int tinhThanhTien(); 
    
}
