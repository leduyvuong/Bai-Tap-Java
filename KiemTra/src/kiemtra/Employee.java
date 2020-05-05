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
abstract class Employee {
    String employeeId, name, gender, address, dateofbirth;
    int yearOfExperience;
    double allowance;
    long basic_salary = 1390000;

    public Employee() {
    }

    public Employee(String employeeId, String name, String gender, String address, double allowance) {
        this.employeeId = employeeId;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.allowance = allowance;
    }
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ID ");
        employeeId = in.nextLine();
        System.out.println("Nhap ten ");
        name = in.nextLine();
        System.out.println("Nhap gioi tinh ");
        gender = in.nextLine();
        System.out.println("Nhap dia chi ");
        address = in.nextLine();
        System.out.println("Nhap kinh nghiem ");
        yearOfExperience = in.nextInt();
        System.out.println("Nhap phu cap ");
        allowance = in.nextDouble();
    }
    public String toString(){
        return "Ten la :" + name +"ID la : " + employeeId +" gioi tinh la : " + gender + "dia chi la : " + address;
    }
    abstract double getSalary();
}
