package bankingSystem;

public class WithdrawAndDeposit implements DepositNWithdraw {

	@Override
	public String Name() {
		System.out.println("Your Name Is :");
		return "Anuj";
	}

	@Override
	public int debit() {
		System.out.println("your withdraw Amount is : ");
		return 100;
	}

	@Override
	public int credit() {
		System.out.println("your deposit Amount is : ");
		return 200;
	}

}
