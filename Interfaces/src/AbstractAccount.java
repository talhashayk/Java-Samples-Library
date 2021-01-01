
public abstract class AbstractAccount implements Account{

	private final int accountNumber;
	private int balance;
	
	public AbstractAccount(int accountNumber) {
		this.accountNumber = accountNumber;
		balance = 0;
	}

	public void deposit(int amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Negative Amount");
		}
		balance += amount;
	}
	
	public int getAccountNumber() {
		return accountNumber;
		
	}

	public int getBalance() {
		return balance;
		
	}
	
	public void transferBalance(Account acc) {
		final int accBalance = acc.getBalance();
		if (accBalance < 0 ) {
			throw new IllegalArgumentException("Negative Balance");
		}
		if (this != acc) {
			deposit(acc.withdraw(accBalance));
		}
	}
	
	public void setBalance(int balance) { 
		this.balance = balance;
	}
	
}
