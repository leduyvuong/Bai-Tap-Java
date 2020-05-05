/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtralan2;

/**
 *
 * @author Hi-XV
 */
public abstract class VANCHUYENHANG {
    String masXe;
    double trongTai, dungTich, giaChuyenXe;

    public VANCHUYENHANG() {
    }

    public VANCHUYENHANG(String masXe, double trongTai, double dungTich) {
        this.masXe = masXe;
        this.trongTai = trongTai;
        this.dungTich = dungTich;
    }
    public void setGiaTien(double giaChuyenXe) {
        this.giaChuyenXe = giaChuyenXe;
    }
    public String toString() {
        return "Mas xe : " + masXe + "Trong tai : " + trongTai + "Dung tich : " + dungTich;
    }
    public abstract Double tinhDonGiaVC();
}
