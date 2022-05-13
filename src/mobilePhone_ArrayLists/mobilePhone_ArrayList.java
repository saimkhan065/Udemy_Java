package mobilePhone_ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class mobilePhone_ArrayList{
    private String name;
    contactsClass object;
    private ArrayList<contactsClass> contactBook;
    Scanner input = new Scanner(System.in);


        public mobilePhone_ArrayList(String name) {
            this.name = name;
            this.contactBook = new ArrayList<contactsClass>();
        }

        public void addNewContact(String name, String phoneNumber){
            object = new contactsClass(name, phoneNumber);
           this.contactBook.add(object);

        }

        public void findContactByName(String name){
            for (int i=0 ; i< this.contactBook.size() ; i++){
                object = this.contactBook.get(i);
                if (object.getName().equals(name))
                    System.out.println("Record found at "+ this.contactBook.indexOf(object) + " Name : "+
                            contactBook.get(i).getName() + " Phone : "+ contactBook.get(i).getPhoneNumber());
            }


        }

        public void printAllContacts(){
            for (int i=0;i<contactBook.size();i++){
                System.out.println("Name :" + contactBook.get(i).getName()+" Phone : "+this.contactBook.get(i).getPhoneNumber());
            }
        }

        public void testGet(){
            for (int i=0; i< contactBook.size() ; i++)
                System.out.println(contactBook.get(i));
        }
}
