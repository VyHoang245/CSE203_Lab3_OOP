/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hrmanagement;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class FullTimeEmployee extends Employee {
    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(float salary, String id, String name, int yearOfBirth, String address, String phone) {
        super(id, name, yearOfBirth, address, phone);
        this.salary = salary;
    }

    public FullTimeEmployee(float salary) {
        this.salary = salary;
    }
    
    @Override
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Salary: ");
        salary = sc.nextInt();
    }
    @Override
    public void GetInfo() {
        System.out.print("Employee Id: "+super.getId()+" _ ");
        System.out.print("Employee name: "+super.getName()+" _ ");
        System.out.print("Year of birth: "+super.getYearOfBirth()+" _ ");
        System.out.print("Address: "+super.getAddress()+" _ ");
        System.out.print("Phone number: "+super.getPhone()+" _ ");
        System.out.println("Payment: "+salary+" _ ");
        
    }

    @Override
    public float getPayment() {
        return salary;
    }
    
}
