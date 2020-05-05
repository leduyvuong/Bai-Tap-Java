/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtra;

import java.awt.BorderLayout;
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
public class TEST extends Frame implements ActionListener {

    private JTextField txtName, txtGender, txtAddress, txtEmployeeID, txtlbAllo, txtRate, txtNumberWorking, txtYearOfExp;
    private JButton btnAdd, btnDel;
    private JLabel lbName, lbGender, lbAddress, lbEmployeeID, lbAllo, lbRate, lbNumberWorking, lbYearOfExp;
    private JFrame frm;
    
    private JRadioButton radioPay;
    private JRadioButton radioCons;
    private Staff staff;
    private JPanel pn1;

    public TEST() {
        createGD();
        staff = new Staff();
    }

    public void createGD() {

        frm = new JFrame();
        setVisible(true);
        setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pn1 = new JPanel();
        pn1.setLayout(new GridLayout(10, 2));
        txtEmployeeID = new JTextField(10);
        lbEmployeeID = new JLabel("EmployeeID");
        pn1.add(lbEmployeeID);
        pn1.add(txtEmployeeID);

        txtName = new JTextField(10);
        lbName = new JLabel("Name");
        pn1.add(lbName);
        pn1.add(txtName);

        txtGender = new JTextField(10);
        lbGender = new JLabel("Gender");
        pn1.add(lbGender);
        pn1.add(txtGender);

        txtAddress = new JTextField(10);
        lbAddress = new JLabel("Address");
        pn1.add(lbAddress);
        pn1.add(txtAddress);

        txtYearOfExp = new JTextField(10);
        lbYearOfExp = new JLabel("YearOfExp");
        pn1.add(lbYearOfExp);
        pn1.add(txtYearOfExp);
        

        txtlbAllo = new JTextField(10);
        lbAllo = new JLabel("Allowance");
        pn1.add(lbAllo);
        pn1.add(txtlbAllo);

        radioPay = new JRadioButton("PayrollStaff");
        radioCons = new JRadioButton("ConstractStaff");
        pn1.add(radioPay);
        pn1.add(radioCons);

        txtRate = new JTextField(10);
        lbRate = new JLabel("Rate");
        pn1.add(lbRate);
        pn1.add(txtRate);

        txtNumberWorking = new JTextField(10);
        lbNumberWorking = new JLabel("NumberWorking");
        pn1.add(lbNumberWorking);
        pn1.add(txtNumberWorking);

        btnAdd = new JButton("ADD");
        btnDel = new JButton("DELETE");
        btnAdd.addActionListener(this); pn1.add(btnAdd); 
        pn1.add(btnDel);
        
        add(pn1);
        pack();
    }

    public void actionPerformed(ActionEvent e) {
        Employee employee;
        String tmp = ((JButton) e.getSource()).getText();
        String employeeID = txtEmployeeID.getText();
        String name = txtName.getText();
        String gender = txtGender.getText();
        double allowance = Double.parseDouble(txtlbAllo.getText());
        if (tmp.equals("ADD")) {
            if (radioPay.isSelected()) {
                double rate = Double.parseDouble(txtRate.getText());
                employee = new PayrollStaff(rate, name, gender, gender);
            } else {
                int numberofworkingdays = Integer.parseInt(txtNumberWorking.getText());
                int yearOfExp = Integer.parseInt(txtYearOfExp.getText());
                employee = new ConstractStaff(numberofworkingdays, name, gender, gender, yearOfExp);
            }
            this.staff.Add(employee);
        }

    }

}
