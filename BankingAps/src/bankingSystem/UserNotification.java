package bankingSystem;

public class UserNotification implements Notification {

	@Override
	public String sms() {
		System.out.println("You got a sms from bank ");
		return "Credited : 200";
	}

	@Override
	public String mail() {
		System.out.println("You got a mail from Bank ");
		return "Your E-statment";
	}

}
