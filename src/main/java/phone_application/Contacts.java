package phone_application;

public class Contacts {
    private String firstname;
    private String lastname;
    private String phoneNumber;
    private int contactId;

    public Contacts (int contactId, String phoneNumber, String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.contactId= contactId;
    }

    public int getContactId() {
        return contactId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String toString(){
        return (getContactId() + " " + getPhoneNumber() + " " + getFirstname() + " " + getLastname());
    }
    public void displayContactDetails()
    {
        System.out.println (firstname + " " + lastname + " " + phoneNumber + " " + contactId);
    }


}
