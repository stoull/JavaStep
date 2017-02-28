public class BankDemo{
	public static void main(String args[])
	{
		CheckingAccount currentAccount = new CheckingAccount(30258);
		System.out.println("The account :" + currentAccount.getNumber());
		System.out.println("Now deposit $500.00");
		currentAccount.deposit(500.00); 
		try
		{
			System.out.println("WithDrawing $100.0");
			currentAccount.withdraw(100.0);
			System.out.println("WithDrawing $ 600.0");
			currentAccount.withdraw(600.0);
		}catch (InsufficientFundsException exception)
		{
			System.out.println("Sorry, but you are short : $ " + exception.getAmount());
			exception.printStackTrace();
		}
	}
}
