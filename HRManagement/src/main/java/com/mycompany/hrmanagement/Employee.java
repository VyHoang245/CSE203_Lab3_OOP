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
public abstract class Employee {
    Scanner sc = new Scanner(System.in);
    private String id;
    private String name;
    private int yearOfBirth;
    private String address;
    private String phone;

    public Employee(String id, String name, int yearOfBirth, String address, String phone) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void Input(){
        System.out.print("Employee Id: ");
        id = sc.next();
        System.out.print("Employee name: ");
        name = sc.next();
        System.out.print("Year of birth: ");
        yearOfBirth = sc.nextInt();
        System.out.print("Address: ");
        address = sc.next();
        System.out.print("Phone number: ");
        phone = sc.next();
    }
    public abstract void GetInfo();
    public abstract float getPayment();
    
}
