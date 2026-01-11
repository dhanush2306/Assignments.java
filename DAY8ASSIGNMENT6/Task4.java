package DAY8ASSIGNMENT6;
class Notification {
    void send() {
        System.out.println("Sending notification");
    }
}


class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending SMS Notification");
    }
}


public class Task4 {
    public static void main(String[] args) {

     
        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();

        n1.send();  
        n2.send();  
    }
}