/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class TTTT {
    public static float tong(int x, int n) {
        float tong = 0;
        float mau = 0, tu = 1;
        for ( int i = 1; i <= n; i++) {
            tu *= x;
            for ( int j = 1; j <= i; j++) {
                mau +=j;
            }
            tong += tu / mau;
            mau = 0;
        }
        return tong;
    }
    public static void main(String[] args) {
        float result = tong(2, 4);
        System.out.println("Tong =" + result);
    }
}
