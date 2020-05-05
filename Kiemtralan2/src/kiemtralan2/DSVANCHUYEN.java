/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtralan2;

import java.util.ArrayList;

/**
 *
 * @author Hi-XV
 */
public class DSVANCHUYEN {
    ArrayList<VANCHUYENHANG> dsDonHangVC;

    public DSVANCHUYEN() {
    }
    public void themChuyen(VANCHUYENHANG chuyenXe){
        dsDonHangVC.add(chuyenXe);
    }
    public void xuatBen(VANCHUYENHANG chuyenXe){
        dsDonHangVC.remove(chuyenXe);
    } 
}
