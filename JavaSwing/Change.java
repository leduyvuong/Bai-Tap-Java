
package javaswing;

import java.util.Scanner;

public class Change {
    static void xuatMang(String[] a, int n) {
        for ( int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    static String change( String n) {
        
        String result = null;
        switch(n) {
        case "7" :
            result = "rwx";
            break;
        case "6" :
            result = "rw-";
            break;
        case "5" :
            result = "r-x";
            break;
        case "4" :
            result = "r--";
            break;
        case "3" :
            result = "-wx";
            break;
        case "2" :
            result = "-w-";
            break;
        case "1" :
            result = "--x";
            break;
        case "0" :
            result = "---";
            break;
        case "rwx" :
            result = "7";
            break;
        case "rw-" :
            result = "6";
            break;
        case "r-x" :
            result = "5";
            break;
        case "r--" :
            result = "4";
            break;
        case "-wx" :
            result = "3";
            break;
        case "-w-" :
            result = "2";
            break;
        case "--x" :
            result = "1";
            break;
        case "---" :
            result = "0";
            break;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = "0";
        String m;
        System.out.println("Nhap N ");
        n = in.nextLine();
        m = n;
        String[] a = n.split("");
        if ( a.length = 2) {
            n += 
        }
        for ( int i = 0; i < a.length; i++) {
            if (a[i].equals("r") | a[i].equals("w") | a[i].equals("x" )| a[i].equals("-")) {
                if ( a.length < 4){
                System.out.println("Xin moi nhap lai");
                n = in.nextLine();
                }
            }
//            
//                if (a[i].equals(a[i+1] | )){
//                    System.out.println("Xin Moi Nhap Lai : ");
//                    n = in.nextLine();
//                }
            
        }
        String[] result = new String[5];
        for ( int i = 0; i < a.length; i++) {
            
           result[i] = change(a[i]);
        }
        xuatMang(result, a.length);
    }
    
}
