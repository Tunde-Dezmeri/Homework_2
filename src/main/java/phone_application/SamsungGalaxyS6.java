package phone_application;

public class SamsungGalaxyS6 extends Phone {

    public SamsungGalaxyS6() throws Exception {

    }
    public String toString(){
        return "SamsungGalaxyS6";
    }
    public static void main(String[] args) throws Exception {
        SamsungGalaxyS6 samsungGalaxyS6 = new SamsungGalaxyS6();
        Contacts firstContact = samsungGalaxyS6.addContact(1,"0745197152", "Dezmeri", "Tunde");
        samsungGalaxyS6.listContacts(firstContact);
        Contacts secondContact = samsungGalaxyS6.addContact(2,"0746836915", "Pop", "Anca");
        samsungGalaxyS6.listContacts(secondContact);
        //set batterylife for each action below
        samsungGalaxyS6.setBatteryLife(10);
        System.out.println(samsungGalaxyS6.getBatteryLife());
        Message message = new Message();
        message.setText("Hello");
        samsungGalaxyS6.sendMessage(firstContact.getPhoneNumber(), message);
        System.out.println("Batterylife has " + samsungGalaxyS6.getBatteryLife()  + " hours");
        message.setText("Hi");
        samsungGalaxyS6.sendMessage(secondContact.getPhoneNumber(), message);
        System.out.println("Batterylife has " + samsungGalaxyS6.getBatteryLife()  + " hours");
        String call1 = samsungGalaxyS6.call(firstContact.getPhoneNumber());
        System.out.print(call1 + System.lineSeparator());
        System.out.println("Batterylife has " + samsungGalaxyS6.getBatteryLife()  + " hours");
        String call2 = samsungGalaxyS6.call(secondContact.getPhoneNumber());
        System.out.print(call2 + System.lineSeparator());
        System.out.println("Batterylife has " + samsungGalaxyS6.getBatteryLife()  + " hours");
        samsungGalaxyS6.viewHistory(call1, call2);


    }

}
