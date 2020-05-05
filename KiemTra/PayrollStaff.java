/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtra;

import java.util.Scanner;

/**
 *
 * @author Hi-XV
 */
public class PayrollStaff extends Employee{

    private double rate;

    public PayrollStaff() {
        
    }

    public PayrollStaff(String employeeId,double rate, String name, String gender, String address, double allowance) {
        super(employeeId,name, gender, address, allowance);
        this.rate = rate;
    }
    
    @Override
    public void input() {
        super.input();
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap rate ");
        rate = in.nextDouble();
        
    }

    @Override
    public String toString() {
        return super.toString() + "rate : " + rate;
    }

    @Override
    double getSalary() {
        return super.basic_salary*rate + super.allowance;
    }
    
}
