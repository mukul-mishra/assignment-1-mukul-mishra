package main;

import arrayList.TestList;
import menu.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu m1 = new Menu();
        TestList t2 = new TestList();
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nWelcome  to contacts menu \nenter 1 to add contact" + "\nenter 2 to view contacts" + "\nenter 3 to search contacts" + "\nenter 4 to delete cny contact" + "\nenter 5 to exit");
        m1.menu(sc.nextInt());
        String i = "y";
        while (i.equals("y")) {
            m1.menu(sc.nextInt());
            System.out.println("want to try more y/n?");
            sc.nextLine();
            i = sc.nextLine();
        }
    }
}
