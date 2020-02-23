package menu;

import arrayList.TestList;

public class Menu {
    String d;
    int n;
    TestList t = new TestList();
    public void menu(int n) {
        switch(n) {

            case 1 :
                t.addNewContact();
                break;

            case 2 :
                t.viewContacts();
                break;

            case 3 :
                t.searchContacts();
                break;

            case 4 :
                t.deleteContacts();

            case 5 :
                System.out.println("thanks");
        }
    }
}
