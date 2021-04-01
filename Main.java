package Exercise2;

public class Main {

	public static void main(String[] args) {
		
		Gadjet MobilePhone = new Gadjet(); //create new object as MobilePhone
		System.out.println("Storage: " + MobilePhone.Storage);
		System.out.println("Color:" + MobilePhone.Color);
		System.out.println("Weight:" + MobilePhone.Weight);
		System.out.println("Size:" + MobilePhone.Size);
		System.out.println("Battery:" + MobilePhone.Battery);
		MobilePhone.dialNumber();
		MobilePhone.startCall();
		MobilePhone.endCall();
		MobilePhone.takePicture();
		
		System.out.println("..............................");
		
		AccountBank CreditCard = new AccountBank(); // create second object as CreditCard
		System.out.println("AccountNumber:" + CreditCard.AccountHolder);
		System.out.println("AccountHolder:" + CreditCard.AccountHolder);
		System.out.println("BalanceAmount:" + CreditCard.BalanceAmount);
		CreditCard.withdrawMoney();
		CreditCard.depositMoney();
		CreditCard.showBalance();;

	}

}
