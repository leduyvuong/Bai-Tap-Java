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
public class VCTHETICH extends VANCHUYENHANG{
    double theTichHang, phiBaoQuan;

    public VCTHETICH() {
    }

    public VCTHETICH(double theTichHang, double phiBaoQuan, String masXe, double trongTai, double dungTich) {
        super(masXe, trongTai, dungTich);
        this.theTichHang = theTichHang;
        this.phiBaoQuan = phiBaoQuan;
    }
    public String toString() {
        return super.toString() + "The tich la : " + theTichHang + "Phi la : " + phiBaoQuan;
    }
    @Override
    public Double tinhDonGiaVC() {
        if ( theTichHang < super.dungTich) {
            return (super.giaChuyenXe*2/theTichHang*(1+phiBaoQuan))/2;
        }
        else {
            return 0.00d;
        }
    }
    
}
