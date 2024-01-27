/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hrmanagement;

import java.util.*;

/**
 *
 * @author Student
 */
public class HRManagement {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        ArrayList<FullTimeEmployee> fulltime = new ArrayList<FullTimeEmployee>();
        ArrayList<PartTimeEmployee> parttime = new ArrayList<PartTimeEmployee>();
        FullTimeEmployee a = new FullTimeEmployee(2000, "1", "as", 1990, "address", "phone");
        fulltime.add(a);
        FullTimeEmployee b = new FullTimeEmployee(3000, "2", "as", 1992, "address", "phone");
        fulltime.add(b);
        FullTimeEmployee c = new FullTimeEmployee(2000, "3", "as", 1992, "address", "phone");
        fulltime.add(c);
        do {
            System.out.print("1. Add Full-time Employee (ArrayList)\n"
                    + "2. Add Part-time Employee (ArrayList)\n"
                    + "3. Show all Full-time Employee\n"
                    + "4. Show all Part-time Employee\n"
                    + "5. Show all Employee\n"
                    + "6. Search Employee by Id\n"
                    + "7. Delete Employee by Id\n"
                    + "8. Edit Employee information by Id\n"
                    + "9. Search Employee by payment\n"
                    + "10. Sort Full-time Employee and Part-Time employee in ascending order by age, payment.\n"
                    + "11. Exit ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    AddFullTime(fulltime);
                    break;
                case 2:
                    AddPartTime(parttime);
                    break;
                case 3:
                    ShowFull(fulltime);
                    break;
                case 4:
                    ShowPart(parttime);
                    break;
                case 5:
                    ShowFull(fulltime);
                    ShowPart(parttime);
                    break;
                case 6:
                    SearchById(fulltime, parttime);
                    break;
                case 7:
                    DeleteById(fulltime, parttime);
                    break;
                case 8:
                    EditById(fulltime, parttime);
                    break;
                case 9:
                    SearchByPayment(fulltime, parttime);
                    break;
                case 10:
                    SortAscendingByAgePayment(fulltime, parttime);
                    break;
            }
        } while (n != 11);
    }

    public static void AddFullTime(ArrayList<FullTimeEmployee> fulltime) {

        System.out.print("Number of full-time employee: ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            FullTimeEmployee a = new FullTimeEmployee();
            a.Input();
            fulltime.add(a);
        }
    }

    public static void AddPartTime(ArrayList<PartTimeEmployee> parttime) {

        System.out.print("Number of part-time employee: ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            PartTimeEmployee a = new PartTimeEmployee();
            a.Input();
            parttime.add(a);
        }
    }

    public static void ShowFull(ArrayList<FullTimeEmployee> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).GetInfo();
        }
    }

    public static void ShowPart(ArrayList<PartTimeEmployee> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).GetInfo();
        }
    }

    public static void SearchById(ArrayList<FullTimeEmployee> fulltime, ArrayList<PartTimeEmployee> parttime) {
        System.out.print("Id: ");
        String id = sc.next();
        boolean flag = false;
        for (int i = 0; i < fulltime.size(); i++) {
            if (id.equals(fulltime.get(i).getId())) {
                fulltime.get(i).GetInfo();
                flag = true;
            }
        }
        for (int i = 0; i < parttime.size(); i++) {
            if (id.equals(parttime.get(i).getId())) {
                parttime.get(i).GetInfo();
                flag = true;
            }
        }
        if (!flag) {
            System.out.print("There is none of employee who has Id " + id);
        }
    }

    public static void DeleteById(ArrayList<FullTimeEmployee> fulltime, ArrayList<PartTimeEmployee> parttime) {
        System.out.print("Id: ");
        String id = sc.next();
        boolean flag = false;
        for (int i = 0; i < fulltime.size(); i++) {
            if (id.equals(fulltime.get(i).getId())) {
                fulltime.remove(i);
                flag = true;
            }
        }
        for (int i = 0; i < parttime.size(); i++) {
            if (id.equals(parttime.get(i).getId())) {
                parttime.remove(i);
                flag = true;
            }
        }
        if (!flag) {
            System.out.print("There is none of employee who has Id " + id);
        }
    }

    public static void SearchByPayment(ArrayList<FullTimeEmployee> fulltime, ArrayList<PartTimeEmployee> parttime) {
        System.out.print("A range of payment: from ");
        float min = sc.nextFloat();
        System.out.print("To: ");
        float max = sc.nextFloat();
        boolean flag = false;
        for (int i = 0; i < fulltime.size(); i++) {
            if (fulltime.get(i).getPayment() >= min && fulltime.get(i).getPayment() <= max) {
                fulltime.get(i).GetInfo();
                flag = true;
            }
        }
        for (int i = 0; i < parttime.size(); i++) {
            if (parttime.get(i).getPayment() >= min && parttime.get(i).getPayment() <= max) {
                parttime.get(i).GetInfo();
                flag = true;
            }
        }
        if (!flag) {
            System.out.print("There is none of employee who has payment in a range between " + min + " and " + max);
        }
    }

    public static void EditById(ArrayList<FullTimeEmployee> fulltime, ArrayList<PartTimeEmployee> parttime) {
        System.out.print("Id: ");
        String id = sc.next();
        boolean flag = false;
        for (int i = 0; i < fulltime.size(); i++) {
            if (id.equals(fulltime.get(i).getId())) {
                System.out.print("1. Edit name\n"
                        + "2. Edit Year of birth\n"
                        + "3. Edit Address\n"
                        + "4. Edit Phone number\n"
                        + "5. Edit salary\n"
                        + "6. Exit\n");
                int option = 0;
                while (option != 6) {
                    option = sc.nextInt();
                    switch (option) {
                        case 1:
                            fulltime.get(i).setName(sc.next());
                            break;
                        case 2:
                            fulltime.get(i).setYearOfBirth(sc.nextInt());
                            break;
                        case 3:
                            fulltime.get(i).setAddress(sc.next());
                            break;
                        case 4:
                            fulltime.get(i).setPhone(sc.next());
                            break;
                        case 5:
                            fulltime.get(i).setSalary(sc.nextFloat());
                            break;
                    }
                }
                flag = true;
            }
        }
        for (int i = 0; i < parttime.size(); i++) {
            if (id.equals(parttime.get(i).getId())) {
                System.out.print("1. Edit name\n"
                        + "2. Edit Year of birth\n"
                        + "3. Edit Address\n"
                        + "4. Edit Phone number\n"
                        + "5. Edit salary\n"
                        + "6. Exit\n");
                int option = 0;
                while (option != 6) {
                    option = sc.nextInt();
                    switch (option) {
                        case 1:
                            fulltime.get(i).setName(sc.next());
                            break;
                        case 2:
                            fulltime.get(i).setYearOfBirth(sc.nextInt());
                            break;
                        case 3:
                            fulltime.get(i).setAddress(sc.next());
                            break;
                        case 4:
                            fulltime.get(i).setPhone(sc.next());
                            break;
                        case 5:
                            fulltime.get(i).setSalary(sc.nextFloat());
                            break;
                    }
                }
                flag = true;
            }
            if (!flag) {
                System.out.print("There is none of employee who has Id " + id);
            }
        }
    }

    public static void SortAscendingByAgePayment(ArrayList<FullTimeEmployee> fulltime, ArrayList<PartTimeEmployee> parttime) {
        Comparator<Employee> com = new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.getYearOfBirth() > e2.getYearOfBirth()) {
                    return -1;
                } else {
                    if (e1.getYearOfBirth() == e2.getYearOfBirth()) {
                        if (e1.getPayment() < e2.getPayment()) {
                            return -1;
                        } else if (e1.getPayment() > e2.getPayment()) {
                            return 1;
                        } else {
                            return 0;
                        }

                    } else {
                        return 1;
                    }
                }
            }
        };
        fulltime.sort(com);
        parttime.sort(com);
    }
}
