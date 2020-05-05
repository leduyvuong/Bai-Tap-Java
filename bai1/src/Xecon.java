/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class Xecon {
    int Giaxe;
    public Xecon(String ten)
    {
        System.out.println("Ten xe la : "+ten);
    }
    public void setGia(int gia)
    {
        Giaxe = gia;
    }
    public int getGia()
    {
        Giaxe = 0;
        System.out.println("Gia xe la " + Giaxe);
        return Giaxe;
    }
    public static void main(String[] args) {
        Xecon Xecuatoi = new Xecon("Toyota");
        Xecuatoi.setGia(100000000);
        Xecuatoi.getGia();
        System.out.println("Gia tri bien : "+Xecuatoi.Giaxe);
    }
}
