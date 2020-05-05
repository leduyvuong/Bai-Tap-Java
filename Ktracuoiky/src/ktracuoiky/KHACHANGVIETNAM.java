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
public class KHACHANGVIETNAM extends KHACHHANG{
    int dinhMuc;
    public KHACHANGVIETNAM(String maKhachHang, String hoTen, String ngayRaHD, int soLuong, int donGia) {
        super(maKhachHang, hoTen, ngayRaHD, soLuong, donGia);
        
    }

    
    @Override
    public int tinhThanhTien() {
        if ( super.soLuong <= dinhMuc) {
            return super.soLuong*super.donGia;
        }else {
            return (int) (super.soLuong*super.donGia*dinhMuc+(super.soLuong-dinhMuc)*super.donGia*2.5); 
        }
    }
    
}
