/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cdstore;

import java.util.*;

/**
 *
 * @author Student
 */
public class CDStore {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<CD> list = new ArrayList<CD>();
        CD a = new CD("1", "game", "video", "Lost", 23000, 3);
        CD b = new CD("2", "movie", "video", "Minute", 2000, 5);
        CD c = new CD("3", "movie", "audio", "Her", 80000, 6);
        list.add(c);
        list.add(a);
        list.add(b);
        int number;
        do {
            System.out.print("1. Add CD (ArrayList)\n"
                    + "2. Search CD by CD title\n"
                    + "3. Search CDs by collection (game/movie/music)\n"
                    + "4. Search CDs by type (audio/video)\n"
                    + "5. Delete CD by CD Id\n"
                    + "6. Edit CD information by Id\n"
                    + "7. Display all CDs\n"
                    + "8. Sort the CD list ascending by year of release\n"
                    + "9. Exit");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    AddCD(list);
                    break;
                case 2:
                    System.out.print("Search CD: ");
                    String title = sc.next();
                    if(!SearchByTitle(list, title)){
                        System.out.print("There isn't any CD "+title);
                    }
                    break;
                case 3:
                    System.out.print("Search CD by collection: ");
                    String collection = sc.next();
                    SearchByClollection(list, collection);
                    break;
                case 4:
                    System.out.print("Search CD by type: ");
                    String type = sc.next();
                    SearchByType(list, type);
                    break;
                case 5:
                    System.out.print("Delete by DC Id: ");
                    String id = sc.next();
                    DeleteByCDid(list, id);
                    break;
                case 6:
                    System.out.print("Delete by DC Id: ");
                    String Id = sc.next();
                    EditByCDid(list, Id);
                    break;
                case 7:
                    DisplayAllCDs(list);
                    break;
                case 8:
                    sort(list);
                    DisplayAllCDs(list);
                    break;

            }

        } while (number != 9);

    }

    public static void AddCD(ArrayList<CD> list) {
        System.out.print("Number of CDs: ");
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            CD a = new CD();
        a.Input();
        list.add(a);
        }
    }

    public static boolean SearchByTitle(ArrayList<CD> list,String title) {
        for (int i = 0; i < list.size(); i++) {
            if (title.equals(list.get(i).getTitle())) {
                list.get(i).Output();
                return true;
            }
        }
        return false;
    }
    public static void SearchByClollection(ArrayList<CD> list,String collection) {
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (collection.equals(list.get(i).getCollection())) {
                list.get(i).Output();
                flag = true;
            }
        }
        if(flag){
            System.out.print("There is none of CDs in collection "+collection);
        }
    }
    public static void SearchByType(ArrayList<CD> list,String type) {
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (type.equals(list.get(i).getType())) {
                list.get(i).Output();
                flag = true;
            }
        }
        if(flag){
            System.out.print("There is none of CDs with type "+type);
        }
    }
    public static void DeleteByCDid(ArrayList<CD> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                list.remove(i);
                break;
            }
        }
    }
    public static void EditByCDid(ArrayList<CD> list,String id) {
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                list.get(i).Input();
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.print("There is none of CDs "+id);
        }
    }
    public static void DisplayAllCDs(ArrayList<CD> list){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).Output();
        }
    }
    public static void sort(ArrayList<CD> list){
        list.sort(new Comparator<CD>(){
            public int compare(CD cd1, CD cd2){
                return cd1.getYear()-cd2.getYear();
            }
            });
        }
    }

