
public final class OverdraftAccount extends AbstractAccount{

	private final static int OVERDRAFT_CHARGE = 10;
	
	public OverdraftAccount(int accNum) {
		super(accNum);
	}

	public int withdraw(int amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Negative Amount");
		}
		
		final int newBalance = getBalance() - amount;
		
		if (newBalance < 0) {
			setBalance(newBalance - OVERDRAFT_CHARGE);
		} else {
			setBalance(newBalance);
		}
		
		return amount;
	}

}
