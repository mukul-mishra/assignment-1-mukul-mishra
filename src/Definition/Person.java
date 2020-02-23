package Definition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Person implements Comparable<Person> {
    Scanner sc = new Scanner(System.in);
    public String firstName;
    public String lastName;
    public String  emailID;
    public ArrayList<String> phoneNumber = new ArrayList<String>();
    public int size = 0;
    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailID() {
        return emailID;
    }

    public Person(String firstName, String lastName, String emailID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
    }
    public void setPhoneNumber() {
        String i = "y";
        while(i.equals("y")) {
            phoneNumber.add(sc.nextLine());
            size++;
            System.out.println("want to add another number y/n?");
            i = sc.nextLine();
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public void viewContact() {
        System.out.println("First Name : " + this.getFirstName());
        System.out.println("Last Name : " + this.getLastName());
        System.out.println("Email ID : " + this.getEmailID());
    }

    public static Comparator<Person> PersonNameComparator = new Comparator<Person>() {

        @Override
        public int compare(Person s1, Person s2) {
            String StudentName1 = s1.getFirstName().toUpperCase();
            String StudentName2 = s2.getFirstName().toUpperCase();
            return StudentName1.compareTo(StudentName2);
        }
    };

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
