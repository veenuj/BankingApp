package bankingSystem;

import java.util.Scanner;



public class BankingApp {

	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter what do you want to open ");
		System.out.println("1: Print Pass Book");
		System.out.println("2: Deposite/Withdraw");
		System.out.println("3: Notification Alert");
		x=scanner.nextInt();
		scanner.nextLine();
		switch(x)
		{
		case 1: {
			PrintPassBook p = new PrintPassBook();
			System.out.println("____________________________________________________");

			System.out.println(p.AccInfo());
			System.out.println(p.AccNum());
			System.out.println(p.Bal());

			System.out.println("____________________________________________________");


		}
		case 2:
		{	int dw;
		WithdrawAndDeposit w = new WithdrawAndDeposit();
		System.out.println("____________________________________________________");
		System.out.println("Enter what do you want to do: ");
		System.out.println("1: Deposite");
		System.out.println("2: Withdraw");
		dw=scanner.nextInt();
		if(dw==1) {
			System.out.println("Hello "+w.Name());
			System.out.println(w.credit());
		}
		else { 
			System.out.println("Hello "+w.Name());
			System.out.println(w.debit());
		}


		System.out.println("____________________________________________________");


		}
		case 3:
		{	
			int mm;
			UserNotification n = new UserNotification();
			System.out.println("____________________________________________________");
			System.out.println("Enter Where you want notification: ");
			System.out.println("1: Mobile");
			System.out.println("2: Mail");
			mm=scanner.nextInt();
			if(mm==1) {

				System.out.println(n.sms());
				}
			else System.out.println(n.mail());


			System.out.println("____________________________________________________");
		}

		}
		scanner.close();

	}

}
