package mobilePhone_ArrayLists;

public class contactsClass {
    private String name;
    private String phoneNumber;

    public contactsClass(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public contactsClass createContact(String name, String phoneNumber){
        return new contactsClass(name, phoneNumber);
    }
}
