/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author Hi-XV
 */
public class DocFile3 {
    public static void main(String[] args)throws IOException {
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);
        System.out.println("Nhap noi dung123");
        while ( bOutput.size()!= 10) {
            bOutput.write(System.in.read());
        }
        
        byte b[] = bOutput.toByteArray();
        System.out.println("In noi dung");
        for ( int x = 0; x < b.length; x++)
        {
            System.out.print((char)b[x] + " ");
        }
        System.out.println("  ");
        
        int c;
        ByteArrayInputStream bInput = new ByteArrayInputStream(b);
        
        System.out.println("In hoa ky tu");
        for ( int y = 0; y < 1; y++) {
            while ( (c = bInput.read()) != -1) {
                System.out.println(Character.toUpperCase((char) c));
            }
        }
        bInput.reset();;
    }
}
