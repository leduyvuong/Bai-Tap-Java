/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javaswing.DTanClass;
/**
 *
 * @author Hi-XV
 */
public class GD extends JFrame implements ActionListener{

    private static DTanClass mt;

    public Vector ds;
    JComboBox cb;
    JTextField txt, txtDiem;
    private JTextField txtMSSV;
    private JTextField txtTen;
    
    public GD() {
        super();
        mt = new DTanClass();
        ds = new Vector();
        
        create();
    }

    public static void main(String[] args) {
        GD gd = new GD();
        
        gd.create();
    }

    private void create() {

        setVisible(true);
        setLayout(new GridLayout(3, 1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        JPanel pn1 = new JPanel();
        pn1.setLayout(new FlowLayout());
        JLabel lbChon = new JLabel("Quan Ly Sinh Vien");

        pn1.add(lbChon);
        
        JPanel pn2 = new JPanel();
        pn2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        JLabel lbthongtin = new JLabel("Thong tin sinh vien");
        pn2.add(lbthongtin, gbc);
        
        JLabel lbTen = new JLabel("Ten SV");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        pn2.add(lbTen, gbc);
        txt = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        pn2.add(txt, gbc);
        JPanel pn3 = new JPanel(new FlowLayout());
        JLabel lbMSSV = new JLabel("MSSV");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        pn2.add(lbMSSV, gbc);
        txtMSSV = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        pn2.add(txtMSSV, gbc);
        JLabel lbDiem = new JLabel("Diem SV");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        pn2.add(lbDiem, gbc);
        txtTen = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        pn2.add(txtTen, gbc);
        JButton btnAdd = new JButton("ADD");
        btnAdd.addActionListener(this);
        pn3.add(btnAdd);
        JButton btnDel = new JButton("DELETE");
        pn3.add(btnDel);
        btnDel.addActionListener(this);    
        JButton btnEx = new JButton("Exit");

        pn3.add(btnEx);
        JButton btnSea = new JButton("Search");
        pn3.add(btnSea);
        pack();
        add(pn1);
        add(pn2);
        add(pn3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String temp = ((JButton) e.getSource()).getText();
        if(temp.equals("ADD")){
           mt.addSV(txtMSSV.getText(), txtTen.getText(),Float.parseFloat(txtDiem.getText()));
            System.out.println("a");
        }
        if(temp.equals("DELETE")) {
            mt.delSV(txtMSSV.getText());
            System.out.println("b");
        }
        if(temp.equals("SEARCH")){
            int index = mt.searchSV(txtMSSV.getText());
            txtMSSV.setText(mt.getDL(index).toString());
            txtTen.setText(mt.getDL(index + 1).toString());
            txtDiem.setText(mt.getDL(index+2).toString());
            System.out.println("c");
        }
    }

}
