/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 *
 * @author Hi-XV
 */
public class SimpleTableDemo extends Frame implements ActionListener{

    Vector rowdata;
    Vector rowdatas;
    
   
    JTable table;
    
    public SimpleTableDemo() {
        create();
        
        
    }
    public void create() {
        JFrame frm = new JFrame();
        frm.setLayout(new GridLayout(2,1));
        Vector<String> columName = new Vector<String>();
        columName.add("Ten");
        columName.add("Lop");
        columName.add("Diem");
        rowdata = new Vector();
        rowdata.add("Vuong");
        rowdata.add("CS311Z");
        rowdata.add(new Integer(10));
        rowdatas = new Vector();
        rowdatas.add(rowdata);
        table = new JTable(rowdatas, columName);
        JScrollPane scroll = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        frm.add(scroll);
        JPanel pn = new JPanel();
        JButton btnAdd = new JButton("ADD");
        btnAdd.addActionListener(this);
        JButton btnDel= new JButton("DELETE");
        pn.add(btnAdd); pn.add(btnDel);
        frm.add(pn);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = ((JButton) e.getSource()).getText();
        if(btn.equals("ADD")) {
        rowdata = new Vector();
        rowdata.add("");
        rowdata.add("");
        rowdata.add("");
        rowdata.add(new Integer(0));
        rowdata.add(new Boolean(false));
        rowdatas.addElement(rowdata);
        table.updateUI();
        }else if ( btn.equals("DELETE")) {
            System.out.println(""+table.getSelectedRow());
    }
    }
    public static void main(String[] args) {
        SimpleTableDemo main = new SimpleTableDemo();
        
    }
    
}
