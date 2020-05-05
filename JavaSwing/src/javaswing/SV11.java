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

import javax.swing.*;

/**
 *
 * @author Hi-XV
 */
public class SV11 extends JFrame implements ActionListener, ItemListener{
    Vector sv;
    JComboBox cb;
    JTextField txt,txtDiem;
    public GD() {
        super();
        create();
    }
    public static void main(String[] args) {
        GD gd = new GD();
        gd.create();
    }
    private void create() {
        String[] a = {"ADD", "DELETE", "EXIT"};
        setVisible(true);
        setLayout(new GridLayout(3, 1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLocationRelativeTo(null);
        JPanel pn1 = new JPanel();
        pn1.setLayout(new FlowLayout());
        JLabel lbChon = new JLabel("Chon SV");
        sv = new Vector();
        cb = new JComboBox(sv);
//        cb.addItemListener(this);
//        cb.addActionListener(this);
        pn1.add(lbChon);
        pn1.add(cb);
        JPanel pn2 = new JPanel();
        pn2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        JLabel lbthongtin = new JLabel("Thong tin sinh vien");
        pn2.add(lbthongtin,gbc);
        
       
        JLabel lbTen = new JLabel("Ten SV");
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 1;
        pn2.add(lbTen,gbc);
        txt = new JTextField(10);
        gbc.gridx = 1; gbc.gridy = 1; gbc.gridwidth = 1;
        pn2.add(txt,gbc);
        JPanel pn3 = new JPanel(new FlowLayout());
        JLabel lbDiem = new JLabel("Diem");
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 1;
        pn2.add(lbDiem,gbc);
        txtDiem = new JTextField(10);
        gbc.gridx = 1; gbc.gridy = 2; gbc.gridwidth = 1;
        pn2.add(txtDiem, gbc);
        JButton btnAdd = new JButton("ADD");
        btnAdd.addActionListener(this);
        pn3.add(btnAdd);
        JButton btnDel = new JButton("DELETE");
        pn3.add(btnDel);
        btnDel.addActionListener(this);
        JButton btnEx = new JButton("Exit");
        btnEx.addActionListener(this);
        pn3.add(btnEx);
        pack();
        this.add(pn1); this.add(pn2); add(pn3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = ((JButton) e.getSource()).getText();
        if (btn.equals("ADD")) {
            String ten = txt.getText();
            String diem = txtDiem.getText();
            System.out.println(btn);
            sv.addElement("Ten: "+ten+"Diem "+diem);
            cb.updateUI();
        }
        if (btn.equals("DELETE")) {
            String ten = txt.getText();
            String diem = txtDiem.getText();
            sv.remove("Ten: "+ten+"Diem "+diem);
            cb.updateUI();
        }
        if (btn.equals("EXIT")){
            System.exit(0);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String ten = (String ) cb.getSelectedItem();
        String diem = txtDiem.getText();
        txt.setText(ten);
        txtDiem.setText(diem);
    }
}
