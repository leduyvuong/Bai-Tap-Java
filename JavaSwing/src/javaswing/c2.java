/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class c2 {

    private static void createAndShowGUI() {
        JFrame frmMain = new JFrame("Cua So");
        Listener ls = new Listener();
        frmMain.setSize(400, 100);
        frmMain.setVisible(true);
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.setLayout(new FlowLayout());

        JPanel pn = new JPanel();
        JTextField lb1 = new JTextField();
        JButton btn = new JButton("Nut Lenh");
        
        btn.addActionListener(ls);
        pn.add(btn);
        pn.add(lb1);
        
        JPanel pn1 = new JPanel();
        JButton btn1 = new JButton("1");
        btn1.addAncestorListener(ls);
        pn1.add(btn1);
        
        frmMain.add(pn);
        frmMain.add(pn1);
        frmMain.pack();
    }
    
 
    
   static class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton)e.getSource()).getText();
            if ( name.equals("Nut Lenh") ) 
            System.out.println("Click");
            else System.out.println("CLICK");
        }
    
}
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
