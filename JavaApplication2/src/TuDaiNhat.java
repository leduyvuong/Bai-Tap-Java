/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi-XV
 */
public class TuDaiNhat {
    public static String format(String a)
    {
        String a2="";
        String[] a1 = a.toLowerCase().split("");
        a1[0] = a1[0].toUpperCase();
        for ( int i = 0; i < a1.length; i++)
        {
            a2+=a1[i];
        }
        return a2;
    }
    public static int demKT(String a)
    {
        int dem = 0;
        String[] a1 = a.split("");
        for ( int i = 0; i < a1.length; i++)
        {
           dem++; 
        }
        return dem;
    }
    public static void main(String[] args) {
        String a = "trUoNG HOC Nghiengg  caP ba";
        String[] a1 = a.split(" ");
        String a3 = "";
        for ( int i = 0; i < a1.length; i++)
        {
            if(!"".equals(a1[i]))
            {
                a3 +=format(a1[i] +" ");
            }
        }
       //--------------------------------------------
        System.out.println(a3);
        String[] a4 = a3.split(" ");
        int k = 0;
        int max = 0;
        for ( int j = 0; j < a4.length; j++)
        {
            if(!"".equals(a4[j]) && max < demKT(a4[j]))
            {
                max = demKT(a4[j]);
                k = j;
                
            }
        }
        System.out.println("Ki tu dai nhat la " + a4[k]);
    }
}
