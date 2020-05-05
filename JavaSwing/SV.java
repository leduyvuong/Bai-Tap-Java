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

public class SV extends JFrame implements ActionListener, ItemListener {

    Vector sv;
    JComboBox cb;
    JTextField txt, txtDiem;
    String ten;
    JFrame mainFrame;
    Vector rowdata;
    private Vector rowdatas;
    private JTable table;
    private JTextField txtShow;
    private JTextField txtSear;
    private JButton btnLop;
    private JTextField txtLop;
    private JLabel lbLop;

    public SV() {
        super();
        create();

    }

    public static void main(String[] args) {
        SV gd = new SV();
    }

    private void create() {
        mainFrame = new JFrame();
        mainFrame.setVisible(true);
        mainFrame.setLayout(new GridLayout(3, 2));
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        mainFrame.setLocationRelativeTo(null);

        sv = new Vector();

        JPanel pnMain = new JPanel();
        pnMain.setLayout(new GridLayout(2, 1));
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
        pnMain.add(scroll);

        JPanel pn2 = new JPanel();
        pn2.setLayout(new GridLayout(5, 2));

        JLabel lbTen = new JLabel("Ten SV");

        pn2.add(lbTen);
        txt = new JTextField(10);
        pn2.add(txt);
        lbLop = new JLabel("Lop");
        pn2.add(lbLop);
        txtLop = new JTextField();
        pn2.add(txtLop);

        JLabel lbDiem = new JLabel("Diem");

        pn2.add(lbDiem);
        txtDiem = new JTextField(10);

        pn2.add(txtDiem);
        JButton btnAdd = new JButton("ADD");
        btnAdd.addActionListener(this);
        pn2.add(btnAdd);
        JButton btnDel = new JButton("DELETE");
        pn2.add(btnDel);
        btnDel.addActionListener(this);
        JButton btnSear = new JButton("SEARCH");
        btnSear.addActionListener(this);
        pn2.add(btnSear);
        txtSear = new JTextField(10);
        pn2.add(txtSear);
        mainFrame.add(pnMain);
        mainFrame.add(pn2);
        txtShow = new JTextField(10);
        mainFrame.add(txtShow);
        mainFrame.setSize(500, 700);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = ((JButton) e.getSource()).getText();
        if (btn.equals("ADD")) {
            rowdata = new Vector();
            rowdata.add(txt.getText());
            rowdata.add(txtLop.getText());
            rowdata.add(txtDiem.getText());
            rowdatas.addElement(rowdata);
            table.updateUI();
        }
        if (btn.equals("DELETE")) {
            rowdatas.remove(table.getSelectedRow());
            table.updateUI();
        }
        if (btn.equals("SEARCH")) {
            for (int i = 0; i < rowdatas.size(); i++) {
                if (table.getValueAt(i, 0).toString().equals(txtSear.getText())) {
                    System.out.println("a");
                    txtShow.setText("Ten "+table.getValueAt(i, 0).toString() +"\nLop "+table.getValueAt(i, 1).toString() +"\nDiem "+ table.getValueAt(i, 2).toString());
                    break;
                }
            }
        }

    }

    public void itemStateChanged(ItemEvent e) {
        String ten = (String) cb.getSelectedItem();
        txt.setText(ten);
    }
}
