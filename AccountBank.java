package Exercise2;

public class AccountBank {
	int AccountNumber;
	String AccountHolder = "Maimunah binti Salman";
	int BalanceAmount;
	
	void withdrawMoney() { //method@behaviour in CreditCard
		System.out.println("Enter your pin number");
	}
	
	void depositMoney() {
		System.out.println("You've successfully deposit your money.");
	}
	
	void showBalance() {
		int BalanceAmount = 1000;
		System.out.println("Your balance in your account is" + " " + BalanceAmount);
	}
}