package mobilePhone_ArrayLists;

public class main {
    public static void main(String[] args) {

        contactsClass contactObject = new contactsClass("", "");
        mobilePhone_ArrayList object = new mobilePhone_ArrayList("" );
        object.addNewContact("Po-Po", "9-1-1");
        object.addNewContact("saim", "437-972-7695");
        object.findContactByName("saim");
        object.addNewContact("Damaged Lungs", "69696969");
        object.findContactByName("Damaged Lungs");
        System.out.println("----------------------------------------------");
        object.printAllContacts();



    }

}
