package Proxy_Accounting;

public class Customer {
	
	public void deposit(double input, IAccount account){
		account.deposit(input);
	}
	public void withdraw(double output, IAccount account){
		account.withdraw(output);
	}
	public void getBalance(IAccount account){
		account.getBalance();
	}
        
}