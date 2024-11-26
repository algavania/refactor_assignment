package services;

public class NotificationService {

    public void sendNotification(String phoneNumber, String message) {
        System.out.println("Mengirim pesan ke " + phoneNumber + ": " + message);
    }
}
