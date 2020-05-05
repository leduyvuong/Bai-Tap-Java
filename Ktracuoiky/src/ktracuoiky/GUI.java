/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktracuoiky;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hi-XV
 */
public class GUI extends Frame implements ActionListener {

    private JFrame gd;
    private Vector rowdata;
    private Vector rowdatas;
    private JTable table;
    private ButtonGroup bg;
    private JPanel pn;
    private JButton btnAdd;
    private JButton btnUpdate;
    private JButton btnDel;
    private JTextField txt;
    private JPanel pnSearch;
    private JTextField txtSearch;
    private JButton btnSearch;
    private JLabel lbHoten, lbMaKH, lbNgayRaHD, lbSL, lbDG, lbDel, lbSearch;
    private JTextField txtDel;
    private JPanel pnUP;
    private JTextField txtHoTen;
    private JTextField txtSL;
    private JTextField txtDG;
    private JTextField txtNgay;
    private JPanel pnAdd;
    private JRadioButton rdiVN;
    private JRadioButton rdiNN;
    private Vector<String> columName;
    private JTextField txtQT;
    private JTextField txtMaKH;
    private int rowLenght;
    private final DSKHACHHANG alist;
    private TextArea txt1;

    public GUI() throws HeadlessException {
        create();
        alist = new DSKHACHHANG();
    }

    void create() {
        gd = new JFrame("Quan Ly Khach Hang");
        gd.setLayout(new GridLayout(6, 1));
        gd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gd.setVisible(true);

        columName = new Vector<String>();
        columName.add("maKhachHang");
        columName.add("Ho Ten");
        columName.add("So luong ");
        columName.add("Don gia ");
        columName.add("Ngay HD");

        rowdatas = new Vector();

        table = new JTable(rowdatas, columName);
        JScrollPane scroll = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        gd.add(scroll);

        pnAdd = new JPanel(new FlowLayout());
        bg = new ButtonGroup();
        rdiVN = new JRadioButton("VN");
        rdiVN.setSelected(true);
        rdiNN = new JRadioButton("NN");
        bg.add(rdiVN);
        bg.add(rdiNN);
        pnAdd.add(rdiVN);
        pnAdd.add(rdiNN);

        gd.add(pnAdd);

        pnUP = new JPanel(new GridLayout(6, 2));
        btnAdd = new JButton("ADD");
        btnAdd.addActionListener(this);
        lbMaKH = new JLabel("Ma Khach Hang");
        lbSL = new JLabel("So luong (nhap so)");
        lbDG = new JLabel("Don Gia (nhap so)");
        lbNgayRaHD = new JLabel("Ngay/Thang/Nam");
        lbHoten = new JLabel("Ho Ten ");
        txtMaKH = new JTextField("");
        txtHoTen = new JTextField("");
        txtSL = new JTextField("");
        txtDG = new JTextField("");
        txtNgay = new JTextField("");
        btnUpdate = new JButton("UPDATE");
        btnUpdate.addActionListener(this);
        pnUP.add(lbMaKH);
        pnUP.add(txtMaKH);
        pnUP.add(lbHoten);
        pnUP.add(txtHoTen);
        pnUP.add(lbSL);
        pnUP.add(txtSL);
        pnUP.add(lbDG);
        pnUP.add(txtDG);
        pnUP.add(lbNgayRaHD);
        pnUP.add(txtNgay);
        pnUP.add(btnAdd);
        pnUP.add(btnUpdate);
        gd.add(pnUP);

        pn = new JPanel(new FlowLayout());
        txtDel = new JTextField(20);
        lbDel = new JLabel("Ma khach hang");
        btnDel = new JButton("DELETE");
        btnDel.setSize(20, 20);
        btnDel.addActionListener(this);
        pn.add(lbDel);
        pn.add(txtDel);
        pn.add(btnDel);
        gd.add(pn);

        txt1 = new TextArea();
        
        gd.add(txt1);

        pnSearch = new JPanel(new FlowLayout());
        lbSearch = new JLabel("Ma khach hang");
        txtSearch = new JTextField(10);
        btnSearch = new JButton("SEARCH");
        btnSearch.addActionListener(this);
        pnSearch.add(lbSearch);
        pnSearch.add(txtSearch);
        pnSearch.add(btnSearch);
        gd.add(pnSearch);

        gd.pack();
    }

    public void clearTXT() {

        txtMaKH.setText("");
        txtHoTen.setText("");
        txtSL.setText("");
        txtDG.setText("");
        txtNgay.setText("");

    }

    public void newRow() {
        rowdata = new Vector();
        rowdata.add(txtMaKH.getText());
        rowdata.add(txtHoTen.getText());
        rowdata.add(txtSL.getText());
        rowdata.add(txtDG.getText());
        rowdata.add(txtNgay.getText());

        rowdatas.addElement(rowdata);
        table.updateUI();
    }

    public void actionAdd(ActionEvent e) {

        KHACHHANG khachHang;

        String maKhachHang = txtMaKH.getText();
        String name = txtHoTen.getText();
        String ngayHD = txtNgay.getText();
        int sL = Integer.parseInt(txtSL.getText());
        int dG = Integer.parseInt(txtDG.getText());
        for (int i = 0; i < this.alist.list.size(); i++) {
            System.out.println("a");
            if (this.alist.list.get(i).maKhachHang.equalsIgnoreCase(maKhachHang)) {
                JOptionPane.showMessageDialog(null, "Trung maKhachHang r");
                return;
            }
        }

        newRow();
        if (rdiVN.isSelected()) {
            khachHang = new KHACHANGVIETNAM(maKhachHang, name, ngayHD, sL, dG);
            this.alist.add(khachHang);
        } else if (rdiNN.isSelected()) {
            String quocTich = "NN";
            khachHang = new KHACHHANGNUOCNGOAI(maKhachHang, name, ngayHD, sL, dG, quocTich);
            this.alist.add(khachHang);
        }
        clearTXT();
    }

    public void actionDel(ActionEvent e) {
        rowLenght = rowdatas.size();
        for (int i = 0; i < rowdatas.size(); i++) {
            if (table.getValueAt(i, 0).equals(txtDel.getText())) {
                ((DefaultTableModel) table.getModel()).removeRow(i);
                table.updateUI();
                this.alist.del(txtDel.getText());
            }
        }
        if (rowLenght == rowdatas.size()) {
            JOptionPane.showMessageDialog(null, "Khong co");
        }
    }

    public void actionUp(ActionEvent e) {
        KHACHHANG khachHang;
        for (int i = 0; i < this.alist.list.size(); i++) {
            if (this.alist.list.get(i).maKhachHang.equalsIgnoreCase(txtMaKH.getText())) {
                
                rowdata = new Vector();
                rowdata.add(txtMaKH.getText());
                rowdata.add(txtHoTen.getText());
                rowdata.add(txtSL.getText());
                rowdata.add(txtDG.getText());
                rowdata.add(txtNgay.getText());
                rowdatas.setElementAt(rowdata, i);
                table.updateUI();
                this.alist.del(txtMaKH.getText());
                String maKhachHang = txtMaKH.getText();
                String name = txtHoTen.getText();
                String ngayHD = txtNgay.getText();
                int sL = Integer.parseInt(txtSL.getText());
                int dG = Integer.parseInt(txtDG.getText());
                if (rdiVN.isSelected()) {
                    khachHang = new KHACHANGVIETNAM(maKhachHang, name, ngayHD, sL, dG);
                } else {
                    String quocTich = txtQT.getText();
                    khachHang = new KHACHHANGNUOCNGOAI(maKhachHang, name, ngayHD, sL, dG, quocTich);
                }
                this.alist.list.set(i, khachHang);
                clearTXT();
            } else {
                JOptionPane.showMessageDialog(null, "Khong tim thay ma khach hang can update");
            }
        }
    }

    public void actionSearch(ActionEvent e) {
        String a[] = txtSearch.getText().split("");
        int dem = 0;
        String string = "";
        for (int i = 0; i < this.alist.list.size(); i++) {
            String b[] = this.alist.list.get(i).maKhachHang.split("");
            for (int j = 0; j < a.length; j++) {
                if (a[j].equals(b[j])) {
                    dem += 1;
                }
            }
            if (dem == a.length) {
                string += this.alist.list.get(i).toString() +"\n";
                
                dem = 0;
            }
        }
        
        txt1.setText(string);
        if (txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Kiem tra lai ma khach hang");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String evt = ((JButton) e.getSource()).getText();
        if (evt.equals("ADD")) {
            actionAdd(e);
        } else if (evt.equals("DELETE")) {
            actionDel(e);
        } else if (evt.equals("UPDATE")) {
            actionUp(e);
        } else if (evt.equals("SEARCH")) {
            actionSearch(e);
        }
    }

}
