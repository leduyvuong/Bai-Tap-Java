/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtralan2;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Hi-XV
 */
public class QLNGAYXEVC extends Frame implements ActionListener {

    private JPanel pn;
    private ButtonGroup bg;
    private JRadioButton btnVCKhoiLuong;
    private JRadioButton btnVCTheTich;
    private JPanel pn1;
    private JButton btnAdd;
    private JButton btnXuatChuyen;
    private JButton btnTim;
    private JTextField txt;

    public QLNGAYXEVC() {
        createGD();
    }

    private JFrame gd;
    private Vector rowdata;
    private Vector rowdatas;
    private JTable table;

    public void createGD() {
        gd = new JFrame("OK");
        gd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gd.setSize(600, 600);
        gd.setLayout(new GridLayout(4, 0));
        Vector<String> columName = new Vector<String>();
        columName.add("MsXe");
        columName.add("Trong Tai");
        columName.add("Dung tich");
        columName.add("giaChuyenXe");
        columName.add("khoiLuongHang");
        columName.add("Hao hut");
        columName.add("theTichHang");
        columName.add("phiHaoHut");
        rowdata = new Vector();
        rowdata.add(new String());
        rowdata.add("");
        rowdata.add("");
        rowdata.add("");
        rowdata.add("");
        rowdata.add("");
        rowdata.add("");
        rowdata.add("");
        rowdatas = new Vector();
        rowdatas.add(rowdata);
        table = new JTable(rowdatas, columName);
        JScrollPane scroll = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        gd.add(scroll);

        pn = new JPanel();
        bg = new ButtonGroup();
        btnVCKhoiLuong = new JRadioButton("VC Khoi Luong");
        btnVCTheTich = new JRadioButton("VC The Tich");
        bg.add(btnVCTheTich);
        bg.add(btnVCKhoiLuong);
        pn.add(btnVCKhoiLuong);
        pn.add(btnVCTheTich);
        gd.add(pn);
        pn1 = new JPanel();
        pn1.setLayout(new FlowLayout());
        btnAdd = new JButton("Them");
        btnAdd.addActionListener(this);
        btnXuatChuyen = new JButton("Xuat Chuyen");
        btnXuatChuyen.addActionListener(this);
        btnTim = new JButton("Tim Chuyen");
        pn1.add(btnAdd);
        pn1.add(btnXuatChuyen);
        pn1.add(btnTim);
        gd.add(pn1);
        txt = new JTextField();
        gd.add(txt);

        gd.setVisible(true);

    }

    public void btnDel(ActionEvent e) {

        int i = table.getSelectedRow();
        System.out.println(i);

        if (btnVCKhoiLuong.isSelected()) {
            if (table.getValueAt(i, 4) == null) {
                JOptionPane.showMessageDialog(null, "Chua co hang");
            } else {
                String a = duLieu(i, 0) + " " + duLieu(i, 4);
                txt.setText(a);
                rowdatas.remove(table.getSelectedRow());
                table.updateUI();
            }
        } else if (btnVCTheTich.isSelected()) {
            if (table.getValueAt(i, 6).equals(null)) {
                JOptionPane.showMessageDialog(null, "Chua co hang");
            } else {
                String a = duLieu(i, 0) + " " + duLieu(i, 6);
                txt.setText(a);
                rowdatas.remove(table.getSelectedRow());
                table.updateUI();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Chua chon cach van chuyen");
        }

    }

    public String duLieu(int i, int j) {
        if (j == 0) {
            return "Thong tin : { msXe = " + table.getValueAt(i, j) + " trongTai = " + table.getValueAt(i, j + 1) + " giaChuyenXe = " + table.getValueAt(i, j + 3) + " }";
        } else if (j == 4) {
            return "VCKHOILUONG { khoiLuongHang = " + table.getValueAt(i, j) + " haoHut = " + table.getValueAt(i, j + 1) + " }";
        } else {
            return "VCTHETICH { theTichHang = " + table.getValueAt(i, 6) + " phiBaoQuan = " + table.getValueAt(i, 7) + " }";
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String btn = ((JButton) e.getSource()).getText();

        if (btn.equals("Them")) {
            rowdata = new Vector();
            rowdata.add(new String());
            rowdata.add("");
            rowdata.add("");
            rowdata.add("");
            rowdata.add("");
            rowdata.add("");
            rowdata.add("");
            rowdata.add("");
            rowdatas.add(rowdata);
            table.updateUI();

        } else if (btn.equals("Xuat Chuyen")) {
            btnDel(e);
        }
    }

}
