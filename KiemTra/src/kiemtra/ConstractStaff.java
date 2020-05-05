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
public class ConstractStaff extends Employee{
    public int numberofworkingdays;

    public ConstractStaff() {
    }

    public ConstractStaff(String employeeId,int numberofworkingdays, String name, String gender, String address, int yearOfExperience,double allowance) {
        super(employeeId,name, gender, address,allowance);
        this.numberofworkingdays = numberofworkingdays;
    }
    
    @Override
    public void input() {
        super.input();
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so ngay lam viec ");
        numberofworkingdays = in.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "numberworking : " + numberofworkingdays +"so nam kinh nghiem : " + yearOfExperience;
    }

    @Override
    double getSalary() {
        return numberofworkingdays*(super.basic_salary*0.1)+super.allowance;
    }
    
}
