package ru.hromml.test.addbook;

public class ContactData {
    private final String contactname;
    private final String contactlastname;
    private final String contactmobile;
    private final String contactmail;

    public ContactData(String contactname, String contactlastname, String contactmobile, String contactmail) {
        this.contactname = contactname;
        this.contactlastname = contactlastname;
        this.contactmobile = contactmobile;
        this.contactmail = contactmail;
    }

    public String getContactname() {
        return contactname;
    }

    public String getContactlastname() {
        return contactlastname;
    }

    public String getContactmobile() {
        return contactmobile;
    }

    public String getContactmail() {
        return contactmail;
    }
}
