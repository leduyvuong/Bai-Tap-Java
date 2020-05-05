/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtra;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Hi-XV
 */
public class GUI extends Frame implements ActionListener {

    private JTextField txtName, txtGender, txtAddress, txtEmployeeID, txtAllo, txtRate, txtNumberWorking, txtYearOfExp;
    private JFrame frm;
    private JLabel lbName, lbGender, lbAddress, lbEmployeeID, lbAllo, lbRate, lbNumberWorking, lbYearOfExp;
    private JButton btnAdd, btnDel;
    private JRadioButton radioPay, radioCons;
    private final Staff staff;
    private JPanel pn;

    public GUI() {
        createFrm();
        staff = new Staff();
    }

    public void createFrm() {

        frm = new JFrame();

        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
        pn = new JPanel();
        pn.setLayout(new GridLayout(10, 2));
        txtEmployeeID = new JTextField(10);
        lbEmployeeID = new JLabel("EmployeeID");
        pn.add(lbEmployeeID);
        pn.add(txtEmployeeID);

        txtName = new JTextField(10);
        lbName = new JLabel("Ten");
        pn.add(lbName);
        pn.add(txtName);

        txtGender = new JTextField(10);
        lbGender = new JLabel("Gioi Tinh");
        pn.add(lbGender);
        pn.add(txtGender);

        txtAddress = new JTextField(10);
        lbAddress = new JLabel("Dia Chi");
        pn.add(lbAddress);
        pn.add(txtAddress);

        txtYearOfExp = new JTextField(10);
        lbYearOfExp = new JLabel("Kinh Nghiem");
        pn.add(lbYearOfExp);
        pn.add(txtYearOfExp);

        txtAllo = new JTextField(10);
        lbAllo = new JLabel("Phu cap");
        pn.add(lbAllo);
        pn.add(txtAllo);

        radioPay = new JRadioButton("PayrollStaff");
        radioCons = new JRadioButton("ConstractStaff");
        pn.add(radioPay);
        pn.add(radioCons);

        txtRate = new JTextField(10);
        lbRate = new JLabel("Rate");
        pn.add(lbRate);
        pn.add(txtRate);

        txtNumberWorking = new JTextField(10);
        lbNumberWorking = new JLabel("NumberWorking");
        pn.add(lbNumberWorking);
        pn.add(txtNumberWorking);

        btnAdd = new JButton("ADD");
        btnDel = new JButton("DELETE");
        btnAdd.addActionListener(this);
        btnDel.addActionListener(this);
        pn.add(btnAdd);
        pn.add(btnDel);

        frm.add(pn);
        frm.pack();
    }

    public void xoa() {
        txtName.setText("");
        txtGender.setText("");
        txtEmployeeID.setText("");
        txtAddress.setText("");
        txtAllo.setText("");
        txtNumberWorking.setText("");
        txtYearOfExp.setText("");
        txtRate.setText("");
    }

    public void btnAddActiongListener(ActionEvent e) {
        Employee employee;
        String employeeID = txtEmployeeID.getText();
        String name = txtName.getText();
        String gender = txtGender.getText();
        String address = txtAddress.getText();
        double allowance = Double.parseDouble(txtAllo.getText());
        if (radioPay.isSelected()) {
            double rate;
            rate = Double.parseDouble(txtRate.getText());
            employee = new PayrollStaff(employeeID, rate, name, gender, address, allowance);
            radioPay.setSelected(false);
            xoa();
        } else {
            int numberofworkingdays = Integer.parseInt(txtNumberWorking.getText());
            int yearOfExp = Integer.parseInt(txtYearOfExp.getText());
            employee = new ConstractStaff(employeeID, numberofworkingdays, name, gender, address, yearOfExp, allowance);
            radioCons.setSelected(false);
            xoa();
        }
        this.staff.Add(employee);
    }

    public void btnDelActionListener(ActionEvent e) {
        String employid = txtEmployeeID.getText();
        this.staff.Delete(employid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tmp = ((JButton) e.getSource()).getText();
        if (tmp.equals("Them")) {
            btnAddActiongListener(e);
        }
        if (tmp.equals("Xoa")) {
            btnDelActionListener(e);
        }
    }

}
