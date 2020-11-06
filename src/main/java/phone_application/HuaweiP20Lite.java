package phone_application;

public class HuaweiP20Lite extends Phone {

    public HuaweiP20Lite() throws Exception {
    }
    public String toString(){
        return "HuaweiP20Lite";
    }
    public static void main(String[] args) throws Exception {
       HuaweiP20Lite huaweiP20Lite = new HuaweiP20Lite();
       Contacts firstContact = huaweiP20Lite.addContact(1, "0758963245", "Pop", "Vlad");
       huaweiP20Lite.listContacts(firstContact);
       Contacts secondContact = huaweiP20Lite.addContact(2, "0748964512", "Pop", "Andreea");
       huaweiP20Lite.listContacts(secondContact);
       huaweiP20Lite.setBatteryLife(15);
       System.out.println(huaweiP20Lite.getBatteryLife());
        Message message = new Message();
        message.setText("Ciao");
        huaweiP20Lite.sendMessage(firstContact.getPhoneNumber(), message);
        System.out.println("Batterylife has " + huaweiP20Lite.getBatteryLife()  + " hours");
        message.setText("Hi");
        huaweiP20Lite.sendMessage(secondContact.getPhoneNumber(), message);
        System.out.println("Batterylife has " + huaweiP20Lite.getBatteryLife()  + " hours");
        String call1 = huaweiP20Lite.call(firstContact.getPhoneNumber());
        System.out.print(call1 + System.lineSeparator());
        System.out.println("Batterylife has " + huaweiP20Lite.getBatteryLife()  + " hours");
        String call2 = huaweiP20Lite.call(secondContact.getPhoneNumber());
        System.out.print(call2 + System.lineSeparator());
        System.out.println("Batterylife has " + huaweiP20Lite.getBatteryLife()  + " hours");
        huaweiP20Lite.viewHistory(call1, call2);
    }

    }
