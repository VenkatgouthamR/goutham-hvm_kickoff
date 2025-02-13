package assetTypes;

public class MainFactory {
	public static void main(String[] args) {
		NotificationFactory notification = new NotificationFactory();
		
		Notification emailNotification = notification.createNotification("EMAIL");
		emailNotification.notifyUser();
		
		Notification smsNotification = notification.createNotification("SMS");
		smsNotification.notifyUser();
	}
}
