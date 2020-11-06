package phone_application;

public abstract class Phone implements IPhoneOperations {
    public Color color;
    private Material material;
    private int batteryLife;
    private Contacts contacts;
    private String model;
    private Manufacturer manufacturer;
    private String phoneNumber;

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public Phone() throws Exception {
        boolean exist = false;
        for (PhoneType phoneType : PhoneType.values()) {
            if (phoneType.name() == this.toString()) {
                exist = true;
            }
        }
        if (!exist){
            throw new Exception("invalid enum");
        }
    }

    public String toString(){
        return "Phone";
    }

    public Contacts addContact(int contactId, String phoneNumber, String firstName, String lastName){
        //Contacts firstContact = new Contacts(contactId, phoneNumber, firstName, lastName);
        //return fistContact
        //access them dynamically
        return new Contacts(contactId, phoneNumber, firstName, lastName);
    }
    public void listContacts(Contacts contacts){
        //below works as well
        //Contacts firstContact = addContact(1,"0745", "Pop", "Adina");
        //Contacts secondContact = addContact(2,"0746", "Pop", "Anca");
        System.out.println (contacts);
    }

    @Override
    public void sendMessage(String phoneNumber, Message message) {
        this.batteryLife = this.batteryLife - 1;
        System.out.println ("Send " + message.getText() + " to " + phoneNumber );
    }

    @Override
    public String call(String phoneNumber) {
        this.batteryLife = this.batteryLife - 2;
        return "Call " + phoneNumber ;

    }

    @Override
    public void viewHistory(String history1, String history2) {
        System.out.println("History");
        System.out.println(history1);
        System.out.println(history2);
    }
}