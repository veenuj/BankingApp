package bankingSystem;

public class PrintPassBook implements PassBook {

	@Override
	public String AccInfo() {
		System.out.println("Anuj");
		System.out.println("Meerut");		
		return "Name and Details";
	}

	@Override
	public int AccNum() {
		System.out.println("Your Account Number is ");
		return 233466;
	}

	@Override
	public int Bal() {
		System.out.println("your Account Balance is ");
		return 24502;
	}

}
