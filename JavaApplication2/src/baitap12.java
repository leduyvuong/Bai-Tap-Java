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
public class baitap12 {
    public static boolean check(int n)
    {
        if ( n < 2) return false;
        else{
            for ( int i = 2; i < Math.sqrt(n); i++)
            {
                if ( n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("D:\\text\\text.txt");
            out = new FileWriter("D:\\text\\out.txt");
            int c ;
            char[] temp = new char[10];
            while ((c = in.read(temp)) != -1){
                c = (int) c;
                System.out.println(c + " ");
//                c = (int) c;
                if ( check(c) == true){
                    out.write(c);
                    
                }
            }
        } finally {
            if ( in != null){
                in.close();
            }
            if ( out != null){
                out.close();
            }
        }
                
    }
    
}
