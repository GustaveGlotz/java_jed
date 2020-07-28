package ru.jed.addressbook;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String workphone;
    private final String email;

    public ContactData(String firstname, String lastname, String workphone, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.workphone = workphone;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getWorkphone() {
        return workphone;
    }

    public String getEmail() {
        return email;
    }
}
