
public interface Account {

	public void deposit(int amount);

	public int getAccountNumber();

	public int getBalance();

	public void transferBalance(Account acc);

	public int withdraw(int amount);

}
