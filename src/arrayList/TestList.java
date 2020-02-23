package arrayList;

import Definition.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestList extends Person{
    Scanner scan = new Scanner(System.in);
    ArrayList<Person> list1 = new ArrayList<Person>();

    public TestList(String firstName, String lastName, String emailID) {
        super(firstName, lastName, emailID);
    }
    public TestList() {
        super();
    }
    int top = 0;
    Person p;
    public void addNewContact() {
        System.out.println("Enter first name ::");
        String m = scan.nextLine();
        System.out.println("Enter last name ::");
        String v = scan.nextLine();
        System.out.println("Enter emailId ::");
        String c = scan.nextLine();
        p = new Person(m,v,c);
        System.out.println("Enter phoneNumber ::");
        p.setPhoneNumber();
        list1.add(p);
        top++;
        Collections.sort(list1, Person.PersonNameComparator);
    }

    public void viewContacts() {
        for (int index = 0; index < top; index++) {
            System.out.print(index + 1 );
            list1.get(index).viewContact();
            if(list1.get(index).size >= 1){
                for (int j = 0; j < list1.get(index).size; j++) {
                    System.out.println("Phone Number " + (j+1) + " :: " + list1.get(index).phoneNumber.get(j));
                }
            }
            else {
                for (int j = 0; j < 1; j++) {
                    System.out.println("Phone Number :: " + list1.get(index).phoneNumber.get(j));
                }
            }
        }
    }

    public void searchContacts() {
        int f = 0;
        System.out.println("You can search for first names ::: ");
        String name = scan.nextLine();
        for (int index = 0; index < top; index++) {
            if ( name.equals(list1.get(index).getFirstName()) ) {
                System.out.print(index + 1 );
                list1.get(index).viewContact();
                for (int j = 0; j < p.size; j++) {
                    System.out.println(list1.get(index).phoneNumber.get(j));
                }
                f = 0;
            }
            else {
                f = 1;
            }
        }
        if(f == 1) {
            System.out.println("contact not found");
        }
    }

    public void deleteContacts() {
        for (int index = 0; index < top; index++) {
            System.out.print(index + 1);
            System.out.println(list1.get(index).getFirstName() + " " + list1.get(index).getLastName());
        }
        System.out.println("Enter the no. of the contact you want to delete ::");
        int b = scan.nextInt();
        list1.remove(b - 1);
        top--;
    }
}
