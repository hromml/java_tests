package ru.hromml.test.addbook.model;

public class ContactData {
    private final String contactname;
    private final String contactlastname;
    private final String contactmobile;
    private final String contactmail;
    private final String contactgroup;

    public ContactData(String contactname, String contactlastname, String contactmobile, String contactmail, String contactgroup) {
        this.contactname = contactname;
        this.contactlastname = contactlastname;
        this.contactmobile = contactmobile;
        this.contactmail = contactmail;
        this.contactgroup = contactgroup;
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

    public String getContactGroup() {
        return contactgroup;
    }
}
