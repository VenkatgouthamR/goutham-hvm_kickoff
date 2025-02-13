package assetTypes;

public class NotificationFactory {
	public Notification createNotification(String type) {
		if(type.isEmpty() || type == null) {
			return null;
		}
		switch(type) {
		case "EMAIL":
			return new EmailNotification();
		case "SMS":
			return new SmsNotification();
		default:
			throw new IllegalArgumentException("Unknown notification type " + type);
		}
	}
}
