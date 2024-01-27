/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hrmanagement;

/**
 *
 * @author Student
 */
public class PartTimeEmployee extends Employee {
    private int workingHour;
    private float payRate;

    public PartTimeEmployee() {
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }


    @Override
    public void Input(){
        super.Input();
        System.out.print("Working hours: ");
        workingHour = sc.nextInt();
        System.out.print("Pay Rate: ");
        payRate = sc.nextInt();
    }
    @Override
    public void GetInfo() {
        System.out.print("Employee Id: "+super.getId()+" _ ");
        System.out.print("Employee name: "+super.getName()+" _ ");
        System.out.print("Year of birth: "+super.getYearOfBirth()+" _ ");
        System.out.print("Address: "+super.getAddress()+" _ ");
        System.out.print("Phone number: "+super.getPhone()+" _ ");
        System.out.println("Payment: "+this.getPayment());
    }

    @Override
    public float getPayment() {
        return workingHour*payRate;
    }
}
