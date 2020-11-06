package phone_application;

public interface IPhoneOperations {
    void sendMessage(String phoneNumber, Message message);
    String call(String phoneNumber);
    void listContacts(Contacts contacts);
    void viewHistory(String history1, String history2);

}
