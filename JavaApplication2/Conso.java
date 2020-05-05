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
public class Conso {
    
    public static void main(String args[]) {
        Console c = System.console();
        System.out.println("Enter password: ");
        char[] ch = c.readPassword();
        // convert char array into string
        String pass = String.valueOf(ch);
        System.out.println("Password is: " + pass);
    }

}
