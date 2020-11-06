package phone_application;

public class Message {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        int maxLength = 499;

        if (text.length() > maxLength) {
            text = text.substring(0, maxLength);
        }

        this.text = text;
    }
    //this is just an example
    //public static void main (String[] args) {
    //just for testing if works
    //String text = "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello\n" +
    //"HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello\n" +
    //"HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello\n" +
    //"HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloH500";
    //System.out.println (text);
//}
}
